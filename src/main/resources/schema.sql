--  schema.sql refers to a SQL script that defines the schema of a database

CREATE TABLE hm_admin
(
    admin_id       INT Auto_Increment NOT NULL,
    admin_name     varchar(50) NOT NULL,
    admin_password varchar(255) NOT NULL,
    CONSTRAINT admin_pkey PRIMARY KEY (admin_id)
);

CREATE TABLE employee
(
    employee_id    INT AUTO_INCREMENT NOT NULL,
    employee_email varchar(50) NOT NULL,
    employee_name  varchar(50) NOT NULL,
    CONSTRAINT employee_pkey PRIMARY KEY (employee_id)
);


CREATE TABLE event_hsv
(
    event_hsv_id      INT AUTO_INCREMENT NOT NULL,
    admin_id          INT         NOT NULL,
    match_name        varchar(50) NOT NULL,
    match_details     varchar(350),
    event_date        datetime    NOT NULL,
    location          varchar(50),
    picture           blob,
    deadline          date        NOT NULL,
    ticket_type       INT,
    ticket_amount     INT,
    registration_date date        NOT NULL,
    CONSTRAINT event_hsv_pkey PRIMARY KEY (event_hsv_id),
    FOREIGN KEY (admin_id) REFERENCES hm_admin (admin_id)
);

-- not neccesary for this project, but in future with other eventtypes the counters are individual for the events
-- in this project the counter could be also in employee table
CREATE TABLE blacklist
(
    blacklist_id      INT AUTO_INCREMENT NOT NULL,
    employee_id       INT NOT NULL,
    blacklist_counter INT NOT NULL,
    CONSTRAINT blacklist_pkey PRIMARY KEY (blacklist_id),
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);

CREATE TABLE hm_attendance
(
    employee_id       INT     NOT NULL,
    event_hsv_id      INT     NOT NULL,
    escort_name       varchar(50), /* not NOT NULL, because other events in future not need an escort */
    winner            boolean NOT NULL,
    substitute_winner boolean NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id),
    FOREIGN KEY (event_hsv_id) REFERENCES event_hsv (event_hsv_id)
);


