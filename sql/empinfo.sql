create table empinfo(
insno varchar(15) not null unique,
id int not null identity(1,1) primary key,
userid int not null ,
empname varchar(20) not null,
bdate date not null,
jdate date not null,
ldate date,
datestamp date default getdate(),
timecreated time default convert(Time,getdate()),
checkno int default null,
foreign key (userid) references logininfo(checkno) 


);
use employeeinsurance
drop table empinfo
select * from empinfo
delete from empinfo where id=4;
insert into empinfo(insno,empname,bdate,jdate,ldate,checkno,userid) values(1,'A','0001-01-01','0001-01-01','0001-01-01',1234,123456);