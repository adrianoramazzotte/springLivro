create table permissao(
        id integer not null auto_increment,
        descricao varchar(100),
        classepermissao_id int,
		primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    
 create table usuario_permissao (
		id_usuario int,
		id_permissao int,
		primary key (id_usuario, id_permissao)	
	)engine=InnoDB default charset=utf8MB4;
	
 create table classepermissao (
        id int not null auto_increment,
        nome varchar(100),
  		permission varchar(100),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    
 alter table usuario_permissao
       add constraint FK_UsuPermissao_Usu
       foreign key (id_usuario) 
       references usuario(id);
	   
 alter table usuario_permissao
       add constraint FK_UsuPermissao_Permissao
       foreign key (id_permissao) 
       references permissao(id);
