
drop table tipoResponsable;
create table tipoResponsable
(
   tipoResponsableId integer not null,
   descripcion varchar(255) not null,
   primary key(tipoResponsableId)
);

drop table empresa;
create table empresa
(
   empresaID integer auto_increment not null,
   razonSocial varchar(255) not null,
   cuit varchar(255) not null,
   telefono varchar(255) null,
   tipoResponsableId int,
   primary key(empresaID ),
   foreign key (tipoResponsableId) REFERENCES tipoResponsable(tipoResponsableId)
);
