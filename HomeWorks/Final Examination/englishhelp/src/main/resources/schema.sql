create table if not exists users_existing
(
    username VARCHAR(50) not null,
    series VARCHAR(50) not null,
    tokens VARCHAR(50) not null,
    last_used timestamp not null,
    primary key (series)
);