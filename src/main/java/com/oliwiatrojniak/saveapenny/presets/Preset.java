package com.oliwiatrojniak.saveapenny.presets;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "preset")
public class Preset {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;
  String name;
  float price;
  int quantity;
  String category;

  public Preset(String name, float price, int quantity, String category){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
    this.category = category;
  }

  public Preset(String name, float price, int quantity){
    this(name, price, quantity, null);
  }

  PresetDto convertToDto() {
    return new PresetDto(id, name, price, quantity, category);
  }

}
