-- begin FASTSTART_ORDER
alter table FASTSTART_ORDER add constraint FK_FASTSTART_ORDER_ON_CUSTOMER foreign key (CUSTOMER_ID) references FASTSTART_CUSTOMER(ID)^
create index IDX_FASTSTART_ORDER_ON_CUSTOMER on FASTSTART_ORDER (CUSTOMER_ID)^
-- end FASTSTART_ORDER
