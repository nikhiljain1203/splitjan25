package org.example;

import org.example.commands.CommandExecutor;
import org.example.commands.SettleUpUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitJan25Application implements CommandLineRunner {

    private CommandExecutor commandExecutor;
    private Scanner scanner;

    public static void main(String[] args) {
        SpringApplication.run(SplitJan25Application.class, args);
    }

    public SplitJan25Application(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world");
        scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine();
            commandExecutor.execute(input);
        }
    }
}
