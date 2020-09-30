create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
	Id bigint auto_increment primary key,
    Tipo varchar(255),
    Quantidade int 
);

create table tb_produto(
	Id bigint auto_increment primary key,
    Marca varchar(255),
    Cor varchar(255),
    Preço decimal (10,2),
    Id_Categoria bigint, 
    foreign key (Id_Categoria) references tb_categoria (Id)
);
alter table tb_produto add column Quantidade_Produto bigint;

insert into tb_categoria (Tipo, Quantidade) values 
	("Piso", 650),
    ("Pregos", 550),
    ("Tinta", 300),
    ("Martelo", 100),
    ("Porca", 250);
    
insert into tb_produto (Marca, Cor, Preço, Id_Categoria, Quantidade_Produto) values
	("A", "Verde", 10.50, 1, 200),
    ("B", "Prateado", 1.2, 5, 50),
    ("C", "Preto", 1.3, 5, 45),
    ("D", "Amarela", 10, 3, 15),
    ("D", "Vermelho", 15.99, 4, 25),
    ("A", "Preto", 13.99, 1, 150);
    
select*from tb_produto where Preço > 50;
select*from tb_produto where Preço > 3 and Preço < 60;
select*from tb_produto where Marca like "%CI%";
select*from tb_categoria inner join tb_produto on tb_produto.Id_Categoria = tb_categoria.Id;
select*from tb_categoria inner join tb_produto on tb_produto.Id_Categoria = tb_categoria.Id where tb_categoria.Tipo = "Piso";