import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../common/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  //CREATE ANGULAR SERVICE: ng generate service services/product

  private baseUrl = "http://localhost:8080/api/products"

  constructor(private httpClient: HttpClient) { }

  getProductList(): Observable<Product[]> {
    return this.httpClient.get<Getresponse>(this.baseUrl).pipe(
      map(response => response._embedded.products)
    )
  }
}

interface Getresponse {
  _embedded: {
    products: Product[];
  }
}
