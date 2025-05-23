package com.oliwiatrojniak.saveapenny.shoppinglist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AddProduct {

  String name;
  float price;
  int quantity;
  String category;

  public AddProduct(String name, float price, int quantity, String category){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.category = category;
  }

  public AddProduct(String name, float price, int quantity){
    this(name, price, quantity, null);
  }

}
