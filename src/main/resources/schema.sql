create table contact
(
    id         bigserial       not null,
    first_name varchar(60) not null,
    last_name  varchar(40) not null,
    birth_date date,
    version    int         not null default 0,
    unique (first_name, last_name),
    primary key (id)
);

create table hobby
(
    hobby_id varchar(20) not null,
    primary key (hobby_id)
);

create table contact_tel_detail
(
    id         bigserial       not null ,
    contact_id bigint not null ,
    tel_type   varchar(20) not null,
    tel_number varchar(20) not null,
    version    int         not null default 0,
    unique (contact_id, tel_type),
    primary key (id),
    constraint fk_contact_tel_detail_1 foreign key (contact_id) references contact (id)
);

create table contact_hobby_detail
(
    contact_id bigint         not null,
    hobby_id   varchar(20) not null,
    primary key (contact_id, hobby_id),
    constraint fk_contact_hobby_detail_1 foreign key (contact_id)
        references contact (id) on delete cascade,
    constraint fk_contact_hobby_detail_2 foreign key (hobby_id)
        references hobby (hobby_id)
);