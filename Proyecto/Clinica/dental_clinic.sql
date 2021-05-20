CREATE DATABASE  IF NOT EXISTS dental_clinic_db;
USE dental_clinic_db;
DROP TABLE IF EXISTS usuario;
create table usuario(
	id int(10) auto_increment primary key,
    nombre varchar(50) not null,
    contraseña varchar(50) not null
);
DROP TABLE IF EXISTS Paciente;
CREATE TABLE Paciente (
  Id int(11) NOT NULL,
  IdDentista int(11) NOT NULL,
  Nombre varchar(45) DEFAULT NULL,
  Apellidos varchar(45) DEFAULT NULL,
  Pieza varchar(45) DEFAULT NULL,
  Color varchar(45) DEFAULT NULL,
  Precio  varchar(45) DEFAULT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY FK_Paciente(IdDentista) REFERENCES Dentista(Id)
);
DROP TABLE IF EXISTS Dentista;
CREATE TABLE Dentista (
  Id int(11) NOT NULL,
  Nombre varchar(45) DEFAULT NULL,
  Direccion varchar(45) DEFAULT NULL,
  Telefono varchar(45) DEFAULT NULL,
  PRIMARY KEY (Id)
  ) ;

DELIMITER |
CREATE  PROCEDURE Actualizar_Dentista(
Id1 int,
Nombre1 varchar(45),
Edad1 varchar(45),
Direccion1 varchar(45),
Telefono1 varchar(45)
)
BEGIN
UPDATE Dentista SET DentistaNombre = DentistaNombre1, DntistaDireccion = DentistaDireccion1 , DentistaTelefono = DentistaTelefono1  WHERE DentistaId =DentistaId1;
END |
DELIMITER ;

DELIMITER |
CREATE PROCEDURE actualizar_Paciente(
id1 int,
IdDentista1 int,
nombre1 varchar(45),
apellidos1 varchar(50),
pieza1 varchar(45),
color1 varchar(45),
precio1 varchar(45)
)
BEGIN
UPDATE Paciente SET P.Nombre = P.nombre1,
                    P.apellidos = P.apellidos1 ,P.pieza = P.pieza1,
                    P.color = P.color1,P.precio =P.precio1,P.IdDentisa= P.IdDentista1 WHERE P.id = P.id1;
END |
DELIMITER ;

INSERT INTO USUARIO(Id,NOMBRE, CONTRASEÑA) VALUES  ('1','LUCIA13', '1234');
INSERT INTO Dentista( Id, Nombre ,Direccion, Telefono ) VALUES (1,'KENDALL','Arroyomolinos', '66268942');
INSERT INTO Dentista( Id, Nombre ,Direccion, Telefono ) VALUES (2,'KENDALL','Villaviciosa', '66268949');
INSERT INTO Dentista( Id, Nombre ,Direccion, Telefono ) VALUES (3,'EUROPA','Mostoles', '641237743');
INSERT INTO Dentista( Id, Nombre ,Direccion, Telefono ) VALUES (4,'LOS CASTILLOS','Alcorcon', '688322212');
INSERT INTO Dentista( Id, Nombre ,Direccion, Telefono ) VALUES (5,'GYB','Leganes', '672521965');
INSERT INTO Dentista( Id, Nombre ,Direccion, Telefono ) VALUES (6,'IBERMEDIC','Leganes', '66260423');
INSERT INTO Dentista( Id, Nombre ,Direccion, Telefono ) VALUES (7,'ALEXIS','Sevilla la nueva', '66268942');
