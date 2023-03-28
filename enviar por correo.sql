create database tienda;
use tienda;
create table rol
(
id_rol tinyint unsigned primary key auto_increment not null,
Nombre_rol char (50) not null
);
create table TipoDoc(
Tipo_Documento char (40),
NumDoc int not null primary key
);
create table Usuario
(
NumDoc int ,
Id_Usuario tinyint unsigned primary key auto_increment not null,
id_rol tinyint unsigned not null,
foreign key (id_rol) references rol (id_rol),
Nombre_usuario char (50) not null,
Clave char (8) not null,
Fecreg date,
foreign key (NumDoc) references TipoDoc (NumDoc) 
);
create table cliente(
Id_Cliente int primary key,
Id_Usuario tinyint unsigned not null,
Nombre_Completo char (40),
Forma_de_Pago varchar (100),
Correo varchar (100),
Telefono int,
foreign key (Id_Usuario) references Usuario (Id_Usuario)
);
create table empleado(
Id_venta tinyint unsigned,
Id_Empleado int primary key,
Nombre_Completo char (40),
Telefono int,
Correo varchar (100),
foreign key (Id_venta) references venta (Id_venta)
);
create table proveedor
(
Id_Proveedor tinyint unsigned primary key auto_increment not null,
Nombre_completo char (50) not null,
Edad int not null,
Tipo_Documento char (30) not null,
Numero_Documento int not null,
Direccion char(40) not null,
Telefono tinyint not null,
Correo char(50) not null,
Estado_civil enum('soltero','casado','viudo') not null,
Genero enum('femenino','masculino') not null,
Nacionalidad char(50) not null,
RH enum('A+','O+','AB+') not null
);

create table venta
(
Id_venta tinyint unsigned primary key auto_increment not null,
valor_total tinyint unsigned not null,
cantidad_total tinyint unsigned not null
);
create table detalle_Venta(

Id_Venta tinyint unsigned not null,
foreign key (Id_Venta) references venta (Id_venta),
Id_Usuario tinyint unsigned not null,
foreign key (Id_Usuario) references Usuario(Id_Usuario)
);
create table producto
(
Id_producto tinyint unsigned primary key auto_increment not null,
Precio_unitario tinyint unsigned not null,
cantidad_existente tinyint unsigned not null
);
create table detalle_producto
(
Id_venta tinyint unsigned not null,
foreign key (Id_venta) references venta (Id_venta),
Id_producto tinyint unsigned not null,
foreign key (Id_producto) references producto (Id_producto),
cantidad_venta tinyint not null,
Precio_venta tinyint not null
);
create table pedido
(
Id_pedido tinyint unsigned primary key auto_increment not null,
Id_Usuario tinyint unsigned not null,
foreign key (Id_pedido) references Usuario (Id_Usuario),
Id_Proveedor tinyint unsigned not null,
foreign key (Id_pedido) references Proveedor (Id_Proveedor)
);
create table detalle_pedido 
(
Id_pedido tinyint unsigned not null,
foreign key (Id_pedido) references pedido (Id_pedido),
Id_producto tinyint unsigned not null,
foreign key (Id_producto) references producto (Id_producto),
Cantidad_pedido tinyint not null,
Precio_pedido tinyint not null
);
