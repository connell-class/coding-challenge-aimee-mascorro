create schema groceries;

create table shoppinglist(
	shoppingid serial primary key,
	shopping text	
);

create table shoppingitems(
	itemid serial primary key,
	itemtype text,
	itemdescription text,
	shoppinglistid int
);

alter table "shoppingitems" add foreign key (shoppinglistid) references shoppinglist (shoppingid);

COMMIT;

select itemdescription, itemtype from "shoppingitems" where shoppinglistid = '3';
select* from "shoppingitems", "shoppinglist" where shoppinglistid = shoppinglist.shoppingid;

insert into shoppinglist ("shopping") values ('redecorating');

select * from shoppinglist;
select * from shoppingitems;

insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('bakery', 'sweet bread', 1 );
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('dairy', 'half and half milk', 1 );
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('sandwiches', 'peanut butter', 1 );
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('sandwiches', 'sliced bread', 1 );

insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('sandwiches', 'ham', 2 );
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('sandwiches', 'mayo', 2 );
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('vegetables', 'tomato', 2 );

insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('shoes', 'black boots', 3 );
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('pants', 'bootcut pants', 3);

insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('lights', 'powersaving lightbulbs', 4);
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ( 'lights', 'lamp shade', 4);
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('paint', 'cyan blue paint', 4);
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('curtains', '15 mts cyan blue curtain cloth', 4);
insert into shoppingitems ("itemtype", "itemdescription", "shoppinglistid") values ('paint', '2L coral pink paint', 4);

select * from shoppingitems;
