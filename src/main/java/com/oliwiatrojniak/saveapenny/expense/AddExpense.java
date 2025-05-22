package com.oliwiatrojniak.saveapenny.expense;

public class AddExpense {
  private String expense;
  private double amount;

  public AddExpense() {
  }

  public AddExpense(String expense, double amount) {
    this.expense = expense;
    this.amount = amount;
  }

  public String getExpense() {
    return expense;
  }

  public double getAmount() {
    return amount;
  }
}

