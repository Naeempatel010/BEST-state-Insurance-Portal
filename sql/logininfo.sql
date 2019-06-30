create table logininfo(

checkno int not null primary key,
password varchar(30) not null


);
use employeeinsurance
																					
insert into logininfo values(214564,'214564');
insert into logininfo values(123456,'123456');
insert into logininfo values(098765,'098765');

select * from logininfo where checkno=123456 and password='1123456';
	 select count(*) from logininfo where checkno=123456 and password ='123456'