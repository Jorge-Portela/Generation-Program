create database db_generation_gane_online;

use db_generation_gane_online;

create table tb_classes(
id bigint auto_increment primary key,
classe varchar(255) not null,
exp bigint not null
);


 
create table tb_personagens(
id bigint auto_increment primary key,
nome varchar(255),
genero varchar(255),
idade bigint,
altura decimal(5,2),
ataque bigint not null,
defesa bigint not null,
classe_id bigint not null,
foreign key (classe_id) references tb_classes(id)
);


INSERT INTO tb_classes (classe, exp) VALUES
('Cavaleiro', 1200),
('Feiticeiro', 1000),
('Ladrão', 800),
('Arqueiro', 900),
('Clérigo', 1100);

INSERT INTO tb_personagens (nome, genero, idade, altura, ataque, defesa, classe_id)
VALUES
    ('Alice', 'Feminino', 25, 1.68, 2000, 1750, 1),
    ('Bob', 'Masculino', 30, 1.80, 1700, 1600, 2),
    ('Carla', 'Feminino', 28, 1.65, 2700, 1900, 1),
    ('David', 'Masculino', 35, 1.75, 1800, 1500, 3),
    ('Eva', 'Feminino', 22, 1.70, 1600, 1700, 2),
    ('Frank', 'Masculino', 40, 1.85, 1900, 1400, 1),
    ('Grace', 'Feminino', 27, 1.63, 2500, 1800, 3),
    ('Hank', 'Masculino', 32, 1.78, 1650, 1650, 2);

select * from tb_personagens where ataque > 2000;

select * from tb_personagens 
where defesa between 1000 and  2000;

Select * from tb_personagens 
where nome LIKE '%c%'; 

SELECT * FROM tb_personagens p
inner join  tb_classes  c ON p.classe_id = c.id; 

SELECT * FROM tb_personagens p
inner join  tb_classes  c ON p.classe_id = c.id where c.classe = "Arqueiro"; 

SELECT * FROM tb_classes;















