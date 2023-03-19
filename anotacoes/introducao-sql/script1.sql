-- show databases;
create database if not exists first_example;
use first_example;

create table person(
	person_id smallint unsigned,
	fname varchar(20),
	lname varchar(20),
	gender enum('M','F'),
	bith_date DATE,
	street varchar(30),
	city varchar(20),
	state varchar(20),
	country varchar(20),
	postal_code varchar(20),
	constraint pk_person primary key (person_id)
);

desc person;

create table favorite_food(
	person_id smallint unsigned,
	food varchar(20),
	constraint pk_favorite_food primary key (person_id, food),
	constraint fk_favorite_food_person_id foreign key (person_id) references person(person_id)
);

desc favorite_food;

-- verificando constraints
show databases;
desc information_schema.table_constraints;
select * from information_schema.table_constraints where constraint_schema = 'first_example';
select constraint_name from information_schema.table_constraints where table_name = 'person';

-- inserindo dados
desc person;
insert into person values 
('2', 'Giovani', 'Silva', 'M', '1996-08-12', 'rual x', 'cidade x', 'SP', '78569-42'),
('3', 'Silas', 'Oliveira', 'M', '1985-11-23', 'rual y', 'cidade y', 'BA', '78535-36'),
('4', 'Joana', 'Santos', 'F', '1984-05-15', 'rual z', 'cidade z', 'CE', '89365-74');
select * from person;

-- apagando registros
delete from person where person_id = 3 or person_id = 2 or person_id = 4;


desc favorite_food;
insert into favorite_food values (1,'pizza');