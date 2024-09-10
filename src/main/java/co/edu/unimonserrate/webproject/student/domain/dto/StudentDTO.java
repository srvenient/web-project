package co.edu.unimonserrate.webproject.student.domain.dto;

public final class StudentDTO {
  private String fullName;
  private String email;
  private String phone;
  private String password;
  private boolean termsAndConditions;

  public StudentDTO() {
  }

  public StudentDTO(
    final String fullName,
    final String email,
    final String phone,
    final String password,
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

  public void setFullName(final String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(final String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
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
