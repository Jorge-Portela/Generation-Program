insert into tb_pessoas(nome,cargo,anoDeNascimento,salario) 
values("Dake Cole","Estagiário",'2002-5-12', 1200.00); 

select nome,salario from tb_pessoas where salario > 2000.00;

select nome,salario from tb_pessoas where salario < 2000.00;

SELECT * FROM tb_pessoas;

 UPDATE tb_pessoas SET salario = 4200.00 where id = 1;







