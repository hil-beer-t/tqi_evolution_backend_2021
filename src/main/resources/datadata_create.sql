-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-01-09 06:04:04.983

-- tables
-- Table: address
CREATE TABLE public.address (
    address_id serial  NOT NULL,
    city varchar(50)  NOT NULL,
    state varchar(50)  NOT NULL,
    zip_code varchar(14)  NOT NULL,
    district varchar(128)  NOT NULL,
    complement varchar(128)  NOT NULL,
    created_at timestamp  NOT NULL,
    client_id integer  NOT NULL,
    CONSTRAINT address_pk PRIMARY KEY (address_id)
) WITH (OIDS = FALSE);

-- Table: client
CREATE TABLE public.client (
    client_id serial  NOT NULL,
    cpf varchar(11)  NOT NULL,
    name varchar(128)  NOT NULL,
    email varchar(128)  NOT NULL,
    status varchar(128)  NOT NULL,
    income integer  NOT NULL,
    password varchar(20)  NOT NULL,
    created_at timestamp  NOT NULL,
    CONSTRAINT AK_0 UNIQUE (cpf) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT AK_1 UNIQUE (email) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT client_pk PRIMARY KEY (client_id)
) WITH (OIDS = FALSE);

-- Table: loan
CREATE TABLE public.loan (
    loan_id integer  NOT NULL,
    value float  NOT NULL DEFAULT '0',
    num_months integer  NOT NULL DEFAULT '0',
    status varchar(255)  NOT NULL,
    initiated_at timestamp  NOT NULL,
    created_at timestamp  NOT NULL,
    client_id integer  NOT NULL,
    signed_at timestamp  NOT NULL,
    CONSTRAINT loan_pk PRIMARY KEY (loan_id)
) WITH (OIDS = FALSE);

-- foreign keys
-- Reference: address_fk0 (table: address)
ALTER TABLE public.address ADD CONSTRAINT address_fk0
    FOREIGN KEY (client_id)
    REFERENCES public.client (client_id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: loan_fk0 (table: loan)
ALTER TABLE public.loan ADD CONSTRAINT loan_fk0
    FOREIGN KEY (client_id)
    REFERENCES public.client (client_id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

