    create table serie (
       id integer not null auto_increment,
       ano varchar(255),
       turma varchar(255),
       nome varchar(255),
       primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    
     alter table usuario 
       add serie_id int;
 
    

    
    