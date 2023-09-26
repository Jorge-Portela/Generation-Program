create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment primary key,
tipo varchar(255) not null,
nome varchar(255) not null,
anoDeFabricacao date not null,
marca varchar(255)
);
ALTER TABLE tb_produtos ADD valor DECIMAL (8,2);

select * from tb_produtos;

insert into tb_produtos(nome,anoDeFabricacao, marca, valor) 
values("Air Force 1", '2021-5-11',"Air Jordan",1400.00);

insert into tb_produtos(nome,anoDeFabricacao, marca, valor) 
values("Jordan 4", '2022-7-11',"Air Jordan",3464.00);

insert into tb_produtos(nome,anoDeFabricacao, marca, valor) 
values("Max Aura", '2023-12-11',"Air Jordan",5700.00);

insert into tb_produtos(nome,anoDeFabricacao, marca, valor) 
values("Nike SB Air Jodan 4", '2023-7-18',"Air Jordan",4400.00);

insert into tb_produtos(nome,anoDeFabricacao, marca, valor) 
values(" Air Jordan Flight Origin", '2023-2-13',"Air Jordan",6400.00);

UPDATE tb_produtos SET valor = 420 WHERE id = 1;

SELECT * FROM tb_produtos WHERE valor > 500.00;

SELECT * FROM tb_produtos WHERE valor < 500.00;

UPDATE tb_produtos SET nome = "Air Jorda 2" WHERE id = 4;

select * from tb_produtos;