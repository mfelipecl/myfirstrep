CREATE DATABASE controle;

USE controle;

CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `senha` varchar(30) DEFAULT NULL,
  `linkfoto` varchar(200) DEFAULT NULL,
  `perfil` int NOT NULL DEFAULT '0', 
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_email_usuario` (`email`),
  UNIQUE KEY `UK_cpf_usuario` (`cpf`)
);

# perfil: 0 = supervidor, 1 = tecnico

INSERT INTO `usuario` VALUES(null, "Emerson Paduan", "emerson@paduan.pro.br","123123123","123","https://hennesseyonline.com/wp-content/uploads/2015/05/staff-placeholder-male.jpg", 0);
INSERT INTO `usuario` VALUES(null, "Daniel Antunes", "daniel@tecnico.com","321321321","123","https://hennesseyonline.com/wp-content/uploads/2015/05/staff-placeholder-male.jpg", 1);

CREATE TABLE `atividade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `atividade` VALUES (null, "Troca de cabos");
INSERT INTO `atividade` VALUES (null, "Mudança de endereço");
INSERT INTO `atividade` VALUES (null, "Nova instalação");
INSERT INTO `atividade` VALUES (null, "Manutenção equipamento");

CREATE TABLE `chamado` (
  `num_chamado` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_atividade` int NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `data_agendamento` date NOT NULL,
  `horas_gastas` time DEFAULT NULL,
  `troca` int NULL,
  `status` int NULL DEFAULT 0,
  PRIMARY KEY (`num_chamado`),
  KEY `fk_usuario` (`id_usuario`),
  CONSTRAINT `fk_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`),
  KEY `fk_atividade` (`id_atividade`),
  CONSTRAINT `fk_atividade` FOREIGN KEY (`id_atividade`) REFERENCES `atividade` (`id`)
);

# troca 0 = não, 1 = sim
# status 0 = pendente, 1 = atendido

INSERT INTO `chamado` VALUES (null, 2, 1, null, '2020-09-20', null, null, 0);
INSERT INTO `chamado` VALUES (null, 2, 2, 'Instalação em novo endereço', '2020-09-20', '1:30', 0, 1);
INSERT INTO `chamado` VALUES (null, 2, 3, null, '2020-09-20', null, null, 0);
INSERT INTO `chamado` VALUES (null, 2, 4, null, '2020-09-20', null, null, 0);