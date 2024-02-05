create table if not exists persons (
    id SERIAL,
    first_name VARCHAR(128) NOT NULL,
    last_name VARCHAR(128) NOT NULL,

    CONSTRAINT persons_pk PRIMARY KEY (id)
);
