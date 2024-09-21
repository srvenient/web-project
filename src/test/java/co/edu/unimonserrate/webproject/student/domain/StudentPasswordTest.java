package co.edu.unimonserrate.webproject.student.domain;

import co.edu.unimonserrate.webproject.student.domain.util.FieldUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentPasswordTest {

  @Test
  void passwordMustNotBeBlank() {
    // Arrange
    var fullName = "John Doe";
    var email = "jdoe@unimonserrate.edu.co";
    var phone = "1234567890";
    var password = "";
    var termsAndConditions = true;

    // Act & Assert
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Student(fullName, email, phone, password, termsAndConditions));
  }

  @Test
  void passwordMustHaveAtLeast8Characters() {
    // Arrange
    var id = java.util.UUID.randomUUID();
    var fullName = "John Doe";
    var email = "jdoe@unimonserrate.edu.co";
    var password = "1234567";

    // Act & Assert
    Assertions.assertFalse(FieldUtils.isPasswordValid(password));
  }
}
