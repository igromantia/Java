--Категории
INSERT into category(id,name,parent_id) values (1, 'ИГРУШКИ', null);
INSERT into category(id,name,parent_id) values (2, 'БЫТОВАЯ ТЕХНИКА', null);
INSERT into category(id,name,parent_id) values (3, 'ЭЛЕКТРОНИКА', null);
INSERT into category(id,name,parent_id) values (4, 'ХОЛОДИЛЬНИКИ', 2);
INSERT into category(id,name,parent_id) values (5, 'ТЕЛЕВИЗОРЫ', 2);
INSERT into category(id,name,parent_id) values (6, 'СТИРАЛЬНЫЕ МАШИНЫ', 2);
INSERT into category(id,name,parent_id) values (7, 'СМАРТФОНЫ', 3);
INSERT into category(id,name,parent_id) values (8, 'КОМПЬЮТЕРЫ', 3);
INSERT into category(id,name,parent_id) values (9, 'ПРИНТЕРЫ', 3);