create table person (
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date  timestamp,
    primary key(id)
);

INSERT INTO  PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'Bobzero', 'Konya', current_date());
INSERT INTO  PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'TheProblem', 'Istanbul', current_date());
INSERT INTO  PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Komwe', 'Gongolamboto', current_date());
INSERT INTO  PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10004, 'Kibichwa', 'Kitunda', current_date());
INSERT INTO  PERSON(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10005, 'Kimamy', 'Mburahati', current_date());