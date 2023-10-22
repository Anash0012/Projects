package com.Expense.Tracker.Service;

import com.Expense.Tracker.Model.AuthenticationToken;
import com.Expense.Tracker.Repo.AuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    AuthRepo authRepo;

    public boolean authenticate(String email, String token) {
        AuthenticationToken authenticationToken = authRepo.findFirstByToken(token);

        if(authenticationToken == null) {
            return  false;
        }
        String tokenConnectedEmail = authenticationToken.getUser().getEmail();

        return tokenConnectedEmail.equals(email);
    }
}
