create database db_ecommerce;
use db_ecommerce;

create table tb_categoria (
	idCategoria bigint auto_increment primary key,
    nome varchar(40),
    serie int not null
);

create table tb_produto(
	idProduto bigint auto_increment primary key,
    fkNome varchar(40) REFERENCES tb_categoria(nome),
    marca varchar(40) not null,
    quantidade int,
    valor float not null
);

insert into tb_categoria (nome, serie) values 
	("Tênis", 543),
	("Camisa", 42452),
    ("Meia", 765)
;

insert into tb_produto(fkNome, marca, quantidade, valor) values
	("Tênis", "Nike", 20, 2500),
    ("Camisa", "Oakley", 30,300),
    ("Meia", "Nike", 2, 5)
;

select*from tb_produto where valor > 2000;
select*from tb_produto where valor between 1000 and 2000;
select*from tb_produto where fkNome like 'c%';


