package org.example.commands;

public interface Command {
    void execute(String input);
    boolean matches(String input);
}
