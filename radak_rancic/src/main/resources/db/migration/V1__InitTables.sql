CREATE TABLE game (
	id INT NOT NULL,
	name VARCHAR(50) NOT NULL,
	genre VARCHAR(35) NOT NULL,
	price FLOAT NOT NULL,
	description VARCHAR(100) NOT NULL,
	constraint pk_game PRIMARY KEY(id)
);

CREATE TABLE genre (
	id INT NOT NULL,
	genreName VARCHAR(35) NOT NULL,
	CONSTRAINT pk_genre PRIMARY KEY(id)
);

CREATE TABLE invoice(
	id INT NOT NULL,
	--keystorage SET(100) NOT NULL,
	--payment (SET) NOT NULL
	CONSTRAINT pk_invoice PRIMARY KEY(id)
);

CREATE TABLE keystorage(
	id INT NOT NULL,
	steamKey VARCHAR(75) NOT NULL,
	game SET(100) NOT,
	CONSTRAINT pk_keystorage
);

CREATE TABLE payment (
	id INT NOT NULL,
	type VARCHAR(35) NOT NULL,
	CONSTRAINT pk_payment PRIMARY KEY(id)
);

CREATE TABLE role (
	id INT NOT NULL,
	roleName VARCHAR(35) NOT NULL,
	CONSTRAINT pk_role PRIMARY KEY(id)
);

CREATE TABLE user (
	id INT NOT NULL,
	username VARCHAR(15) NOT NULL,
	password VARCHAR(20) NOT NULL,
	email VARCHAR(30) NOT NULL,
	--games SET(100) NULL,
	loyaltyPoints INT NOT NULL,
	--role SET(30) NOT NULL,
	--invoice SET(30) NOT NULL,
	CONSTRAINT pk_user PRIMARY KEY(id)
);