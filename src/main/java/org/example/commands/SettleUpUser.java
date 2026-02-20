package org.example.commands;

import org.example.controllers.SettleUpController;
import org.example.models.dtos.SettleUpRequestDto;
import org.example.models.dtos.SettleUpResponseDto;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SettleUpUser implements Command {

    private SettleUpController settleUpController;

    public SettleUpUser(SettleUpController settleUpController) {
        this.settleUpController = settleUpController;
    }

    @Override
    public void execute(String input) {
        List<String> inputParts = Arrays.asList(input.split(" "));
        Long userId = Long.parseLong(inputParts.get(0));
        // Create a SettleUpRequestDto and call the controller method
        SettleUpRequestDto settleUpRequestDto = new SettleUpRequestDto();
        settleUpRequestDto.setUserId(userId);

        SettleUpResponseDto responseDto =
                settleUpController.settleUpUser(settleUpRequestDto);
        System.out.println("Settled up with user ID: " + userId);

    }

    @Override
    public boolean matches(String input) {
        // U1 SettleUp .......
        // Implementation for settling up with a user
        List<String> inputParts = Arrays.asList(input.split(" "));
        if(inputParts.size() >= 2
                && inputParts.get(1).equalsIgnoreCase("settleup")) {
            return true;
        } else {
            System.out.println("Invalid command format. Usage: settleup " + input);
        }
        return false;
    }

}
