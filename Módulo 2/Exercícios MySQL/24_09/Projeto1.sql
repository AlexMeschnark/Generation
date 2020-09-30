create database RH;

USE RH;

create table funcionarios
 (
id bigint auto_increment,
nome varchar(100) not null,
idade int not null,
salario float not null,
primary key (id)
);

alter table funcionarios add cargo varchar(255) not null;

insert into funcionarios (nome, idade, salario, cargo) values ("Alex", 19, 3000, "gerente"), ("Leonardo", 23, 1999.99, "Java jr"), ("Francco", 26, 4000, "Java Senior"), 
("Ronaldo", 32, 1000,"Java jr"), ("Donald", 18, 1250.32, "Java jr");

select *from funcionarios where salario > 2000;
select*from funcionarios where salario < 2000;

update funcionarios set salario = 5000 where id = 1; 
	
