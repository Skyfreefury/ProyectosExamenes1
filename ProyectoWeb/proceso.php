<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Recoger y sanitizar datos
    $nombre    = htmlspecialchars($_POST["name"] ?? "");
    $apellido  = htmlspecialchars($_POST["last-name"] ?? "");
    $edad      = intval($_POST["edad"] ?? 0);
    $email     = filter_var($_POST["email"] ?? "", FILTER_SANITIZE_EMAIL);
    $telefono  = htmlspecialchars($_POST["telefono"] ?? "");
    $ciudad    = htmlspecialchars($_POST["ciudad"] ?? "");
    $objetivo  = htmlspecialchars($_POST["objetivo"] ?? "");
    $horario   = htmlspecialchars($_POST["horario"] ?? "");

    // Validaciones básicas
    $errores = [];
    if (empty($nombre) || empty($apellido)) $errores[] = "Nombre y apellidos son obligatorios.";
    if ($edad < 14 || $edad > 100) $errores[] = "Edad fuera de rango.";
    if (!filter_var($email, FILTER_VALIDATE_EMAIL)) $errores[] = "Email inválido.";
    if (empty($telefono)) $errores[] = "Teléfono obligatorio.";
    if (empty($ciudad)) $errores[] = "Ciudad obligatoria.";
    if (empty($objetivo)) $errores[] = "Selecciona un objetivo.";
    if (empty($horario)) $errores[] = "Selecciona un horario.";

    // Mostrar resultado
    if ($errores) {
        echo "<h2> Errores en el formulario:</h2><ul>";
        foreach ($errores as $error) {
            echo "<li>$error</li>";
        }
        echo "</ul>";
        echo "<a href='index.html'>Volver al formulario</a>";
    } else {
        echo "<h2>✅ Formulario enviado correctamente</h2>";
        echo "<p><strong>Nombre:</strong> $nombre</p>";
        echo "<p><strong>Apellidos:</strong> $apellido</p>";
        echo "<p><strong>Edad:</strong> $edad</p>";
        echo "<p><strong>Email:</strong> $email</p>";
        echo "<p><strong>Teléfono:</strong> $telefono</p>";
        echo "<p><strong>Ciudad:</strong> $ciudad</p>";
        echo "<p><strong>Objetivo:</strong> $objetivo</p>";
        echo "<p><strong>Horario preferido:</strong> $horario</p>";
        echo "<p>¡Gracias por tu mensaje! Nos pondremos en contacto contigo pronto.</p>";
        echo "<a href='index.html'>Volver al formulario</a>";
    }
}
?>
