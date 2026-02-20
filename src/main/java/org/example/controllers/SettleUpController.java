package org.example.controllers;

import org.example.models.Expense;
import org.example.models.dtos.SettleUpRequestDto;
import org.example.models.dtos.SettleUpResponseDto;
import org.example.services.SettleUpService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class SettleUpController {
    private SettleUpService settleUpService;

    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }
    public SettleUpResponseDto settleUpUser(SettleUpRequestDto settleUpRequestDto) {
        // Logic to settle up between users
        List<Expense> expenseList = settleUpService.settleUpUser(settleUpRequestDto.getUserId());
        SettleUpResponseDto settleUpResponseDto = new SettleUpResponseDto();
        settleUpResponseDto.setExpenses(expenseList);
        return settleUpResponseDto;
    }
}
