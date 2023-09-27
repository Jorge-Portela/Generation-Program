create database db_farmacia_bem_estar;
use db_farmacia_bem_estar;


create table tb_categoria_remedio  (
id int auto_increment primary key,
nome char(100),
descricao char(100)
);

insert into tb_categoria_remedio (nome, descricao) values
('Medicamentos', 'Medicamentos de prescrição médica'),
('Higiene Pessoal', 'Produtos para higiene pessoal'),
('Cosméticos', 'Produtos cosméticos'),
('Primeiros Socorros', 'Itens de primeiros socorros'),
('Suplementos', 'Suplementos alimentares');

create table tb_produtos_remedio (
    id int auto_increment primary key,
    nome varchar(100),
    preco decimal(10, 2),
    estoque int,
    validade date,
    id_categoria int,
    foreign key (id_categoria_remedio) references tb_categoria_remedio(id)
);

insert into tb_produtos (nome, preco, estoque, validade, id_categoria) values
('Paracetamol 500mg', 5.99, 100, '2024-12-31', 1),
('Shampoo Suave', 7.49, 50, '2024-12-31', 2),
('Batom Vermelho', 19.90, 50, '2024-12-31', 3),
('Curativos Adesivos', 3.99, 200, '2024-12-31', 4),
('Whey Protein', 89.90, 20, '2024-12-31', 5),
('Aspirina 500mg', 6.89, 100, '2024-12-31', 1),
('Condicionador Suave', 7.49, 50, '2024-12-31', 2),
('Máscara Facial', 14.90, 30, '2024-12-31', 3);

select * from tb_produtos;

drop table tb_produtos;

select * from tb_produtos where preco < 50;

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco between 5 and 60;

select * from tb_produtos where nome like '%c%';

select * from tb_produtos inner join tb_categoria on tb_produtos.id_categoria = tb_categoria.id;

select * from tb_produtos inner join tb_categoria on tb_produtos.id_categoria = tb_categoria.id
WHERE tb_categoria.id = 1;