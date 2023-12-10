package org.example;

public class CorrectPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "aaaabbbbcc";
    }
}