create table if not exists notes (
    id SERIAL,
    title VARCHAR(128) NOT NULL,
    body VARCHAR(500) NOT NULL,
    person_id INTEGER NOT NULL,

    CONSTRAINT notes_pk PRIMARY KEY (id),
    CONSTRAINT addresses_person_id_fk FOREIGN KEY (person_id) REFERENCES persons ON DELETE CASCADE
);
