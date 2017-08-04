---------------------------------------------------
--SCRIPT PARA LA CREACION DE LAS TABLAS SQL
---------------------------------------------------

CREATE TABLE empresa(
    empresaID INT,
    nombre CHAR(30),
    cuit CHAR(30)
)

CREATE TABLE perfilUsuario(
    perfilUsuarioID INT,
    nombreCompleto CHAR(40),
    email CHAR(100),
    telefono CHAR(50)
)

--DATOS PARA PRUEBAS INICIALES
