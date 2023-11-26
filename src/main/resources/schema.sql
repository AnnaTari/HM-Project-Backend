CREATE TABLE hm_admin
(
    admin_id       INT Auto_Increment NOT NULL,
    admin_name     varchar(50)        NOT NULL,
    admin_password varchar(50)        NOT NULL,
    CONSTRAINT admin_pkey PRIMARY KEY (admin_id)
);

CREATE TABLE employee
(
    employee_id    INT AUTO_INCREMENT NOT NULL,
    employee_email varchar(50)        NOT NULL,
    employee_name  varchar(50)        NOT NULL,
    CONSTRAINT employee_pkey PRIMARY KEY (employee_id)
);


CREATE TABLE event_hsv
(
    event_hsv_id      INT AUTO_INCREMENT NOT NULL,
    admin_id          INT                NOT NULL,
    match_name        varchar(50)        NOT NULL,
    match_details     varchar(350)       NOT NULL,
    event_date        datetime           NOT NULL,
    location          varchar(50)        NOT NULL,
    picture           blob,
    deadline          date               NOT NULL,
    ticket_type       INT                NOT NULL,
    ticket_amount     INT                NOT NULL,
    registration_date date,
    CONSTRAINT event_hsv_pkey PRIMARY KEY (event_hsv_id),
    FOREIGN KEY (admin_id) REFERENCES hm_admin (admin_id)
);
CREATE TABLE blacklist
(
    blacklist_id      INT AUTO_INCREMENT NOT NULL,
    event_hsv_id      INT NOT NULL,
    employee_id       INT NOT NULL,
    blacklist_counter INT NOT NULL,
    CONSTRAINT blacklist_pkey PRIMARY KEY (blacklist_id),
    FOREIGN KEY (event_hsv_id) REFERENCES event_hsv (event_hsv_id),
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);

CREATE TABLE hm_attendance
(
    employee_id       INT     NOT NULL,
    event_hsv_id      INT     NOT NULL,
    escort_name       varchar(50), /* nicht NOT NULL, weil andere Events erfordern keine begleitperson */
    winner            boolean NOT NULL,
    substitute_winner boolean NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id),
    FOREIGN KEY (event_hsv_id) REFERENCES event_hsv (event_hsv_id)
);


