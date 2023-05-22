import { Component } from '@angular/core';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing-page.component.html',
  styleUrls: ['./landing-page.component.css']
})
export class LandingPageComponent  {
  products = [
  {
    name: 'Product 1',
    description: 'This is the description of Product 1',
    price: 10.99,
    image: 'path/to/product1.jpg'
  },
  {
    name: 'Product 2',
    description: 'This is the description of Product 2',
    price: 19.99,
    image: 'path/to/product2.jpg'
  },
  {
    name: 'Product 3',
    description: 'This is the description of Product 3',
    price: 29.99,
    image: 'path/to/product3.jpg'
  }
];
}
