--Clean tables before use
DELETE FROM profiling_database.teachers;
DELETE FROM profiling_database.students;

--STUDENTS Table
INSERT INTO profiling_database.students (name, email) VALUES ('Alice Johnson', 'alice@example.com');
INSERT INTO profiling_database.students (name, email) VALUES ('Bob Smith', 'bob@example.com');


--TEACHER Table
INSERT INTO profiling_database.teachers (name, email) VALUES ('Priti Johnson', 'priti@example.com');
INSERT INTO profiling_database.teachers (name, email) VALUES ('Ram Smith', 'ram@example.com');