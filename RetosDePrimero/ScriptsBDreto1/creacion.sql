create database vending_bd collate utf8mb4_spanish_ci;

use vending_bd;

create table producto (
	idProducto int unsigned primary key auto_increment,
    nombreProducto varchar(50) not null unique,
    precio numeric(3,2),
    categoria enum('bebida', 'dulce', 'bocata', 'golosina') not null
);

