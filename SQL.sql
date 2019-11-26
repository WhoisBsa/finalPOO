create database tupi;

use tupi;

create table funcionario (
	matricula varchar(5) primary key,
    nome varchar(30),
    turno varchar(10),
	funcao varchar(15),
	salario decimal(10,2),
    pwd varchar(16)
);

create table relatorio (
	id integer primary key auto_increment,
	aplicacao varchar(10),
	matricula varchar(5),
    inicio datetime,
    fim datetime,
    observacoes varchar(350),
    codMaterial varchar(10),
    qtdMaterial integer,
    numOs varchar(10),
    dataLancamento timestamp default current_timestamp(),

    constraint fk_matricula foreign key (matricula) references tupi.funcionario(matricula)
);

insert into funcionario
	(matricula, nome, turno, pwd, funcao, salario)
values
	('5705', 'hemílio lindo', '07h - 17h', 'hemilio123', 'eletricista', 120.00);

insert into relatorio
	(aplicacao, matricula,
    inicio, fim, observacoes,
    codMaterial, qtdMaterial, numOs)
values
	('M0702M','5705','2019-11-20 15:57:00',
    '2019-11-20 16:30:00','limpando o salão',
    'E021312', 13, '0254321');


select * from funcionario;
