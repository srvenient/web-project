const fullName = document.getElementById('full-name');
const email = document.getElementById('email');
const phone = document.getElementById('phone');
const password = document.getElementById('password');
const termsAndConditions = document.getElementById('terms-conditions');

// Register event listeners
document.addEventListener('DOMContentLoaded', function () {
  function check() {
    if (fullName.value.trim() !== '' && email.value.trim() !== '' && phone.value.trim() !== '' && password.value.trim() !== '' && termsAndConditions.checked) {
      document.getElementById('register').removeAttribute('disabled');
    } else {
      document.getElementById('register').setAttribute('disabled', 'true');
    }
  }

  fullName.addEventListener('input', check);
  email.addEventListener('input', check);
  phone.addEventListener('input', check);
  password.addEventListener('input', check);
  termsAndConditions.addEventListener('input', check);
});

// Validate email
function validateEmail() {
  const email = document.getElementById('email');
  const re = /^[A-Za-z0-9._%+-]+@unimonserrate\.edu\.co$/;

  return re.test(email.value);
}

// Validate password
function validatePassword() {
  const password = document.getElementById('password');
  const hasLetter = /[a-zA-Z]/.test(password.value);
  const hasNumber = /\d/.test(password.value);
  const isLengthValid = password.value.length >= 8 && password.value.length <= 20;

  if (!isLengthValid) {
    return false;
  } else return !(!hasLetter || !hasNumber);
}

document.getElementById('register-form')
  .addEventListener('submit', function (event) {
    event.preventDefault();

    const isEmailValid = validateEmail();
    const isPasswordValid = validatePassword();

    if (isEmailValid && isPasswordValid) {
      event.target.submit();
    } else {
      document.getElementById("error-message").style.display = "flex";
    }
  });
