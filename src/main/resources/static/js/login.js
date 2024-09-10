const email = document.getElementById('email');
const password = document.getElementById('password');

// Register event listeners
document.addEventListener('DOMContentLoaded', function () {
  function check() {
    if (email.value.trim() !== '' && password.value.trim() !== '') {
      document.getElementById('login').removeAttribute('disabled');
    } else {
      document.getElementById('login').setAttribute('disabled', 'true');
    }
  }

  email.addEventListener('input', check);
  password.addEventListener('input', check);
});

// Validate email
function validateEmail() {
  const email = document.getElementById('email');
  const re = /^[A-Za-z0-9._%+-]+@unimonserrate\.edu\.co$/;

  if (!re.test(email.value)) {
    email.setCustomValidity('Utiliza la dirección de correo electrónico de tu universidad.');
    return false;
  } else {
    email.setCustomValidity('');
    return true;
  }
}

// Validate password
function validatePassword() {
  const password = document.getElementById('password');

  if (!(password.value.length >= 8 && password.value.length <= 20)) {
    password.setCustomValidity('La contraseña debe tener entre 8 y 20 caracteres.');
    return false;
  } else {
    password.setCustomValidity('');
    return true;
  }
}

// Validate fields on input
document.getElementById('email').addEventListener('input', validateEmail);
document.getElementById('password').addEventListener('input', validatePassword);
