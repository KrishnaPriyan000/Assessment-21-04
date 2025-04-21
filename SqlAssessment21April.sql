-- Q1
CREATE TABLE students(
id serial primary key,
name varchar(30) not null,
email varchar(100) unique,
age int,
marks decimal(3,1)
);

INSERT INTO students VALUES (1,'SAM','sammy@gmail.com',21,22);
INSERT INTO students VALUES (2,'RAMU','ramu@gmail.com',19,30);
INSERT INTO students VALUES (3,'ROHAN','rohan@gmail.com',16,23);
INSERT INTO students VALUES (4,'HAN','han@gmail.com',15,25);
INSERT INTO students VALUES (5,'MOHAN','mohan@gmail.com',16,25);



select * from students;

-- Q2
select age from students where age>21;

-- Q3
update students set email = 'rahul@gmail.com' where id = 5;
select * from students;

-- Q4
delete from students where age<18;
select * from students;


-- Q5
select name,marks from students order by marks desc limit 1 offset 1;

-- Q6
create table studentss(
id int,
name varchar,
age int
);

create table courses(
course_id int,
student_id int,
course_name varchar
);

insert into studentss values(1,'Rahul',22);
insert into studentss values(2,'Priya',21);
insert into studentss values(3,'Akash',23);

insert into courses values(101,1,'Java');
insert into courses values(102,2,'Python');
insert into courses values(103,1,'SQL');

select s.name,c.course_name from studentss s inner join courses c on c.student_id = s.id;


