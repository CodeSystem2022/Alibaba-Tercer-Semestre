-- comencemos con CRUD: (create(insertar),read(leer),update(actualizar),delete(eliminar)
-- listar los estudiantes (read)
USE estudiantes;
SELECT * FROM estudiantes2022;
-- Insertar estudiante "Carla","Roldan","2614561235","roldan@mail.com","Carlos","Peralta","2617894658","peralta@mail.com";

INSERT INTO estudiantes2022(nombre,apellido,telefono,email) VALUES("Juan","Perez","2614545456","juan@mail.com");
-- Update (modificar- actualizar)
UPDATE estudiantes2022 SET nombre="Juan Carlos" ,apellido="Garcia" WHERE idestudiantes2022=1;

-- Delete
DELETE FROM estudiantes2022 WHERE idestudiantes2022=4;
-- Para modificar el idestudiantes2022 y comience en 1;
ALTER TABLE estudiantes2022 AUTO_INCREMENT = 1;


