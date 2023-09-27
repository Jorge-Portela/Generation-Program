create database db_construindo_vidas;

use db_construindo_vidas;

create table tb_categorias(
    id bigint auto_increment primary key,
    nome varchar(100) not null unique,
    descricao varchar(255)
);

create table tb_produtos(
    id bigint auto_increment primary key,
    nome varchar(100) not null unique,
    valor decimal(8,2) not null,
    estoque bigint not null,
    categoria_id bigint not null,
    foreign key (categoria_id) references tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao)
VALUES
    ('Eletrônicos', 'Produtos eletrônicos diversos'),
    ('Roupas', 'Roupas de moda masculina e feminina'),
    ('Alimentos', 'Produtos alimentícios'),
    ('Móveis', 'Móveis para casa e escritório'),
    ('Esportes', 'Equipamentos esportivos');

INSERT INTO tb_produtos (nome, valor, estoque, categoria_id)
VALUES
    ('Smartphone', 799.99, 100, 1),
    ('Notebook', 1299.99, 50, 1),
    ('Camiseta', 69.99, 200, 2),
    ('Calça Jeans', 99.99, 150, 2),
    ('Arroz', 5.99, 500, 3),
    ('Sofá', 499.99, 30, 4),
    ('Bola de Futebol', 19.99, 100, 5),
    ('Raquete de Tênis', 59.99, 50, 5);

select p.*, c.nome AS categoria from tb_produtos p
inner join tb_categorias c
on p.categoria_id = c.id
where p.valor > 100;

select p.*, c.nome AS categoria from tb_produtos p
inner join tb_categorias c
on p.categoria_id = c.id
where p.valor between 70 and 150;

select p.*, c.nome AS categoria from tb_produtos p
inner join tb_categorias c
on p.categoria_id = c.id
where p.nome like "%c%";

select p.*, c.nome AS categoria from tb_produtos p
inner join tb_categorias c
on p.categoria_id = c.id
where p.nome like "%c%";

select * from tb_produtos p
inner join tb_categorias c
on p.categoria_id = c.id;

select p.*, c.nome AS categoria from tb_produtos p
inner join tb_categorias c
on p.categoria_id = c.id
where c.nome = "Eletrônicos";