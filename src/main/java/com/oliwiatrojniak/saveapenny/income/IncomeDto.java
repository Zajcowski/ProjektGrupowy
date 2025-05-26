package com.oliwiatrojniak.saveapenny.income;

import java.time.LocalDate;

public class IncomeDto {
  private Long id;
  private String name;
  private double price;
  private LocalDate date;

  public IncomeDto() {}

  public IncomeDto(Long id, String name, double price, LocalDate date) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.date = date;
  }

  public Long getId()        { return id; }
  public String getName()    { return name; }
  public double getPrice()   { return price; }
  public LocalDate getDate() { return date; }
}
