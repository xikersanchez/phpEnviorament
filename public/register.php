<?php
// Zure datu-basearekin konexioa egiten duen funtzioa
function connect_to_database() {
    $servername = "localhost";
    $username = "username";
    $password = "password";
    $dbname = "txirrundularitza";

    // Konexioa sortu
    $conn = new mysqli($servername, $username, $password, $dbname);

    // Konexioa egiaztatu
    if ($conn->connect_error) {
        die("Konexioak huts egin du: " . $conn->connect_error);
    }
    return $conn;
}

// Erregistratzeko formulariaren bidalketa jaso
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Formulariotik datuak jaso
    $firstname = $_POST['firstname'];
    $lastname = $_POST['lastname'];
    $email = $_POST['email'];
    $password = $_POST['password'];

    // Datu-basearekin konexioa sortu
    $conn = connect_to_database();

    // Erabiltzailea datu-basean sartu
    $sql = "INSERT INTO users (firstname, lastname, email, password) VALUES ('$firstname', '$lastname', '$email', '$password')";

    if ($conn->query($sql) === TRUE) {
        echo "Erabiltzailea ongi erregistratu da.";
    } else {
        echo "Errorea: " . $sql . "<br>" . $conn->error;
    }

    // Konexioa itxi
    $conn->close();
}
?>
