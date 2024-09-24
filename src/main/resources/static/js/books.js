const params = new URLSearchParams(window.location.search);

const name = params.get('name');
const email = params.get('email');

function redirectToHome() {
  window.location.href = `http://localhost:1313/api/v1/home?name=${name}&email=${email}`;
}
