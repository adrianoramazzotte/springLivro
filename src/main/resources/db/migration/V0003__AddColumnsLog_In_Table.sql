ALTER TABLE biblioteca
ADD usucriacao varchar(100);
ALTER TABLE biblioteca
ADD datacriacao datetime(6);
ALTER TABLE biblioteca
ADD usualteracao varchar(100);
ALTER TABLE biblioteca
ADD dataalteracao  datetime(6);

ALTER TABLE editora
ADD usucriacao varchar(100);
ALTER TABLE editora
ADD datacriacao datetime(6);
ALTER TABLE editora
ADD usualteracao varchar(100);
ALTER TABLE editora
ADD dataalteracao  datetime(6);

ALTER TABLE genero
ADD usucriacao varchar(100);
ALTER TABLE genero
ADD datacriacao datetime(6);
ALTER TABLE genero
ADD usualteracao varchar(100);
ALTER TABLE genero
ADD dataalteracao  datetime(6);

ALTER TABLE livro
ADD usucriacao varchar(100);
ALTER TABLE livro
ADD datacriacao datetime(6);
ALTER TABLE livro
ADD usualteracao varchar(100);
ALTER TABLE livro
ADD dataalteracao  datetime(6);

ALTER TABLE usuario
ADD usucriacao varchar(100);
ALTER TABLE usuario
ADD datacriacao datetime(6);
ALTER TABLE usuario
ADD usualteracao varchar(100);
ALTER TABLE usuario
ADD dataalteracao  datetime(6);

