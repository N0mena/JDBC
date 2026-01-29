create table Product (
    id int primary key,
    name varchar(100) not null,
    price number not null,
    creation_date timestamp
);
create table Product_category(
    id int primary key,
    name varchar(100) not null,
    product_id int references Product(id)
);
