import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductService } from './services/product.service';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HttpClientModule, ProductListComponent], //Anguler ı kurarken ProductListComponent eklemiz gerekiyor. Yoksa <app-product-list></app-product-list> hata veriyor.
  providers: [ProductService],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angular-ecommerce';
}

