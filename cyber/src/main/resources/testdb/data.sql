insert into WALLET ( NAME,USERID,DESCRIPTION,UTILIZEDAMOUNT,WALLETID) values ('Akshay','asjadhav','retail user',10000,1);
insert into WALLET ( NAME,USERID,DESCRIPTION,UTILIZEDAMOUNT,WALLETID) values ('Admin1','admin','admin user',20000,2);
insert into WALLET ( NAME,USERID,DESCRIPTION,UTILIZEDAMOUNT,WALLETID) values ('Corporate1','coporate','corporate user',25000,3);

                        
insert into TRANSACTION ( TRANSACTIONTYPE,TRANSACTIONAMOUNT,DESCRIPTION,TRANSACTIONNUMBER,USERID) values ('POSTPAID RECHARGE',500,'mobile recharge','22222222','asjadhav');
insert into TRANSACTION ( TRANSACTIONTYPE,TRANSACTIONAMOUNT,DESCRIPTION,TRANSACTIONNUMBER,USERID) values ('PREPAID RECHARGE',100,'mobile recharge','33333333','admin');
insert into TRANSACTION ( TRANSACTIONTYPE,TRANSACTIONAMOUNT,DESCRIPTION,TRANSACTIONNUMBER,USERID) values ('POSTPAID RECHARGE',300,'mobile recharge','444444444','asjadhav');
insert into TRANSACTION ( TRANSACTIONTYPE,TRANSACTIONAMOUNT,DESCRIPTION,TRANSACTIONNUMBER,USERID) values ('PREPAID RECHARGE',200,'mobile recharge','555555555','coporate');

insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('VODAFONE','Vodafone mobile networks','VF','phone');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('AIRTEL','Airtel mobile networks','AT','phone');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('RELIANCE JIO','Reliance Jio mobile networks','RJ','phone');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('IDEA','Idea mobile networks','ID','phone');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('Reliance Energy','Relaince Energy','RE','electricity');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('MSEB','Maharashtra State Energy Board','ME','electricity');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('TATA','Tata Energy Ltd','TE','electricity');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('MCGM','Mumbai MNC','MC','water');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('BMC','Mumbai Suburban MNC','BC','water');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('NMMC','Navi Mumbai MNC','NC','water');
insert into OPERATOR ( NAME,DESCRIPTION,CODE,TYPE) values ('TMC','Thane MNC','TC','water');

insert into PAYMENT (ACCOUNTNUMBER,TYPE,AMOUNT,DESCRIPTION,OPERATOR,USERID) values (999999,'POSTPAID',50,'A','VODAFONE','ADMIN');
insert into PAYMENT (ACCOUNTNUMBER,TYPE,AMOUNT,DESCRIPTION,OPERATOR,USERID) values (111111,'PREPAID',50,'A','JIO','CUSTOMER');
insert into PAYMENT (ACCOUNTNUMBER,TYPE,AMOUNT,DESCRIPTION,OPERATOR,USERID) values (2222222,'POSTPAID',50,'A','AIRTEL','CUSTOMER');
insert into PAYMENT (ACCOUNTNUMBER,TYPE,AMOUNT,DESCRIPTION,OPERATOR,USERID) values (333333,'PREPAID',50,'A','VODAFONE','ADMIN');
