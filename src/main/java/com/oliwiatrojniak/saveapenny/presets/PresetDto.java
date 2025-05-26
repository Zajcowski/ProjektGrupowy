package com.oliwiatrojniak.saveapenny.presets;

public class PresetDto {

  long id;
  String name;
  float price;
  int quantity;
  String category;

  public PresetDto(long id, String name, float price, int quantity, String category) {
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
