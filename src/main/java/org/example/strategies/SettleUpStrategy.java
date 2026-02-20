package org.example.strategies;

import org.example.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenseToSettleUp);
}
