package co.edu.unimonserrate.webproject.student.domain.dto;

import org.jetbrains.annotations.NotNull;

/**
 * This class represents the Data Transfer Object (DTO) for the Student entity.
 */
public final class StudentDTO {
  private String fullName;
  private String email;
  private String phone;
  private String password;
  private boolean termsAndConditions;

  /**
   * Default constructor.
   */
  public StudentDTO() {
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
  public StudentDTO(
    final @NotNull String fullName,
    final @NotNull String email,
    final @NotNull String phone,
    final @NotNull String password,
    final boolean termsAndConditions
  ) {
    this.fullName = fullName;
    this.email = email;
    this.phone = phone;
    this.password = password;
    this.termsAndConditions = termsAndConditions;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(final @NotNull String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final @NotNull String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(final @NotNull String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final @NotNull String password) {
    this.password = password;
  }

  public boolean isTermsAndConditions() {
    return termsAndConditions;
  }

  public void setTermsAndConditions(final boolean termsAndConditions) {
    this.termsAndConditions = termsAndConditions;
  }

  @Override
  public String toString() {
    return "StudentDTO{" +
      "fullName='" + fullName + '\'' +
      ", email='" + email + '\'' +
      ", phone='" + phone + '\'' +
      ", password='" + password + '\'' +
      ", termsAndConditions=" + termsAndConditions +
      '}';
  }
}
