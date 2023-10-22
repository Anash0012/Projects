package com.Expense.Tracker.Repo;

import com.Expense.Tracker.Model.AuthenticationToken;
import com.Expense.Tracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByToken(String token);
    AuthenticationToken findFirstByUser(User user);

}
