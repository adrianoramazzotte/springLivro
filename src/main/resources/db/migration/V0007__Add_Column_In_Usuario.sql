   ALTER TABLE usuario
    ADD escola_id int;
   
   
    alter table usuario
	add constraint FKusuario_escola
	foreign key (escola_id)
	references escola (id);
	
	alter table escola
	add constraint FKescolaBiblio
	foreign key (biblio_id)
	references biblioteca (id);