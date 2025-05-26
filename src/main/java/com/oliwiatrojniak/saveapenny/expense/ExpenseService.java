package com.oliwiatrojniak.saveapenny.expense;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpenseService {

  private final ExpenseRepository repository;

  public ExpenseService(ExpenseRepository repository) {
    this.repository = repository;
  }

  public ExpenseDto addExpense(AddExpense request) {
    Expense expense = new Expense(request.getExpense(), request.getAmount(), request.getDate());
    Expense saved = repository.save(expense);
    return mapToDto(saved);
  }

  public List<ExpenseDto> showExpenses() {
    return repository.findAll().stream()
            .map(this::mapToDto)
            .collect(Collectors.toList());
  }

  public void deleteExpense(DeleteExpense request) {
    repository.deleteById(request.getId());
  }

  public ExpenseDto findExpense(Long id) {
    Expense expense = repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Expense not found"));
    return mapToDto(expense);
  }

  private ExpenseDto mapToDto(Expense expense) {
    return new ExpenseDto(expense.getId(), expense.getExpense(), expense.getAmount(), expense.getDate());
  }
}
