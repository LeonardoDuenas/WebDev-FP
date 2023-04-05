
function validate() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if (username === "user" && password === "password") {
      window.open("Questionaire Project.html");
    } else {
      document.querySelector('form').insertAdjacentHTML('beforebegin', '<div class="alert">Invalid username or password.</div>');
    }
  }
       
        


        // Function to validate login credentials
        function login() {
            username = document.getElementById("username").value;
            const password = document.getElementById("password").value;
            if (users[username] === password) {
                document.getElementById("loginForm").style.display = "none";
                document.getElementById("test").style.display = "block";
                return false;
            } else {
                alert("Invalid login credentials. Please try again.");
                return false;
            }
        }

        // Function to submit answers and calculate score
        
           
       
        
const menu = document.querySelector('#mobile-menu');
const menuLinks = document.querySelector('.navbar__menu');

menu.addEventListener('click', function() {
  menu.classList.toggle('is-active');
  menuLinks.classList.toggle('active');
});
