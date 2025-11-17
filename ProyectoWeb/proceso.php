<?php
//Procesar el formulario si se envio
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nombre = htmlspecialchars(string: $_POST["name"]);
    $apellido = htmlspecialchars(string: $_POST["last-name"]);
    $edad = htmlspecialchars(string: $_POST["edad"]);
    $email = htmlspecialchars(string: $_POST["email"]);
    $telefono = htmlspecialchars(string: $_POST["telefono"]);
    $ciudad = htmlspecialchars(string: $_POST["ciudad"]);
    $objetivo = htmlspecialchars($_POST["objetivo"]);
    $horario = htmlspecialchars($_POST["horario"]);


    //Mostarar los datos recibidos
    echo "Gracias por tu mensaje, $nombre, $apellido. <br>";
    echo "<br>Tu email es: $email";
    echo "<br>Tu edad es: $edad";
    echo "<br>Tu telefono es: $telefono";
    echo "<br>Tu seleccion es: $ciudad";
    echo "<br>Tus motivos son: $objetivo";
    echo "<br>Tu horario es: $horario";
    echo "<br>REGISTRADO.";
    echo "<br><a target='_blank' href='index.html'>Volver al formulario</a>";
}
?>