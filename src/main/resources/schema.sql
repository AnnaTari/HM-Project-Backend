CREATE TABLE LotteryAdmin(
    admin_Id INT AUTO_INCREMENT PRIMARY KEY,
    adminname varchar (50) not null,
    password varchar (50) not null,
    CONSTRAINT admin_pkey PRIMARY KEY (admin_Id)
    );

CREATE TABLE attendance
(
    user_id integer NOT NULL,
    eventhsv_id integer NOT NULL,
    escortname varchar (50) NOT NULL,
    win boolean NOT NULL,
    substitute_winner boolean  NOT NULL

);

CREATE TABLE blacklist
(
    blacklist_id integer NOT NULL,
    eventhsv_id integer NOT NULL,
    user_id integer NOT NULL,
    blacklistcounter integer NOT NULL,
    CONSTRAINT blacklist_pkey PRIMARY KEY (blacklist_id)
);

CREATE TABLE usee
(
    user_id integer auto_increment NOT NULL,
    username varchar (50) NOT NULL,
    email varchar (50) NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (user_id)
);

CREATE TABLE eventhsv
(
    eventhsv_id integer NOT NULL,
    eventtype_id integer NOT NULL,
    admin_id integer NOT NULL,
    opposite varchar (50) NOT NULL,
    matchdetails varchar (250) NOT NULL,
    date date NOT NULL,
    "time" time without time zone NOT NULL,
    location varchar (50) NOT NULL,
    picture varchar NOT NULL,
    deadline time with time zone NOT NULL,
    ticketamount integer NOT NULL,
    CONSTRAINT eventhsv_pkey PRIMARY KEY (eventhsv_id)
);

CREATE TABLE eventtype
(
    eventtype_id integer NOT NULL,
    eventhsv varchar (50),
    CONSTRAINT eventtype_pkey PRIMARY KEY (eventtype_id)
)