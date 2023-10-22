package com.Expense.Tracker.Repo;

import com.Expense.Tracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findFirstByEmail(String newEmail);
}
