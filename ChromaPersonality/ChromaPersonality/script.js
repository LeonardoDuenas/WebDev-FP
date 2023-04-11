
function validate() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if (username === "user" && password === "password") {
      window.open("Questionaire Project.html");
    } else {
      document.querySelector('form').insertAdjacentHTML('beforebegin', '<div class="alert">Invalid username or password.</div>');
    }
  }
       
             
const menu = document.querySelector('#mobile-menu');
const menuLinks = document.querySelector('.navbar__menu');

menu.addEventListener('click', function() {
  menu.classList.toggle('is-active');
  menuLinks.classList.toggle('active');
});
