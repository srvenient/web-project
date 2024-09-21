package co.edu.unimonserrate.webproject.student.domain;

import co.edu.unimonserrate.webproject.student.domain.util.FieldUtils;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

/**
 * This class represents the Student entity
 * in the domain layer.
 *
 * <p>It is used to store the information of a student.</p>
 */
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

  /**
   * Default constructor.
   */
  public Student() {
  }

  /**
   * Constructor with parameters.
   *
   * @param email the email of the student
   */
  public Student(final @NotNull String email) {
    this.email = email;
  }

  /**
   * Constructor with parameters.
   *
   * @param email    the email of the student
   * @param password the password of the student
   */
  public Student(final @NotNull String email, final @NotNull String password) {
    this.email = email;
    this.password = password;
  }

  /**
   * Constructor with parameters.
   *
   * @param fullName           the full name of the student
   * @param email              the email of the student
   * @param phone              the phone number of the student
   * @param password           the password of the student
   * @param termsAndConditions the terms and conditions acceptance of the student
   */
  public Student(
    final @NotNull String fullName,
    final @NotNull String email,
    final @NotNull String phone,
    final @NotNull String password,
    final boolean termsAndConditions
  ) {
    this(UUID.randomUUID(), fullName, email, phone, password, termsAndConditions);
  }

  /**
   * Constructor with parameters.
   *
   * @param id                 the identifier of the student
   * @param fullName           the full name of the student
   * @param email              the email of the student
   * @param phone              the phone number of the student
   * @param password           the password of the student
   * @param termsAndConditions the terms and conditions acceptance of the student
   */
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

  public @NotNull String email() {
    return this.email;
  }

  public @NotNull String phone() {
    return this.phone;
  }

  public @NotNull String password() {
    return this.password;
  }

  public boolean termsAndConditions() {
    return this.termsAndConditions;
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
