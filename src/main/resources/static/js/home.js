const params = new URLSearchParams(window.location.search);
const name = params.get('name');

if (name) {
  document.getElementById('name').innerHTML = name;
} else {
  document.getElementById('name').innerHTML = 'Invitado';
}
