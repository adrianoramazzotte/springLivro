    create table curso (
       id integer not null auto_increment,
       descricao varchar(255),
	   universidade_id  integer,
       primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    
    create table disciplina (
       id integer not null auto_increment,
	   descricao varchar(255),
	   professor_id integer,
	   curso_id  integer,
	   primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    
     create table professor (
       id integer not null auto_increment,
	   nome varchar(255),
	   primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    
    create table universidade (
       id integer not null auto_increment,
	   cnpj varchar(255),
	   razao varchar(255),
	   primary key (id)
    ) engine=InnoDB default charset=utf8MB4;