create database bd_agencia;

use bd_agencia;

create table usuarios (
	id int not null auto_increment,
    nome varchar(100),
    email varchar(80),
    constraint pk_usuarios primary key(id)
);