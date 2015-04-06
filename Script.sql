CREATE USER 'user'@'localhost' IDENTIFIED BY 'user';
GRANT ALL PRIVILEGES ON * . * TO 'user'@'localhost';

-- CONECTAR CON EL USUARIO : user   --  PASS: user

create database calendar;

use calendar;

Create Table Usuarios(
	nick varchar(30),
	nombre varchar(30),
	pass varchar(30),
	Constraint PKUsuario primary key(nick)
);

Create Table Actividades(
	nombre varchar(30),
	fecha date,
	hora timestamp,
	detalle varchar(200),
	tipo int,
	usuario varchar(30),
	Constraint PKActividad primary key(nombre, usuario),
	Constraint FKActividad foreign key(usuario) references Usuarios(nick)
);

