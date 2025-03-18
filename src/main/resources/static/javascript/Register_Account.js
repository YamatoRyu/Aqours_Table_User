function submitRegister() {
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;

    let nameEmpty = document.getElementById('warning_name');
    let emailEmpty = document.getElementById('warning_email');
    let passwordEmpty = document.getElementById('warning_password');

    fetch('http://localhost:8080/register', {
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ data: data })
    })
    .then(response => response.json())
    .then(result => console.log(result))
    .catch(error => console.error('Error: ', error));

    if (name == '' || name == null) {
        nameEmpty.style.display = 'block';
    }

    else if (email == '' || email == null) {
        emailEmpty.style.display = 'block';
    }

    else if (password == '' || password == null) {
        passwordEmpty.style.display = 'block';
    }

    if (confirmPassword == '' || confirmPassword == null) {
        alert('your confirm password is empty');
    }
}