create database db_cidade_das_carnes;
use db_cidade_das_carnes;
create table tb_produtos(
	id bigint auto_increment not null primary key,
    nome varchar(255) not null,
    valor decimal(10,2) not null,
    quantidade bigint not null,
    categoria_id bigint not null
);
create table tb_categorias(
	id bigint auto_increment not null primary key,
    nome varchar(255) not null,
    descricao varchar(255)
);

insert into tb_categorias (nome)
values ("Suina");
insert into tb_categorias (nome)
values ("Bovina");
insert into tb_categorias (nome)
values ("Ave");
insert into tb_categorias (nome)
values ("Exótica");
insert into tb_categorias (nome)
values ("Cordeiro");

alter table tb_produtos 
add constraint fk_produto_categoria
foreign key (categoria_id) references tb_categorias(id);

insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Filé Mignon",60.00,20,2);
insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Costela de Boi",45.50,15,2);
insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Linguiça Toscana",18.75,30,1);
insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Bacon Defumado",22.90,25,1);
insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Peito de Frango",45.50,40,3);
insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Perna de Peru",45.75,18,3);
insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Pernil de Cordeiro",55.60,10,5);
insert into tb_produtos (nome, valor, quantidade, categoria_id)
values ("Carne de Avestruz",80,8,4);

select * from tb_produtos where valor > 50.00;
select * from tb_produtos where valor between 50.00 and 150.00;
select * from tb_produtos where nome like "%c%";

select * from tb_produtos
inner join tb_categorias
on tb_produtos.categoria_id = tb_categorias.id;

select * from tb_produtos
inner join tb_categorias
on tb_categorias.id = tb_produtos.categoria_id
where tb_produtos.categoria_id = 3;
