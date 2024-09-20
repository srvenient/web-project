const params = new URLSearchParams(window.location.search);

const name = params.get('name');
const email = params.get('email');

if (name) {
  document.getElementById('name').innerHTML = name;
} else {
  document.getElementById('name').innerHTML = 'Invitado';
}

function redirectToBook() {
  window.location.href = `http://localhost:8080/api/v1/books?name=${name}&email=${email}`;
}
