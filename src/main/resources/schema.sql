create table netology.customers (
id serial primary key,
name varchar(50) not null,
surname varchar(50) not null,
age int check (age >= 0),
phone_number varchar(12) not null
);
create table netology.orders (
id serial primary key,
date timestamp not null default current_timestamp,
customer_id int references netology.customers(id) on delete cascade,
product_name varchar(100) not null,
amount decimal(10,2) not null
);

