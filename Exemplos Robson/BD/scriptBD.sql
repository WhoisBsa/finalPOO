create database bdaula;

use bdaula;

create table produto(
    idproduto int primary key auto_increment,
    marca varchar(50),
    nome varchar(50),
    preco varchar(50)
);

insert into produto(marca,nome,preco) values ('Xiaomi', 'Mi 9 ', '2000');

insert into produto(marca,nome,preco) values ('Samsung', 'Galaxy Fold', '10000');

select * from produto;
