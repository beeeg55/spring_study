package org.example;

import org.example.password.PasswordGenerator;

public class CorrectPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "aaaabbbbcc";
    }
}