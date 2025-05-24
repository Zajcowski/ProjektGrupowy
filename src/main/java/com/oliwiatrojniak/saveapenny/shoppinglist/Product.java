package com.oliwiatrojniak.saveapenny.shoppinglist;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "product")
class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  String name;
  float price;
  int quantity;
  String category;

  public Product(String name, float price, int quantity, String category){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.category = category;
  }

  public Product(String name, float price, int quantity){
    this(name, price, quantity, null);
  }

  ProductDto convertToDto() {
    return new ProductDto(id, name, price, quantity, category);
  }

}
