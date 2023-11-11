create table if not exists category(
    id int primary key AUTO_INCREMENT,
    name varchar(255),
    description varchar(255)
);

create table product(
    id int primary key AUTO_INCREMENT,
    name varchar(255),
    description varchar(255),
    price double,
    categoryId int,
    foreign key references category(id)
);