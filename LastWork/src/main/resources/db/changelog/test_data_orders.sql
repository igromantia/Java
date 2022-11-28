--Заказы
INSERT INTO orders_goods(id, person_id, status_order_id, way_delivery_id,address_delivery)
    values (1, 2, 1, 2, 'ул.Возрождения, 17');
INSERT INTO orders_goods(id, person_id, status_order_id, way_delivery_id,address_delivery)
    values (2, 1, 3, 1, 'пл.Революции, 1');
INSERT INTO orders_goods(id, person_id, status_order_id, way_delivery_id,address_delivery)
    values (3, 3, 4, 3, 'пр.Маршала Казакова, 13');
INSERT INTO orders_goods(id, person_id, status_order_id, way_delivery_id,address_delivery)
    values (4, 2, 3, 2, 'ул.Прачечная, 24');
--Товыры в заказах
INSERT INTO row_orders(id,  order_id, goods_id, quantity) values (1, 1, 2, 1);
INSERT INTO row_orders(id,  order_id, goods_id, quantity) values (2, 1, 5, 1);
INSERT INTO row_orders(id,  order_id, goods_id, quantity) values (3, 2, 7, 2);
INSERT INTO row_orders(id,  order_id, goods_id, quantity) values (4, 2, 3, 1);
INSERT INTO row_orders(id,  order_id, goods_id, quantity) values (5, 3, 9, 1);
INSERT INTO row_orders(id,  order_id, goods_id, quantity) values (6, 4, 7, 2);
INSERT INTO row_orders(id,  order_id, goods_id, quantity) values (7, 4, 1, 1);
