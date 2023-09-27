create database db_pizzaria_legal;

use db_pizzaria_legal;

CREATE TABLE tb_categorias(
    id bigint auto_increment primary key,
    nome_categoria varchar(255),
	popularidade int
);



CREATE TABLE tb_pizzas (
    id bigint auto_increment primary key,
    nome_pizza varchar(255),
    descricao text,
    preco decimal(8, 2),
    categoria_id bigint,
    tipo enum("doce","salgada"),
    foreign key (categoria_id) references tb_categorias(id)
);

INSERT INTO tb_categorias (nome_categoria, popularidade)
VALUES
    ('Margherita', 5),
    ('Pepperoni', 4),
    ('Vegetariana', 3),
    ('Frango com Catupiry', 4);

INSERT INTO tb_pizzas (nome_pizza, descricao, preco, tipo, categoria_id)
VALUES
    ('Pizza Margherita', 'Molho de tomate, muçarela, manjericão fresco.',80.99, "doce", 1),
    ('Pizza Pepperoni', 'Molho de tomate, pepperoni, queijo, orégano.', 50.00,"doce",2),
    ('Pizza Vegetariana', 'Molho de tomate, pimentões, cebola, azeitonas.',  100.99, "salgada", 3),
    ('Pizza Frango com Catupiry', 'Molho de tomate, frango desfiado, catupiry.',65.99,"salgada", 4);
    
    SELECT * FROM tb_pizzas where preco > 45.00;
    
    SELECT * FROM tb_pizzas where preco between  50.00 and 100.00;
    
    Select * from tb_pizzas where nome_pizza LIKE '%m%'; 
    
    SELECT * FROM tb_pizzas INNER JOIN tb_categorias 
    ON tb_pizzas.categoria_id = tb_categorias.id;
    
    SELECT * FROM tb_pizzas INNER JOIN tb_categorias 
    ON tb_pizzas.categoria_id = tb_categorias.id WHERE tipo = "doce";
    
    