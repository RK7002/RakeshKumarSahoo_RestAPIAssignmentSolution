insert into employee (email,first_name,last_name) values ('rks@xyz.com','Rakesh','Sahoo');
insert into employee (email,first_name,last_name) values ('abc@xyz.com','Rahul','Gupta');
insert into employee (email,first_name,last_name) values ('cde@xyz.com','Sachin','Sharma');
insert into employee (email,first_name,last_name) values ('efg@xyz.com','Raghav','Rathore');
insert into employee (email,first_name,last_name) values ('a11@xyz.com','Varun','Kumar');
insert into employee (email,first_name,last_name) values ('b22@xyz.com','Vijay','Das');
insert into employee (email,first_name,last_name) values ('c33@xyz.com','Ashish','Modi');
insert into employee (email,first_name,last_name) values ('d44@xyz.com','Alok','Shah');
insert into employee (email,first_name,last_name) values ('e55@xyz.com','Raj','Singh');
insert into employee (email,first_name,last_name) values ('f66@xyz.com','Pappu','Gandhi');
insert into employee (email,first_name,last_name) values ('f66@xyz.com','Pappu','Singh');

-- ADMIN: [Rakesh/admin@123]
insert into users (user_name,password) values ('Rakesh','$2a$12$ISGwm.2Jnm4.ip3cNOSbf.2JvbAzrNaujI4RZhnzrmY.6jy7atfGa');
-- USER: [Rajesh/user@123]
insert into users (user_name,password) values ('Rajesh','$2a$12$Em/hSqccq8xe8qMcqW5nE.WwACqtcPp6Oms05zLCI4.dBxj7XaUJS');

insert into role (name) values ('ADMIN');
insert into role (name) values ('USER');

insert into user_roles values (1,1),(2,2);