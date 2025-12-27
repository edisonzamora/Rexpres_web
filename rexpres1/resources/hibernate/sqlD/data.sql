insert into usuario (nombre, apellido, correo, activo) values ('Juan','martinez','juan@gmail.com', 0 );
insert into usuario (nombre, apellido, correo, activo) values ('Edison','Zamora','edison@gmail.com', 1);
insert into usuario (nombre, apellido, correo, activo) values ('Maria','Mendoza','maria@gmail.com', 0);
insert into usuario (nombre, apellido, correo, activo) values ('Jorge','San Pedro','jorge@gmail.com', 1);
insert into usuario (nombre, apellido, correo, activo) values ('Reina','Daudo','Reina@gmail.com', 1);
insert into usuario (nombre, apellido, correo, activo) values ('Edison','Zamora','edisonzamora@gmail.com',0);
insert into usuario (nombre, apellido, correo, activo) values ('Wilson','Zamora','wilson@gmail.com',1);

insert into aplicacion (codigo, nombre, descripcion) values ('APP_01','admin-user','aplicacion de administracion de la aplicacion user');
insert into aplicacion (codigo, nombre, descripcion) values ('APP_02','user','aplicacion para gestionar usuarios de una tienda');
insert into aplicacion (codigo, nombre, descripcion) values ('APP_03','Rexpres','aplicacion antigua');
insert into aplicacion (codigo, nombre, descripcion) values ('APP_04','Rexpres1','aplicacion version 1.0 de Rexpres');

insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_001','Alta Cliente','cualquier cosa',1);
insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_002','baja Cliente','cualquier cosa',1);
insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_003','Alta Cliente','cualquier cosa',2);
insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_004','baja Cliente','cualquier cosa',2);
insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_006','Alta Cliente','cualquier cosa',3);
insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_007','baja Cliente','cualquier cosa',3);
insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_009','Alta Cliente','cualquier cosa',4);
insert into funcion(codigo, nombre, descripcion, id_aplicacion) values ('F_010','baja Cliente','cualquier cosa',4);


insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (1,1,1,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (3,2,0,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (3,3,1,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (7,4,1,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (5,2,1,'2025-10-01');

insert into aplicacion_funcion_usuario (id_usuario, id_aplicacion, id_funcion, role_usuario) values (1,1,1,'ADM');


--pediente de cambiar tabla
--insert into role (codigo, valor) values ('ADM','ADMINISTRADOR');
--insert into role (codigo, valor) values ('USU','USUARIO');

--insert into conf_rexpres (codigo, valor, activo) values ('','',1);
--insert into conf_rexpres (codigo, valor, activo) values ('','',0);
