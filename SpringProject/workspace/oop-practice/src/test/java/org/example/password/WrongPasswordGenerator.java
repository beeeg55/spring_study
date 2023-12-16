package org.example.password;

import org.example.password.PasswordGenerator;

public class WrongPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "aa";
    }
}