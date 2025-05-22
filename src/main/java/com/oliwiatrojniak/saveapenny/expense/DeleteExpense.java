package com.oliwiatrojniak.saveapenny.expense;

public class DeleteExpense {
  private Long id;

  public DeleteExpense() {
  }

  public DeleteExpense(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }
}
