DROP table IF EXISTS workers;

create table workers(
	id int auto_increment,
	name varchar(250),
	work enum('developer','tester','analyst'),
	salary double
);

insert into workers (name,work,salary) values ('Pepon','developer',0);
insert into workers (name,work,salary) values ('Pepe','tester',0);
insert into workers (name,work,salary) values ('Pepita','analyst',0);