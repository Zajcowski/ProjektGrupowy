package com.oliwiatrojniak.saveapenny.expense;

import java.time.LocalDate;

public class AddExpense {
  private String expense;
  private double amount;
  private LocalDate date;

  public AddExpense() {
  }

  public AddExpense(String expense, double amount, LocalDate date) {
    this.expense = expense;
    this.amount = amount;
    this.date = date;
  }

  public String getExpense() {
    return expense;
  }

  public double getAmount() {
    return amount;
  }

  public LocalDate getDate() {
    return date;
  }
}
