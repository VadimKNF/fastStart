-- begin FASTSTART_CUSTOMER
create table FASTSTART_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    EMAIL varchar(50) not null,
    --
    primary key (ID)
)^
-- end FASTSTART_CUSTOMER
-- begin FASTSTART_ORDER
create table FASTSTART_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CUSTOMER_ID varchar(36),
    DATE_ date not null,
    AMOUNT decimal(19, 2),
    --
    primary key (ID)
)^
-- end FASTSTART_ORDER
