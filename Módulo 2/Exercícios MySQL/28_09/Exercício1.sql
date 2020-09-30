create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
IdCategoria bigint auto_increment primary key,
Animal varchar (255),
Marca varchar (255)
);

create table tb_produto(
IdProduto bigint auto_increment primary key,
Tipo varchar (255),
Quantidade bigint,
Valor decimal (10,2),
Id_Categoria bigint not null,
 foreign key (Id_Categoria) references tb_categoria (IdCategoria)
);

insert into tb_categoria (Animal, Marca) values 
	("Boi", "A"),
    ("Galinha","B"), 
    ("Galinha","C"),
    ("Porco","A");

insert into tb_produto (Tipo, Quantidade, Valor, Id_Categoria) values 
	("Picanha","20", 50, 1),
    ("Coração", 100, 10, 3),
    ("Galinha", 50, 30, 2),
    ("Costela", 98, 50, 4),
    ("Costela", 22, 45.33, 1);

select*from tb_produto where Valor > 50;
select*from tb_produto where Valor between 3 and 60;
select*from tb_produto where Tipo like "co%";
select*from tb_categoria inner join tb_produto on tb_produto.Id_Categoria = tb_categoria.IdCategoria; 
select*from tb_categoria inner join tb_produto on tb_produto.Id_Categoria = tb_categoria.IdCategoria where tb_categoria.Animal = "Galinha";



