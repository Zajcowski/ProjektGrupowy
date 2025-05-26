package com.oliwiatrojniak.saveapenny.income;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IncomeService {

  private final IncomeRepository repository;

  public IncomeService(IncomeRepository repository) {
    this.repository = repository;
  }

  public IncomeDto addIncome(AddIncome request) {
    Income income = new Income(request.getName(), request.getPrice(), request.getDate());
    Income saved = repository.save(income);
    return mapToDto(saved);
  }

  public List<IncomeDto> showIncomes() {
    return repository.findAll().stream()
            .map(this::mapToDto)
            .collect(Collectors.toList());
  }

  public void deleteIncome(DeleteIncome request) {
    repository.deleteById(request.getId());
  }

  private IncomeDto mapToDto(Income income) {
    return new IncomeDto(income.getId(), income.getName(), income.getPrice(), income.getDate());
  }
}
