package com.oliwiatrojniak.saveapenny.income;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class AddIncome {
  private String name;
  private double price;
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;

  public AddIncome() {}

  public AddIncome(String name, double price, LocalDate date) {
    this.name = name;
    this.price = price;
    this.date = date;
  }

  public String getName()    { return name; }
  public double getPrice()   { return price; }
  public LocalDate getDate() { return date; }
}
