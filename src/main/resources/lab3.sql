create database Vesolovskyi;
use Vesolovskyi;


create table pizza_composition
(id int not null auto_increment primary key,
name varchar(30) not null unique);


create table additives_for_pizza
(id int not null auto_increment primary key,
name varchar(15) not null unique,
callories int,
price int);


create table pizza 
(id int not null auto_increment primary key,
name varchar(15) not null unique,
price INT NOT NULL,
callories int,
weight int,
size VARCHAR(5),
id_add int not null,
id_composition int not null,
constraint FK_additives_for_pizza
foreign key(id_add)
references additives_for_pizza(id),
constraint FK_pizza_composition
foreign key(id_composition)
references pizza_composition(id));
 
 
create table drink
(id int not null auto_increment primary key,
name varchar(15) not null unique,
size VARCHAR(5),
price INT NOT NULL,
callories int);


create table salad
(id int not null auto_increment primary key,
name varchar(15) not null unique,
price INT NOT NULL,
composition varchar(95),
weight varchar(10),
callories int);


create table address
(id int not null auto_increment primary key,
name varchar(45) not null);


create table delivery
(id int not null auto_increment primary key,
name varchar(45) not null default'LA_PEZ',
address varchar(45), 
work_schedule varchar(15),
delivery_time varchar(7),
discount varchar(45),
payment_method varchar(15),
id_address int not null,
id_pizza int not null,
id_drink int not null,
id_salad int not null,
constraint FK_address
foreign key(id_address)
references address(id),
constraint FK_pizza
foreign key(id_pizza)
references pizza(id),
constraint FK_drink
foreign key(id_drink)
references drink(id),
constraint FK_salad
foreign key(id_salad)
references salad(id));


create table street
(id int not null auto_increment primary key,
name varchar(15) not null unique);


create table city
(id int not null auto_increment primary key,
name varchar(15) not null unique);

create table client
(id int not null auto_increment primary key,
name varchar(15) not null default'Quest',
tel_number varchar(13) ,
address varchar(45),
payment_for_delivery varchar(15),
id_city int not null,
id_street int not null,
constraint FK_city
foreign key(id_city)
references city(id),
constraint FK_street
foreign key(id_street)
references street(id));


create table courier
(id int not null auto_increment primary key,
name varchar(15) not null,
tel_number varchar(13) not null,
location varchar(45) not null,
transport varchar(15) not null,
fulfilled_the_order int);


create table client_has_delivery
(id int not null auto_increment primary key,
id_client int not null,
id_delivery int not null,
constraint FK_client
foreign key(id_client)
references client(id),
constraint FK_delivery
foreign key(id_delivery)
references delivery(id));


create table delivery_has_courier
(id int not null auto_increment primary key,
id_courier int not null,
id_delivery int not null,
constraint FK_courier
foreign key(id_courier)
references courier(id),
constraint FK_deliveryy
foreign key(id_delivery)
references delivery(id));


insert into vesolovskyi.additives_for_pizza(name, callories, price) 
values ('Ham', 100, 30), ('Sausages', 150, 20), ('Pepper', 20, 10), ('Olives', 30, 15), ('Cheese', 90, 45);


insert into vesolovskyi.pizza_composition(name) 
values ('Meat'), ('Vegetables'), ('Cheese'), ('Sauce');


insert into vesolovskyi.pizza(name, price, id_add,
id_composition) 
values ('Italian', 200, 3, 3), ('California', 180, 2, 1), ('Greek ', 160, 3, 4), ('Detroit ', 150, 1, 1), 
('Neapolitan ', 190, 4, 1), ('Chicago ', 180, 1, 4);


insert into vesolovskyi.drink(name, price, size) 
values ('Coca-cola', 30, '0,5l'), ('Pepsi', 30, '0,5l'), ('Fanta', 30, '0,5l'), ('Sprite', 25, '0,5l'), 
('Mineral water', 10, '0,5l'), ('Beer', 40, '0,5l');


insert into vesolovskyi.salad(name, price, weight) 
values ('Cobb', 80, 350), ('Coleslaw', 90, 400), ('Cookie ', 140, 500), ('Crab Louie', 80, 200),
 ('Ambrosia', 150, 400), ('Asinan', 60, 150);


insert into vesolovskyi.address(name) 
values ('Lviv, st.Zelena 95'), ('Kyiv, st.Shevchenka 5'), ('Kharkiv, st.Polyuya 289'), 
('Drohobych, st.V.Velykoho 25'), ('Rivne, st.Kovaliva 435');


insert into vesolovskyi.delivery(work_schedule, id_address, id_pizza , id_drink , id_salad) 
values ('08:00-23:00', 1, 1, 2,3), ('08:00-23:00', 2, 3, 2, 1), ('08:00-23:00', 3, 3, 2, 2), 
('08:00-23:00', 4, 1, 1, 1), ('08:00-23:00', 5, 2, 2, 2);


insert into vesolovskyi.city(name) 
values ('Kyiv'), ('Kharkov'), ('Lviv'), ('Drohobych'), ('Rivne');


insert into vesolovskyi.street(name) 
values ('Zelena'), ('St.Bandery'), ('V.Velykoho'), ('Polyuya'), ('Kovaliva'), ('Shevchenka'), ('Stryiska'), 
('Chornovola'), ('Usa'), ('Karba');


insert into vesolovskyi.client(tel_number, id_city, id_street) 
values (78855, 1, 2), (47654, 1, 3), (543545, 3, 5), (3455456, 5, 2), (7654456, 4, 4), (45653456, 4, 1), 
(345543456, 3, 2), (454545433, 2, 3), (0987645, 2, 5), (45435656, 1, 4);


insert into vesolovskyi.courier(name , tel_number , location , transport) 
values ('Tom', 6789876, '4567899876', 'Car'), ('Ban', 45545, '45765434', 'Bike'), 
('Bob', 34343332, '456645457899876', 'Motorcycle'), ('John', 65434, '3454345', 'Bike'), 
('Jes', 43553, '3546564646', 'Car');


insert into vesolovskyi.client_has_delivery(id_client, id_delivery) 
values (1, 4), (2, 3), (3, 4), (1, 5), (2, 4), (3, 3);

insert into vesolovskyi.delivery_has_courier(id_courier, id_delivery) 
values (2, 4), (4, 3), (1, 2), (2, 1), (2, 3), (3, 3);






