create database escola;
use escola;
create table alunos
(
	id bigint auto_increment,
    turma varchar(20) not null,
    nome varchar(100) not null,
    nota1 float not null, 
    nota2 float not null,
    primary key(id)
);

insert into alunos (turma, nome, nota1, nota2) values ("SI0P7", "Alex", 10, 10), ("CC02", "Robson", 4.2, 8.3), ("SI0P6", "Laura", 7.2, 7.0), ("CC02", "Maria", 8.2, 2.4), ("CC02", "Layslla", 5.4, 10), ("SI0P7", "Roberta", 3.2, 2.4)
, ("CC02","Jeff", 2.5, 9.3);

select*from alunos where nota1>7 or nota2>7;

update alunos set turma = "SI0P7" where id = 3; 