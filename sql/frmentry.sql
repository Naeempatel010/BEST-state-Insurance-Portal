create table testt(
use employeeinsurance
id int identity(1,1),
val int 
);
drop table testt;
insert into testt(val) values(1)
set identity_insert testt on
insert into testt(id,val) values(1,1)
select * from testt
select ident_current('testt')
select * from empinfo
select * from contractorinfo


create function calesigovt(@salary int,@jdays int)
returns float
with schemabinding
as 
begin
declare @esigovt float;
declare @dailywage float;
set @dailywage=@salary/@jdays	
if @dailywage>808
begin 
set @esigovt=0
end
else
begin
set @esigovt=(1.75*@salary)/100.0
end

return @esigovt
end
drop table frmentry
create table frmentry(
advno int identity(1,1) not null,
cid int not null,
empid int not null,
jdays int not null,
salary int not null,
jdate date not null,
nofwork varchar(40),
zon varchar(10) not null,
esigovt  as dbo.calesigovt(salary,jdays) persisted,
esiemp as dbo.calesiemp(salary,jdays) persisted,
servic varchar(10) not null,
foreign key(cid) references contractorinfo(id),
foreign key(empid) references empinfo(id)
);
drop function calesiemp
drop function calesigovt
create function calesiemp(@salary int,@jdays int)
returns float
with schemabinding
as 
begin
declare @esiemp float;
declare @dailywage float;
set @dailywage=@salary/@jdays	
if @dailywage>808
begin 
set @esiemp=(6.50*@salary)/100.0
end
else
begin
set @esiemp=(4.75*@salary)/100.0
end

return @esiemp
end
select * from contractorinfo
select * from empinfo
select * from frmentry;




alter procedure entrysec
(
@cid int,
@empid int,
@jdays int,
@jdate date,
@salary int,
@nofwork varchar(40),
@zon varchar(10),
@servic varchar(10),
@wardno varchar(15),
@createdby int 
)
as 
begin
set identity_insert frmentry on
insert into frmentry(advno,cid,empid,jdays,jdate,salary,nofwork,zon,servic,wardno,createdby) values(ident_current('frmentry'),@cid,@empid,@jdays,@jdate,@salary,@nofwork,@zon,@servic,@wardno,@createdby)
end
use employeeinsurance
select * from frmentry
select * from empinfo
delete from frmentry where cid>3
alter table frmentry add createdat date default getdate()
set identity_insert frmentry on
insert into frmentry(advno,cid,empid,jdays,jdate,salary,nofwork,zon,servic) values(ident_current('frmentry'),8,15,10,'2018-01-01',9876,'this is simple','N','YES')
insert into frmentry(cid,empid,jdays,jdate,salary,nofwork,zon,servic) values(9,17,24,'2018-01-01',10000,'this is simple','N','YES')
exec entrysec @cid=8,@empid=15,@jdays=10,@jdate='2018-01-01',@salary='10000',@nofwork='dummy',@zon='n',@servic='yes'

alter procedure entryfirst
(
@cid int,
@empid int,
@jdays int,
@jdate date,
@salary int,
@nofwork varchar(40),
@zon varchar(10),
@servic varchar(10),
@wardno varchar(15),
@createdby int
)
as 
begin	
insert into frmentry(cid,empid,jdays,jdate,salary,nofwork,zon,servic,wardno,createdby) values(@cid,@empid,@jdays,@jdate,@salary,@nofwork,@zon,@servic,@wardno,@createdby)
end
