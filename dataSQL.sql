drop database if exists snappBook;
create database snappBook character set utf8;
use snappBook;

create table bookType (typeID int primary key auto_increment
                      ,typeName varchar(20) not null unique
                      ,typeDesc varchar(100));

insert into bookType values (10001,'小说','各种小说')
                           ,(null,'教育书','用于教育的书')
                           ,(null,'字典','');

create table books  (bookID int primary key auto_increment
                    ,bookTypeID int not null
                    ,bookName varchar(20) not null unique
                    ,bookPrice decimal(20) not null
                    ,bookNumber int not null
                    ,bookDesc varchar(100)
                    ,constraint foreign key (bookTypeID) references bookType(typeID));

insert into books values (10001,10001,'西游记',120,20,'非常好'),
                         (null,10001,'三国演义',120,25,'非常好'),
                         (null,10001,'红楼梦',120,4,'非常好'),
                         (null,10002,'java高级',210,12,'晦涩'),
                         (null,10001,'新华字典',32,20,'猪肉价');