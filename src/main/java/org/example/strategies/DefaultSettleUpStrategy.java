package org.example.strategies;

import org.example.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DefaultSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Expense> settleUp(List<Expense> expenseToSettleUp) {
        // This is a default implementation that simply returns the list of expenses to settle up without any modifications.
        return expenseToSettleUp;
    }
}
