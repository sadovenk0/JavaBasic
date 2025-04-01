CREATE TABLE students
(
    id                 SERIAL PRIMARY KEY,
    last_name          VARCHAR(50)        NOT NULL,
    first_name         VARCHAR(50)        NOT NULL,
    middle_name        VARCHAR(50),
    birth_date         DATE               NOT NULL,
    record_book_number VARCHAR(20) UNIQUE NOT NULL
);

INSERT INTO students (last_name, first_name, middle_name, birth_date, record_book_number)
VALUES ('Petrov', 'Dmitry', 'Ivanovich', '2000-01-25', 'S001'),
       ('Sidorov', 'Alexey', 'Petrovich', '2001-02-18', 'S002'),
       ('Kuznetsov', 'Sergey', 'Vladimirovich', '2002-03-09', 'S003'),
       ('Ivanov', 'Nikolay', 'Mikhailovich', '2000-04-30', 'S004'),
       ('Smirnov', 'Anna', 'Alexandrovna', '2001-05-12', 'S005'),
       ('Volkov', 'Andrey', 'Pavlovich', '2002-07-27', 'S006'),
       ('Fedorova', 'Olga', 'Sergeevna', '2000-08-14', 'S007'),
       ('Mikhailov', 'Timofey', 'Grigorievich', '2001-09-25', 'S008'),
       ('Pavlova', 'Sofia', 'Dmitrievna', '2002-10-07', 'S009'),
       ('Orlov', 'Georgiy', 'Dmitrievich', '2000-11-10', 'S010'),
       ('Kovalev', 'Artem', 'Alexeevich', '2001-12-28', 'S011'),
       ('Belova', 'Maria', 'Stepanovna', '2002-01-05', 'S012'),
       ('Vasiliev', 'Alexander', 'Fedorovich', '2000-02-21', 'S013'),
       ('Morozova', 'Elena', 'Viktorovna', '2001-03-14', 'S014'),
       ('Titov', 'Maxim', 'Andreevich', '2002-04-22', 'S015'),
       ('Guseva', 'Ekaterina', 'Pavlovna', '2000-05-26', 'S016'),
       ('Zaitsev', 'Boris', 'Evgenievich', '2001-07-11', 'S017'),
       ('Popova', 'Irina', 'Stanislavovna', '2002-08-19', 'S018'),
       ('Egorov', 'Victor', 'Nikolaevich', '2000-09-03', 'S019'),
       ('Dmitriev', 'Mikhail', 'Evgenevich', '2001-10-29', 'S020');
