package com.oliwiatrojniak.saveapenny.expense;

import java.time.LocalDate;

public class ExpenseDto {
  private Long id;
  private String expense;
  private double amount;
  private LocalDate date;

  public ExpenseDto() {
  }

  public ExpenseDto(Long id, String expense, double amount, LocalDate date) {
    this.id = id;
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

  public double getAmount() {
    return amount;
  }

  public LocalDate getDate() {
    return date;
  }
}
