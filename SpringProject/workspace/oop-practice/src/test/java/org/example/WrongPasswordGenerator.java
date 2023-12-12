package org.example;

import org.example.password.PasswordGenerator;

public class WrongPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "aa";
    }
}