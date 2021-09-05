
CREATE DATABASE IF NOT EXISTS staffcontrol;

DROP table staffcontrol.person;

CREATE TABLE IF NOT EXISTS person(
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
first_name VARCHAR(50) NOT NULL ,
last_name VARCHAR(100) NOT NULL ,
birthday DATE NOT NULL ,
address VARCHAR(1000) NOT NULL ,
email VARCHAR(50) ,
phone VARCHAR(50) ,
budget DECIMAL NOT NULL
);