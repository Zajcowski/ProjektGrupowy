package com.oliwiatrojniak.saveapenny.expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

  private final ExpenseService service;

  @Autowired
  public ExpenseController(ExpenseService service) {
    this.service = service;
  }

  @PostMapping("/add")
  public ExpenseDto addExpense(@RequestBody AddExpense addExpense) {
    return service.addExpense(addExpense);
  }

  @GetMapping("/")
  public List<ExpenseDto> showExpenses() {
    return service.showExpenses();
  }

  @DeleteMapping("/delete/{id}")
  public void deleteExpense(@PathVariable Long id) {
    service.deleteExpense(new DeleteExpense(id));
  }

  @GetMapping("/{id}")
  public ExpenseDto findExpense(@PathVariable Long id) {
    return service.findExpense(id);
  }
}
