       alter table usuario 
       add constraint FKusuario_serie
       foreign key (serie_id) 
       references serie (id);