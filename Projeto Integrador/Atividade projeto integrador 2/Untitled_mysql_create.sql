CREATE TABLE `Categoria` (
	`IdCategoria` INT NOT NULL AUTO_INCREMENT,
	`NomeCategoria` varchar(255),
	`TipoCategoria` varchar(255),
	`Presencial/EAD` BOOLEAN,
	PRIMARY KEY (`IdCategoria`)
);

CREATE TABLE `Usuário` (
	`IdUsuário` INT NOT NULL AUTO_INCREMENT,
	`NomeCompleto` varchar(255),
	`Email` varchar(255),
	`Senha` varchar(255),
	PRIMARY KEY (`IdUsuário`)
);

CREATE TABLE `Produto` (
	`IdProduto` INT NOT NULL AUTO_INCREMENT,
	`Id_Categoria` INT,
	`NomeProduto` varchar(255),
	`Preço` DECIMAL(10,2) NOT NULL,
	`Duração` FLOAT NOT NULL,
	`Professor` varchar(255),
	PRIMARY KEY (`IdProduto`)
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`Id_Categoria`) REFERENCES `Categoria`(`IdCategoria`);

