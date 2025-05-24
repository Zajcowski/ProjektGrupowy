package com.oliwiatrojniak.saveapenny.shoppinglist;

public class ProductDto {

  long id;
  String name;
  float price;
  int quantity;
  String category;

  public ProductDto(long id, String name, float price, int quantity, String category) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.category = category;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public float getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getCategory() {
    return category;
  }

}
