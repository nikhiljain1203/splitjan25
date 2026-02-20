package org.example.models.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.models.Expense;

import java.util.List;

@Getter
@Setter
public class SettleUpResponseDto {
    private List<Expense> expenses;
}
