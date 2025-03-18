function submitLogin() {
    let email = document.getElementById('email').value;
    let password = document.getElementById('password').value;

    var emailEmpty = document.getElementById('warning_email');
    var passwordEmpty = document.getElementById('warning_password');

    if (email === "" || password === "") {
        emailEmpty.style.display = 'block';
        passwordEmpty.style.display = 'block';
    }
}