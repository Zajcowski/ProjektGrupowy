package com.oliwiatrojniak.saveapenny.presets;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AddPreset {

  String name;
  float price;
  int quantity;
  String category;

  public AddPreset(String name, float price, int quantity, String category){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.category = category;
  }

  public AddPreset(String name, float price, int quantity){
    this(name, price, quantity, null);
  }

}
