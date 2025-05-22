package com.oliwiatrojniak.saveapenny.expense;

public class ExpenseDto {
  private Long id;
  private String expense;
  private double amount;

  public ExpenseDto() {
  }

  public ExpenseDto(Long id, String expense, double amount) {
    this.id = id;
    this.expense = expense;
    this.amount = amount;
  }

  public Long getId() {
    return id;
  }

  public String getExpense() {
    return expense;
  }

  public double getAmount() {
    return amount;
  }
}
