    create table biblioteca (
       id integer not null auto_increment,
        nome varchar(255),
        endereco_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    create table editora (
       id integer not null auto_increment,
        cpfoucnpjnpj varchar(255),
        email varchar(255),
        razao varchar(255),
        telefone varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    create table endereco (
       id integer not null auto_increment,
        bairro varchar(255),
        cep varchar(255),
        cidade varchar(255),
        complemento varchar(255),
        logradouro varchar(255),
        numero varchar(255),
        uf varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    create table genero (
       id integer not null auto_increment,
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    create table livro (
       id integer not null auto_increment,
        ano varchar(255),
        autor varchar(255),
        classificacao varchar(255),
        codigo varchar(255),
        status varchar(255),
        titulo varchar(255),
        biblioteca_id integer,
        editora_id integer,
        genero_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    create table locacao (
       id integer not null auto_increment,
        datadevolucao datetime,
        datalocacao datetime,
        multadiaria decimal(19,2),
        valor_livro decimal(19,2),
        cliente_id integer,
        funcionario_id integer,
        livro_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    create table reserva (
       id integer not null auto_increment,
        datalocacao datetime,
        biblio_id integer,
        livro_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    create table usuario (
       id integer not null auto_increment,
        cpf varchar(255),
        documentoendereco varchar(255),
        email varchar(255),
        nome varchar(255),
        qrcode varchar(255),
        ra varchar(255),
        senha varchar(255),
        status varchar(255),
        telefone varchar(255),
        tipo varchar(255),
        biblio_id integer,
        primary key (id)
    ) engine=InnoDB default charset=utf8MB4;
    alter table biblioteca 
       add constraint FKenderecobiblioteca
       foreign key (endereco_id) 
       references endereco (id);
    alter table livro 
       add constraint FKbibliotecalivro 
       foreign key (biblioteca_id) 
       references biblioteca (id);
    alter table livro 
       add constraint FKeditoraLivro
       foreign key (editora_id) 
       references editora (id);
    alter table livro 
       add constraint FKgenerolivro
       foreign key (genero_id) 
       references genero (id);
    alter table locacao 
       add constraint FKclientelocacao
       foreign key (cliente_id) 
       references usuario (id);
    alter table locacao 
       add constraint FKfuncionariolocacao
       foreign key (funcionario_id) 
       references usuario (id);
    alter table locacao 
       add constraint FKlivrolivro
       foreign key (livro_id) 
       references livro (id);
    alter table reserva 
       add constraint FKbiblioreserva 
       foreign key (biblio_id) 
       references biblioteca (id);
    alter table reserva 
       add constraint FKlivroreserva
       foreign key (livro_id) 
       references livro (id);
    alter table usuario 
       add constraint FKbibliousuario
       foreign key (biblio_id) 
       references biblioteca (id);
