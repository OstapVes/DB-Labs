#1.
SELECT trip_no, town_from, town_to FROM labor_sql.trip
where town_from!= "Rostov" and town_to!="Rostov"
order by plane;

#2.
select name from battles
where name like '% %' and name not like "% %c";

#3. 
SELECT maker, pc.model, pc.price FROM pc join product;

#4.
SELECT distinct maker FROM product
where maker = SOME (select maker from product where type='PC' or type='Laptop');


#5. 
SELECT * FROM Product WHERE
`type`='Laptop' AND model = ANY(SELECT model FROM Laptop WHERE speed >= 750)
OR
`type`='PC' AND model = ANY(SELECT model FROM PC WHERE speed >= 750);

#6. БД «Кораблі». Вивести значення таблиці Ships із коментарями, наприклад, 'name: California', 'class: Tennessee', 'launched: 1921'.

SELECT 'name: ' , name name, 'class: ', class class, 'launched: ', launched launched FROM Ships


#7. 
Select count(pass_in_trip.trip_no) as trip_count, pass_in_trip.date from pass_in_trip join trip on pass_in_trip.trip_no=trip.trip_no 
where town_to="London"  group by date;

#8.
select outcomes.ship, displacement, numGuns from ships join classes on ships.class=classes.class join outcomes on ships.name=outcomes.ship join battles on battles.name=outcomes.battle
where battles.name='Guadalcanal';

#9. 
SELECT case when type='PC' then 'pc' when type='Laptop' then 'No' end as аvailability 
,   e.* FROM product e;


#10.
select classes.class, count(name) from classes right join (select name, class from Ships
union select ship, null from outcomes) s on classes.class = s.class
group by classes.class