# Isso é um comentário
-- Isso é um comentário

-- criando um banco de dados (schema)
create database bd_escola;

-- marcando o BD padrão
use bd_escola;

-- criando a tabela aluno
create table alunos (
	ra int not null auto_increment,
    nome varchar(100),
    email varchar(50),
    primary key pk_aluno (ra)
);

-- descreve os detalhes da tabela
desc alunos;

-- remove a tabele e TODOS os seus dados!!!
drop table alunos;

-- inserir dados na tabela
insert into alunos (ra, nome, email) 
values(null, 'Carlos', 'carlos@email.com');

insert into alunos values(null, 'Alberto', 'alberto@email.com');
insert into alunos values(null, 'Roberta', 'roberta@email.com');
insert into alunos values(null, 'Ana Lucia', 'ana@email.com');

-- consultando todos os dados da tabela
select * from alunos;

-- consulte os nomes e emails de todos os alunos
select nome, email from alunos;

-- consulte os ra's maiores que 3
select * from alunos where ra > 3;

-- atualize o email do aluno com ra 1
update alunos 
set email = 'carlos@novoemail.com' 
where ra = 1;

-- apagar o aluno com ra = 2
delete from alunos WHERE ra = 2;
