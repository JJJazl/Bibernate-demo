create table if not exists addresses (
    id SERIAL,
    city VARCHAR(255) NOT NULL,
    street VARCHAR(255) NOT NULL,
    number VARCHAR(255) NOT NULL,
    zip INTEGER NOT NULL,
    apartment VARCHAR(10) NOT NULL,
    person_id INTEGER NOT NULL,

    CONSTRAINT addresses_pk PRIMARY KEY (id),
    CONSTRAINT addresses_person_id_fk FOREIGN KEY (person_id) REFERENCES persons ON DELETE CASCADE,
    CONSTRAINT addresses_person_id_uq UNIQUE (person_id)
    );
