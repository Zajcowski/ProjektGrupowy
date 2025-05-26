package com.oliwiatrojniak.saveapenny.expense;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String expense;

  private double amount;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;

  public Expense() {
  }

  public Expense(String expense, double amount, LocalDate date) {
    this.expense = expense;
    this.amount = amount;
    this.date = date;
  }

  public Long getId() {
    return id;
  }

  public String getExpense() {
    return expense;
  }

  public void setExpense(String expense) {
    this.expense = expense;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}
