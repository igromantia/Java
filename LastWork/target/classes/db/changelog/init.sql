CREATE TABLE person
(
    id   serial not null,
    name varchar(255),
    address varchar(255),
    phone varchar(15),
    primary key (id)
);
CREATE TABLE orders_goods
(
    id   serial not null,
    person_id integer,
    status_order_id integer,
    way_delivery_id integer,
    address_delivery varchar(255),
    primary key (id)
);
CREATE TABLE row_orders
(
    id serial not null,
--    numberRowOrder integer,
    order_id integer,
    goods_id integer,
    quantity integer,
    primary key (id)
);

CREATE TABLE status_order
(
    id   serial not null,
    name varchar(255),
    finished boolean,
    primary key (id)
);
CREATE TABLE way_delivery
(
    id   serial not null,
    name varchar(255),
    primary key (id)
);
CREATE TABLE category
(
    id   serial not null,
    name varchar(255),
    parent_id integer,
    primary key (id)
);
CREATE TABLE goods
(
    id   serial not null,
    name varchar(255),
    category_id bigint,
    not_for_sail boolean,
    quantity bigint,
    primary key (id)
);
