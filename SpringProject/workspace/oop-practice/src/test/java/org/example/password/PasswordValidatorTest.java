package org.example.password;

import org.example.password.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
 * 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {
    @DisplayName("비밀번호는 최소 8자 이상 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertThatCode(() -> passwordValidator.validate("serverwizard")).doesNotThrowAnyException();
    }

    @DisplayName("비밀번호는 최소 8자 이상 12자 이하면 예외가 발생하지 않는다.")
    @ParameterizedTest
    @ValueSource(strings = {"aaaabbb","aassddffrreew"})
    void validatePasswordTest2() {
        PasswordValidator passwordValidator = new PasswordValidator();
        assertThatCode(() -> passwordValidator.validate("aabb")).isInstanceOf(IllegalAccessException.class).hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
