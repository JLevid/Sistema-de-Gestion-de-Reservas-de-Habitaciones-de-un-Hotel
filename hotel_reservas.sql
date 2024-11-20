-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS hotel_reservas;

-- Usar la base de datos
USE hotel_reservas;

-- Crear la tabla 'reservas'
CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY, -- Clave primaria auto-incremental
    nombre_cliente VARCHAR(255) NOT NULL, -- Nombre del cliente, no nulo
    fecha_inicio DATE NOT NULL, -- Fecha de inicio de la reserva, no nulo
    fecha_fin DATE NOT NULL, -- Fecha de fin de la reserva, no nulo
    tipo_habitacion VARCHAR(100) NOT NULL -- Tipo de habitación, no nulo
);

-- Verificar que la tabla fue creada correctamente
DESCRIBE reservas;