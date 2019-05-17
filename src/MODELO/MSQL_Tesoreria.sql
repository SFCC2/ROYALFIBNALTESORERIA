drop schema if exists Tesoreria;
create database Tesoreria;
use Tesoreria;
/*
@ nombre sulay Cupitra y Hector Torres
*/
 create table Comprobante(
 comprobante varchar(20) NOT NULL primary key,
 descripcion varchar(20),
 Tipo varchar(20),
 cuenta integer

 );
 
create table CentroCosto(
idCentroCosto int not null primary key,
descripcion varchar(20),
Cuenta integer

);

create table ciudad (codigo int not null primary key auto_increment, nombre varchar (30) not null );
create table MaestroProveedor(
nit int NOT NULL primary key,
nombre varchar(20),
direccion varchar(20),
telefono integer,
ciudad int ,
tipo varchar(20),
foreign key (ciudad) references ciudad (codigo)
);
insert into MaestroProveedor values(111,'Carvajal S.A', 'Avenida Dorado',1111111,1,'E');
insert into MaestroProveedor values(222,'Carvajal S.A', 'Avenida Dorado',2222222,1,'E');
insert into MaestroProveedor values(333,'Carvajal S.A', 'Avenida Dorado',3333333,1,' ');
insert into MaestroProveedor values(444,'Carvajal S.A', 'Avenida Dorado',4444444,1,'E');
insert into MaestroProveedor values(555,'Carvajal S.A', 'Avenida Dorado',5555555,1,'N');
insert into MaestroProveedor values(666,'Carvajal S.A', 'Avenida Dorado',6666666,1,' ');
insert into MaestroProveedor values(77,'Carvajal S.A', 'Avenida Dorado',77777777,1,'E');
create table MoviemientosTesoreria(
num_Orden_Pago  INT NOT NULL PRIMARY KEY,
cc integer,
nit_Provedor integer,
fecha_Pago date,
ValorPago integer,
nro_Cheque integer,
comprobante varchar(20),
foreign key (cc) references CentroCosto (idCentroCosto),
foreign key (nit_Provedor) references MaestroProveedor (nit),
foreign key (comprobante) references Comprobante (comprobante)
);
create table user(
codigo int not null primary key,
nombre varchar(30) not null);
insert into ciudad (nombre)values('Bogota'),('Cali'),('Natagima'),('Huila');

insert into CentroCosto values(135,'ventas',454589);insert into CentroCosto values(145,'facturacion',556487);
insert into Comprobante values('TEST','Pago Tesoreria','D/C',141414);
select* from Comprobante;