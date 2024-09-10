package co.edu.unimonserrate.webproject.student.domain;

import co.edu.unimonserrate.webproject.student.domain.util.FieldUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentEmailTest {

  @Test
  void emailFormatIsValid() {
    // Arrange
    var email = "jdoe@unimonserrate.edu.co";

    // Act & Assert
    Assertions.assertTrue(FieldUtils.isEmailValid(email));
  }

  @Test
  void emailFormatIsInvalid() {
    // Arrange
    var email = "jdoe@unimonserrate.co.edu";

    // Act & Assert
    Assertions.assertFalse(FieldUtils.isEmailValid(email));
  }
}
