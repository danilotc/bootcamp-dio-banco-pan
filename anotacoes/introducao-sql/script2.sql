create schema if not exists company;

-- restrição atribuida a um dominio
-- mysql não possui suporte para isso (?)
-- create domain d_num as int chack(d_num > 0 and d_num < 21);

create table company.emproyee(
	fname varchar(15) not null,
	minit char,
	lname varchar(15) not null,
	ssn char(9) not null,
	bdate date,
	address varchar(30),
	sex char,
	salary decimal(10,2),
	super_ssn char(9),
	dno int not null,
	constraint chk_salary_employee check (salary > 2000.0),
	constraint pk_employee primary key (ssn)
);

-- Adicionando constraints ao Banco de dados com Alter Table
-- esse video está faltando parte no inicio... está cortado
alter table employee
	add constraint fk_employee
	foreign key(super_ssn) references employee(ssn)
	on delete set null
	on update cascade;

use company;
create table department(
	dname varchar(15) not null,
	dnumber int not null,
	mgr_ssn char(9),
	mgr_start_date date,
	constraint chk_date_dept check (dept_create_date < mgr_start_date),
	constraint pk_dept primary key (dnumber),
	constraint unique_name_dept unique (dname),
	foreign key (mgr_ssn) references employee(ssn)
);

-- modificar uma constraint: drop e add
alter table department drop constraint department_idbosd;
alter table department 
	add constraint fk_dept foreign key(mgr_ssn_ references employee(ssn)
	on update cascade;

create table dept_locations(
	dnumber int not null,
	dlocation varchar(15) not null,
	constraint pk_dept_locations primary key (dnumber, dlocation),
	constraint fk_dept_locations foreign key (dnumber) references department(dnumber)
);

alter table dept_locations drop constraint fk_dept_locations;
alter table dept_locations
	add constraint fk_dept_locations foreign key(dnumber) refrences department(dnumber)
	on delete cascade
	on update cascade;

create table project(
	pname varchar(15) not null,
	pnumber int not null,
	plocation varchar(15),
	dnum int not null,
	primary key (pnumber),
	constraint unique_project unique (pname),
	constraint fk_project foreign key (dnum) references department (dnumber)
);

create table works_on(
	essn char(9) not null,
	pne int not null,
	hours decimal(3,1) not null,
	primary key (essn, pno),
	constraint pk_employee_works_on foreign key (essn) references employee(ssn),
	constraint fk_project_works_on foreign key (pno) references project(pnumber)
);

create table dependent(
	essn char(9) notnull,
	dependent_name varchar(15) not null,
	sex char,
	bdate date,
	relationship varchar(8),
	primary key(essn, dependent_name),
	constraint fk_dependent foreign key (essn) references employee(ssn)
);

-- age int not null,
-- constraint chk_age_dependent check (age < 21),








show tables;
desc department;

-- verificando as constraints existentes no banco company
select * from information_schema.table_constraints
where constraint_schema = 'company';

select * from information_schema.referential_constraints
where constraint_schema = 'company';









-- analisar os tipos de dados
show character set;

-- constraint
-- ------------------------------------------------------
-- not null
-- pk e fk
-- default (valor)
-- check (domain)
-- delete (comportamento)
-- primary key (usado no comando create table) (Referential Triggered Action)
-- unique

-- exemplo
-- create domain d_num as integer check (d_num > 0 and d_num < 21);
-- check (dept_create_date <= mgr_start_date);








-- =========================INSERCAO==========================

-- insercao de dados no db company

use company_constraints;
show tables;

insert into employee values ('Danilo','B','Catro',12345789,'1995-09-12','rua x','M',3000,null,5);
insert into employee values ('Danile','A','Catro',12336589,'1994-09-12','rua x','F',4000,null,5);
insert into employee values ('Joao','D','Catro',12347489,'1985-09-12','rua h','M',3000,null,4);
insert into employee values ('Marcelo','B','Catro',11745789,'1996-09-12','rua e','F',5000,null,5);

-- AS AULAS FORAM TÃO CONFUSAS QUE NÃO CONSEGUI ACOMPANHAR, PREFERI ALIMENTAR AS OUTRAS
-- TABELAS DEPOIS DE ANALISAR CADA UMA DELAS COM MAIS CALMA.

-- inserir dados para dependent
-- inserir dados para department
-- inserir dados para dept_locations
-- inserir dados para project
-- inserir dados para works_on


-- A PROF EXPLICA UMAS COISAS SEM SENTIDO NENHUM PARA O ESCOPO DA AULA, POR QUE ELA FICA 
-- FALANDO DE COISAS QUE NÃO SERÃO USADAS NAQUELE MOMENTO?
 
-- load date infile 'path' into table employee;







-- ==========================QUERIES==========================

select * from employee;
select ssn, fname from employee e, department d where (e.ssn = d.essn);






select * from department;
select * from dept_locations;

select dname, l.location 
	from department d, dept_locations l 
	where d.dnumber = l.dnumber;

select concat(fname, ' ', lname) from employee;
