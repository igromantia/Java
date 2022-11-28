--Статусы заказа
INSERT INTO status_order(id, name, finished) values (1, 'Обрабатывается', false);
INSERT INTO status_order(id, name, finished) values (2, 'Сборка заказа на складе', false);
INSERT INTO status_order(id, name, finished) values (3, 'Передан в службу доставки', false);
INSERT INTO status_order(id, name, finished) values (4, 'Завершен', true);
--Способ доставки
INSERT INTO Way_delivery(id, name) values (1, 'Почта России');
INSERT INTO Way_delivery(id, name) values (2, 'Курьерская доставка');
INSERT INTO Way_delivery(id, name) values (3, 'Самовывоз');
