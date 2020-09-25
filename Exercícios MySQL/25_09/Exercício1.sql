create database db_RH2;
use db_RH2;

create table tb_cargo(
	idCargo bigint auto_increment primary key,
    cargo varchar(20) not null,
    vr float 
);

create table tb_funcionario (
	id int auto_increment primary key,
    departamento varchar(20) not null,
    nome varchar(50) not null,
    idade int not null,
    salario float not null
);
alter table tb_funcionario add fkcargo bigint not null;
ALTER TABLE tb_funcionario ADD FOREIGN KEY (fkcargo) REFERENCES tb_cargo(idCargo);


insert into tb_cargo (cargo, vr) values ("Gerente", 300), ("Desenvolvedor", 200);

insert into tb_funcionario (departamento, nome, idade, salario, fkcargo) values ("T.I", "Alex", 19, 5400, 1), ("T.I", "Weslley", 89, 2500, 2);
insert into tb_funcionario (departamento, nome, idade, salario, fkcargo)  values  ("T.I", "Carlos", 23, 2500, 2);
insert into tb_funcionario (departamento, nome, idade, salario, fkcargo)  values  ("T.I", "Carla", 23, 2500, 2);

select*from tb_funcionario where salario >2000;
select*from tb_funcionario where salario between 1000 and 2000;
select*from tb_funcionario where nome LIKE 'c%';

select*from tb_cargo;