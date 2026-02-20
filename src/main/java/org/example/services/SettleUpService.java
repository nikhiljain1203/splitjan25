package org.example.services;

import org.example.models.Expense;
import org.example.models.ExpenseUser;
import org.example.models.User;
import org.example.repository.ExpenseUserRepo;
import org.example.repository.UserRepo;
import org.example.strategies.SettleUpStrategy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SettleUpService {
    private SettleUpStrategy settleUpStrategy;
    private UserRepo userRepo;
    private ExpenseUserRepo expenseUserRepo;

    public SettleUpService(SettleUpStrategy settleUpStrategy, UserRepo userRepo, ExpenseUserRepo expenseUserRepo) {
        this.settleUpStrategy = settleUpStrategy;
        this.userRepo = userRepo;
        this.expenseUserRepo = expenseUserRepo;
    }

    public List<Expense> settleUpUser(Long userID) {
        // Logic to settle up between users
        User user = userRepo.findById(userID).get();
        List<ExpenseUser> expenseUserList = expenseUserRepo.findAllByUser(user);

        List<Expense> expenseList = new ArrayList<>();
        for (ExpenseUser expenseUser : expenseUserList) {
            expenseList.add(expenseUser.getExpense());
        }

        List<Expense> settledUpExpenses = settleUpStrategy.settleUp(expenseList);
        return settledUpExpenses;
    }
}
