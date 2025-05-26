package com.oliwiatrojniak.saveapenny.income;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class Income {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private double price;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;

  public Income() {}

  public Income(String name, double price, LocalDate date) {
    this.name = name;
    this.price = price;
    this.date = date;
  }

  public Long getId()        { return id; }
  public String getName()    { return name; }
  public double getPrice()   { return price; }
  public LocalDate getDate() { return date; }

  public void setName(String name)     { this.name = name; }
  public void setPrice(double price)   { this.price = price; }
  public void setDate(LocalDate date)  { this.date = date; }
}
