
CREATE TABLE usuario (
    idusuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100),
    correo VARCHAR(100) NOT NULL UNIQUE,
    activo INT
);
CREATE TABLE aplicacion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(100) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE funcion (
    id INT PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR(100) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255),
    id_aplicacion INT NOT NULL,
    FOREIGN KEY (id_aplicacion) REFERENCES Aplicacion(id)
);

CREATE TABLE aplicacion_usuario (
    id_usuario INT NOT NULL,
    id_aplicacion INT NOT NULL,
    activo INT DEFAULT 1,
    fecha_alta DATE,
    fecha_baja DATE,
    PRIMARY KEY (id_usuario, id_aplicacion),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(idusuario),
    FOREIGN KEY (id_aplicacion) REFERENCES Aplicacion(id)
);
CREATE TABLE aplicacion_funcion_usuario (
    id_usuario INT NOT NULL,
    id_aplicacion INT NOT NULL,
    id_funcion INT NOT NULL,
    role_usuario VARCHAR(10),
    PRIMARY KEY (id_usuario, id_aplicacion, id_funcion),
    FOREIGN KEY (id_usuario) REFERENCES Usuario(idusuario),
    FOREIGN KEY (id_aplicacion) REFERENCES Aplicacion(id),
    FOREIGN KEY (id_funcion) REFERENCES Funcion(id)
);

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

insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_001','Alta Cliente','cualquier cosa',1);
insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_002','baja Cliente','cualquier cosa',1);
insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_003','Alta Cliente','cualquier cosa',2);
insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_004','baja Cliente','cualquier cosa',2);
insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_006','Alta Cliente','cualquier cosa',3);
insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_007','baja Cliente','cualquier cosa',3);
insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_009','Alta Cliente','cualquier cosa',4);
insert into funcion (codigo, nombre, descripcion, id_aplicacion) values ('F_010','baja Cliente','cualquier cosa',4);


insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (1,1,1,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (2,2,0,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (3,3,1,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (7,4,1,'2025-10-01');
insert into aplicacion_usuario (id_usuario, id_aplicacion, activo,fecha_alta) values (5,2,1,'2025-10-01');

insert into aplicacion_funcion_usuario (id_usuario, id_aplicacion, id_funcion, role_usuario) values (1,1,1,'ADM');


--pediente de cambiar tabla
--insert into role (codigo, valor) values ('ADM','ADMINISTRADOR');
--insert into role (codigo, valor) values ('USU','USUARIO');

--insert into conf_rexpres (codigo, valor, activo) values ('','',1);
--insert into conf_rexpres (codigo, valor, activo) values ('','',0);
