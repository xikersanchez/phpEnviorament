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

// Sesioko erabiltzailearen datuak egiaztatu
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Formulariotik datuak jaso
    $email = $_POST['email'];
    $password = $_POST['password'];

    // Datu-basearekin konexioa sortu
    $conn = connect_to_database();

    // Erabiltzailea bilatu
    $sql = "SELECT * FROM users WHERE email='$email' AND password='$password'";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        // Sesioko erabiltzailea gordetzeko sesioa hasi
        session_start();
        $_SESSION['email'] = $email;
        echo "Ongi etorri! Sesioa hasi da.";
    } else {
        echo "Login errorea: Kredentzialak ez dira zuzenak.";
    }

    // Konexioa itxi
    $conn->close();
}
?>
