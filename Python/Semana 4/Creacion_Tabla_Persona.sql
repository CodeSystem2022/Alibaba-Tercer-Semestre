-- Crea la secuencia
CREATE SEQUENCE IF NOT EXISTS persona_id_persona_seq;

-- Crea la tabla persona
CREATE TABLE IF NOT EXISTS public.persona
(
    id_persona integer NOT NULL DEFAULT nextval('persona_id_persona_seq'),
    nombre character varying COLLATE pg_catalog."default",
    apellido character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    CONSTRAINT persona_pkey PRIMARY KEY (id_persona)
)
TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.persona
    OWNER to postgres;

-- Inserta datos en la tabla persona
INSERT INTO persona(nombre,apellido,email) VALUES ('Susana','Lara','slara@mail.com');
INSERT INTO persona(nombre,apellido,email) VALUES ('Lorena','Gutierrez','lgutierrez@mail.com');

-- Selecciona todas las filas de la tabla persona
SELECT * FROM persona;