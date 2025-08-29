	alter table escola
	add constraint FKescolaEndereco
	foreign key (endereco_id)
	references endereco (id);