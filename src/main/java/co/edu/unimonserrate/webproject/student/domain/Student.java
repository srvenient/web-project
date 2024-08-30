package co.edu.unimonserrate.webproject.student.domain;

import co.edu.unimonserrate.webproject.student.domain.util.FieldUtils;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public final class Student {
  private final @NotNull UUID id;

  private final @NotNull String fullName;
  private final @NotNull String email;
  private final @NotNull String password;

  public Student(
    final @NotNull UUID id,
    final @NotNull String fullName,
    final @NotNull String email,
    final @NotNull String password
  ) {
    this.id = id;
    this.fullName = fullName;

    if (!FieldUtils.isPasswordValid(password)) {
      throw new IllegalArgumentException("Password must have at least 8 characters");
    }
    if (!FieldUtils.isEmailValid(email)) {
      throw new IllegalArgumentException("Email format is invalid");
    }

    this.email = email;
    this.password = password;
  }

  public @NotNull UUID id() {
    return this.id;
  }

  public @NotNull String fullName() {
    return this.fullName;
  }

  public @NotNull String email() {
    return this.email;
  }

  public @NotNull String password() {
    return this.password;
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    final Student student = (Student) obj;
    return this.id.equals(student.id);
  }

  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", fullName='" + fullName + '\'' +
      ", email='" + email + '\'' +
      ", password='" + password + '\'' +
      '}';
  }
}
