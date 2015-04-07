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

-- Esto no lo tenemos que agregar a la base luego, ya que tomaremos los contactos propios del telefono.

Create Table Contactos{
	nombre varchar(30),
	telefono varchar(10),
	email varchar(30),
	Constraint PKContacto primary key(nombre, telefono)
}

Create Table ActividadContactos{
	nombreContacto varchar(30),
	telefonoContacto varchar(10),
	nombreActividad varchar(30),
	nombreUsuario varchar(30),
	Constraint PKActividadContactos primary key(nombreContacto, telefonoContacto, nombreActividad, nombreUsuario),
	Constraint FKActividadContactos1 foreign key(nombreContacto) references Contactos(nombre),
	Constraint FKActividadContactos2 foreign key(telefonoContacto) references Contactos(telefono),
	Constraint FKActividadContactos3 foreign key(nombreActividad) references Actividades(nombre),
	Constraint FKActividadContactos4 foreign key(nombreUsuario) references Actividades(usuario)
}
