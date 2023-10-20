CREATE TABLE hm_admin
(
    admin_id       INT Auto_Increment NOT NULL,
    admin_name     varchar(50)        NOT NULL,
    admin_password varchar(50)        NOT NULL,
    CONSTRAINT admin_pkey PRIMARY KEY (admin_id)
);

create table hm_user
(
    hm_user_id  INT AUTO_INCREMENT NOT NULL,
    hm_username varchar(50)        NOT NULL,
    email       varchar(50)        NOT NULL,
    CONSTRAINT hm_user_pkey PRIMARY KEY (hm_user_id)
);

CREATE TABLE event_type
(
    event_type_id integer NOT NULL,
    event_hsv     varchar(50),
    CONSTRAINT event_type_pkey PRIMARY KEY (event_type_id)
);

CREATE TABLE event_hsv
(
    event_hsv_id  integer                NOT NULL,
    event_type_id integer                NOT NULL,
    admin_id      integer                NOT NULL,
    opposite      varchar(50)            NOT NULL,
    match_details varchar(250)           NOT NULL,
    event_date    date                   NOT NULL,
    event_time    time without time zone NOT NULL,
    location      varchar(50)            NOT NULL,
    picture       varchar                NOT NULL,
    deadline      time with time zone    NOT NULL,
    ticket_amount integer                NOT NULL,
    CONSTRAINT event_hsv_pkey PRIMARY KEY (event_hsv_id),
    FOREIGN KEY (event_type_id) REFERENCES event_type (event_type_id),
    FOREIGN KEY (admin_id) REFERENCES hm_admin (admin_id)
);

CREATE TABLE hm_attendance
(
    user_id           integer     NOT NULL,
    event_hsv_id      integer     NOT NULL,
    escort_name       varchar(50) NOT NULL,
    winner            boolean     NOT NULL,
    substitute_winner boolean     NOT NULL,
    FOREIGN KEY (user_id) REFERENCES hm_user (hm_user_id),
    FOREIGN KEY (event_hsv_id) REFERENCES event_hsv (event_hsv_id)
);

CREATE TABLE blacklist
(
    blacklist_id      integer NOT NULL,
    event_hsv_id      integer NOT NULL,
    user_id           integer NOT NULL,
    blacklist_counter integer NOT NULL,
    CONSTRAINT blacklist_pkey PRIMARY KEY (blacklist_id),
    FOREIGN KEY (event_hsv_id) REFERENCES event_hsv (event_hsv_id),
    FOREIGN KEY (user_id) REFERENCES hm_user (hm_user_id)
);
