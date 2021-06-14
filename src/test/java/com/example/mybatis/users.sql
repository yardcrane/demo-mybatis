CREATE SEQUENCE users_seq;

create table users (
user_id integer not null  DEFAULT nextval('users_seq'),
user_nickname varchar(20) not null,
user_name varchar(32) not null,
primary key(user_id) 
);

insert into users(user_nickname, user_name) values ('1', 'my name');