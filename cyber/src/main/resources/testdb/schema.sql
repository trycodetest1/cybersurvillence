drop table WALLET if exists;
           
create table WALLET (ID bigint identity primary key, 
                   NAME varchar(50) not null,USERID varchar(50) not null,DESCRIPTION varchar(50),UTILIZEDAMOUNT bigint, WALLETID bigint );

drop table Transaction if exists;            

create table TRANSACTION (ID bigint identity primary key, 
                   TRANSACTIONTYPE varchar(50) not null, TRANSACTIONAMOUNT bigint not null,DESCRIPTION varchar(50), TRANSACTIONNUMBER varchar(50),USERID varchar(50) );

drop table OPERATOR if exists; 
create table OPERATOR (ID bigint identity primary key, 
                   NAME varchar(50) not null,     DESCRIPTION varchar(50), CODE varchar(50), TYPE varchar(50) );
                   
            drop table RECHARGE if exists;           
drop table PAYMENT if exists;               				   
create table PAYMENT (ID bigint identity primary key, 
                    ACCOUNTNUMBER bigint not null,TYPE varchar(50) not null, AMOUNT bigint not null,DESCRIPTION varchar(50),OPERATOR varchar(50) ,USERID varchar(50) );