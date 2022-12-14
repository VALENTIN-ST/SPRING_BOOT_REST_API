---- REFRESH TOKEN
--create table refresh_tokens (
--    id bigserial not null primary key,
--    created_at timestamp without time zone not null default now(),
--    updated_at timestamp without time zone not null,
--    created_by character varying(255),
--    updated_by character varying(255),
--    expiry_date timestamp without time zone not null,
--    refresh_token character varying(255) not null,
--    id_user bigserial
--);
--
--alter table refresh_tokens
--    add constraint fk_refresh_token_user_id foreign key (id_user) references users(id);



-- REFRESH TOKEN
-- SQLINES LICENSE FOR EVALUATION USE ONLY
create table refresh_tokens (
    id number(19) not null primary key,
    created_at timestamp default systimestamp not null ,
    updated_at timestamp not null,
    created_by varchar2(255),
    updated_by varchar2(255),
    expiry_date timestamp not null,
    refresh_token varchar2(255) not null,
    id_user number(19)
);

CREATE SEQUENCE  REFRESH_TOKENS_ID_SEQ  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;

alter table refresh_tokens
    add constraint fk_refresh_token_user_id foreign key (id_user) references users(id);