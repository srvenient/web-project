package co.edu.unimonserrate.webproject.student.domain.util;

import org.jetbrains.annotations.NotNull;

/**
 * This class contains utility methods for the domain layer.
 */
public final class FieldUtils {
  private FieldUtils() {
    throw new UnsupportedOperationException("This class cannot be instantiated");
  }

  /**
   * This method checks if a password is valid.
   *
   * @param password the password to check
   * @return {@code true} if the password is valid, {@code false} otherwise
   */
  public static boolean isPasswordValid(final @NotNull String password) {
    return password.length() >= 8;
  }

  /**
   * This method checks if an email is valid.
   *
   * @param email the email to check
   * @return {@code true} if the email is valid, {@code false} otherwise
   */
  public static boolean isEmailValid(final @NotNull String email) {
    return email.matches("^[A-Za-z0-9._%+-]+@unimonserrate\\.edu\\.co$");
  }
}
