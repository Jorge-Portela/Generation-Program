create database db_oracle_school;

use db_oracle_school;

create table tb_estudantes(
id bigint auto_increment not null primary key,
nome varchar(255) not null,
nascimento date not null,
serie int not null,
turno varchar(255) not null,
nota decimal(4,2),
clube varchar(255),
raca varchar(255)
);

select * from tb_estudantes;

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("João Vitor",'2011-5-3',8,"MANHÃ",7,"NATAÇÃO","Preto");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("Reinier Silva",'2011-9-17',8,"MANHÃ",9.36,"NATAÇÃO","Branco");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("Carla Brito",'2013-7-21',7,"MANHÃ",10,"DEBATE","Branco");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("Caio Martins",'2010-8-2',9,"MANHÃ",6,"NÁUTICA","Pardo");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("Rodrigo Souza",'2010-5-28',9,"TARDE",6.25,"JUDO","BRANCO");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("Flávia Andrade",'2012-2-7',7,"TARDE",10,"MUSICA","Preto");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("João Pedro",'2012-10-14',8,"MANHÃ",8.6,"ROBOTICA","Pardo");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("Carlos Maia",'2014-8-3',6,"MANHÃ",9.12,"NATAÇÃO","Preto");

INSERT INTO tb_estudantes(nome, nascimento, serie, turno, nota, clube, raca ) 
values("Vanessa Lopes",'2015-6-13',8,"MANHÃ",10,"NATAÇÃO","Preto");

select * from tb_estudantes;

SELECT * FROM tb_estudantes WHERE nota < 7;

SELECT * FROM tb_estudantes WHERE nota > 7;

UPDATE tb_estudantes SET nota = 6.2 WHERE id = 2;

select * from tb_estudantes;