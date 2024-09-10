package co.edu.unimonserrate.webproject.student.domain.util;

import org.jetbrains.annotations.NotNull;

public final class FieldUtils {
  private FieldUtils() {
    throw new UnsupportedOperationException("This class cannot be instantiated");
  }

  public static boolean isPasswordValid(final @NotNull String password) {
    return password.length() >= 8;
  }

  public static boolean isEmailValid(final @NotNull String email) {
    return email.matches("^[A-Za-z0-9._%+-]+@unimonserrate\\.edu\\.co$");
  }
}
