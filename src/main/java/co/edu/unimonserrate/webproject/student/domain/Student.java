package co.edu.unimonserrate.webproject.student.domain;

import co.edu.unimonserrate.webproject.student.domain.util.FieldUtils;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Entity
@Table(name = "students")
public final class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @NotNull UUID id;

  @Column(name = "full_name")
  private String fullName;
  @Column
  private String email;
  @Column
  private String phone;
  @Column
  private String password;
  @Column(name = "terms_and_conditions")
  private boolean termsAndConditions;

  public Student() {
  }

  public Student(final @NotNull String email) {
    this.email = email;
  }

  public Student(final @NotNull String email, final @NotNull String password) {
    this.email = email;
    this.password = password;
  }

  public Student(
    final @NotNull String fullName,
    final @NotNull String email,
    final @NotNull String phone,
    final @NotNull String password,
    final boolean termsAndConditions
  ) {
    this(UUID.randomUUID(), fullName, email, phone, password, termsAndConditions);
  }

  public Student(
    final @NotNull UUID id,
    final @NotNull String fullName,
    final @NotNull String email,
    final @NotNull String phone,
    final @NotNull String password,
    final boolean termsAndConditions
  ) {
    this.id = id;
    this.fullName = fullName;
    this.termsAndConditions = termsAndConditions;

    if (!FieldUtils.isPasswordValid(password)) {
      throw new IllegalArgumentException("Password must have at least 8 characters");
    }
    if (!FieldUtils.isEmailValid(email)) {
      throw new IllegalArgumentException("Email format is invalid");
    }

    this.email = email;
    this.phone = phone;
    this.password = password;
  }

  public @NotNull UUID id() {
    return this.id;
  }

  public @NotNull String fullName() {
    return this.fullName;
  }

  public void fullName(final @NotNull String fullName) {
    this.fullName = fullName;
  }

  public @NotNull String email() {
    return this.email;
  }

  public void email(final @NotNull String email) {
    this.email = email;
  }

  public @NotNull String phone() {
    return this.phone;
  }

  public void phone(final @NotNull String phone) {
    this.phone = phone;
  }

  public @NotNull String password() {
    return this.password;
  }

  public void password(final @NotNull String password) {
    this.password = password;
  }

  public boolean termsAndConditions() {
    return this.termsAndConditions;
  }

  public void termsAndConditions(final boolean termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
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
      ", phone='" + phone + '\'' +
      ", password='" + password + '\'' +
      ", termsAndConditions=" + termsAndConditions +
      '}';
  }
}
