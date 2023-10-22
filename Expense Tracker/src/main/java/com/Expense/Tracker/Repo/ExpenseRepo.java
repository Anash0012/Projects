package com.Expense.Tracker.Repo;


import com.Expense.Tracker.Model.Expense;
import com.Expense.Tracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepo extends JpaRepository<Expense,Long> {
    List<Expense> findAllByUserAndDate(User user, LocalDate date);
    List<Expense> findAllByUserAndDateBetween(User user, LocalDate startDate, LocalDate endDate);

}