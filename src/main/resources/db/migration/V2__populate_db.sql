INSERT INTO worker
(ID, name, birthday, level, salary)
VALUES
        ('1', 'Ivanov', '1981-05-21', 'Trainee', '1000'),
        ('2', 'Petrov', '1991-04-21', 'Trainee', '2000'),
        ('3', 'Ivanenko', '1994-12-11', 'Junior', '3000'),
        ('4', 'Petrenko', '1990-11-01', 'Middle', '4000'),
        ('5', 'Vasylenko', '1989-11-01', 'Senior', '5000'),
        ('6', 'Gorobets', '1978-09-05', 'Trainee', '1500'),
        ('7', 'Belix', '1988-04-15', 'Middle', '3500'),
        ('8', 'Tiroshko', '2000-05-17', 'Middle', '3500'),
        ('9', 'Orlova', '2001-06-19', 'Senior', '4500'),
        ('10', 'Stoletnaya', '1990-11-01', 'Senior', '5000');


INSERT INTO client
(ID, name)
VALUES
    ('1', 'Ivanov'),
    ('2', 'Petrov'),
    ('3', 'Ivanenko'),
    ('4', 'Petrenko'),
    ('5', 'Vasylenko');


INSERT INTO project
(ID, CLIENT_ID, START_DATE, FINISH_DATE)
VALUES
    ('1','3', '2021-12-01','2023-06-01'),
    ('2','2', '2020-09-01','2024-05-01'),
    ('3','1', '2019-11-01','2025-05-01'),
    ('4','5', '2020-10-01','2025-08-01'),
    ('5','4', '2021-01-01','2023-06-01'),
    ('6','4', '2021-02-01','2029-04-28'),
    ('7','4', '2019-12-01','2028-05-01'),
    ('8','5', '2021-12-01','2025-07-30'),
    ('9','1', '2022-12-01','2024-08-10'),
    ('10','2', '2023-01-01','2026-06-30');


INSERT INTO project_worker
(PROJECT_ID, WORKER_ID)
VALUES
    ('1','3'),
    ('2','2'),
    ('3','1'),
    ('3','3'),
    ('3','4'),
    ('3','10'),
    ('4','5'),
    ('5','7'),
    ('6','8'),
    ('7','6'),
    ('8','5'),
    ('9','1'),
    ('10','2');
