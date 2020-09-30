create database ecommerce;
use ecommerce;

create table produtos
(
	id bigint auto_increment,
    tipo varchar(255) not null,
    marca varchar(100) not null,
    quantidade bigint,
    preço float not null,
    primary key (id)
);

insert into produtos (tipo, marca, quantidade, preço) values ("Microondas", "A", 25, 300), ("Celular", "ZX", 5, 4000), ("Playstation 5", "Sony", 30, 4999.99), ("Fone de ouvido", "Apple", 32, 150), ("Webcam", "Gorax", 3, 250),
 ("Xbox one,", "Microsoft", 54, 2000), ("Wii", "Nintendo", 10, 1500);
 
select*from produtos where preço > 500;
select*from produtos where preço < 500;
  
  update produtos set quantidade = 20 where id=2;
  select*from produtos;