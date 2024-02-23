<?php
// Datu basearekin konexioa egiten duen funtzioa
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
?>
