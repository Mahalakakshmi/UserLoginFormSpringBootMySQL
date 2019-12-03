create table userdata(
     userid int auto_increment not null,
     firstname  varchar(10),
     lastname  varchar(10),
     corprategroupid smallint not null,
     email varchar(320),
     password  varchar(320) ,
     account_locked bool not null,
     enabled bool not null,
     createdDate Date,
     expiryDate  Date,
     postcode  varchar,
     primary key( userid)       
);