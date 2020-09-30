create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria (
	IdCategoria bigint auto_increment primary key,
    Tipo varchar(255) not null,
    QuantidadeCategoria varchar(255)
);

create table tb_produto (
	IdCurso bigint auto_increment primary key,
    Professor varchar(255),
    Nível varchar(255),
    Preço decimal (10,2),
    Id_Categoria bigint,
	foreign key (Id_Categoria) references tb_categoria (IdCategoria)
);

insert into tb_categoria (Tipo, QuantidadeCategoria) values 
	("Java", 5),
    ("Python", 6),
    ("JavaScript", 4),
    ("HTML", 7),
    ("MySQL", 6)
;

insert into tb_produto(Professor, Nível, Preço, Id_Categoria) values 
	("Alex", "Avançado", 250.99, 1),
    ("Lucas", "Iniciante", 300, 5),
    ("Lucas", "Mediano", 250, 5),
    ("Bruno", "Iniciante", 50, 2),
    ("Laura", "Avançado", 500, 3),
    ("Roberta", "Iniciante", 200, 4)
;

select*from tb_produto where Preço > 50;
select*from tb_produto where Preço >= 3 and Preço <= 60;
select*from tb_produto inner join tb_categoria on tb_produto.Id_Categoria = tb_categoria.IdCategoria where tb_categoria.Tipo like  "%JAV%";
select*from tb_categoria inner join tb_produto on tb_produto.Id_Categoria = tb_categoria.IdCategoria;
select*from tb_categoria inner join tb_produto on tb_produto.Id_Categoria = tb_categoria.IdCategoria where tb_categoria.IdCategoria = 5;



