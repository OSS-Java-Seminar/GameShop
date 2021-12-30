CREATE TABLE game (
	id char(36) NOT NULL,
	name VARCHAR(50) NOT NULL,
	price FLOAT NOT NULL,
	description VARCHAR(100) NOT NULL,
	CONSTRAINT pk_game PRIMARY KEY(id)
);

CREATE TABLE genre (
	id char(36) NOT NULL,
	genreName VARCHAR(35) NOT NULL,
	CONSTRAINT pk_genre PRIMARY KEY(id)
);

CREATE TABLE invoice(
	id char(36) NOT NULL,
	CONSTRAINT pk_invoice PRIMARY KEY(id)
);

CREATE TABLE keystorage(
	id char(36) NOT NULL,
	steamKey VARCHAR(75) NOT NULL,
	CONSTRAINT pk_keystorage PRIMARY KEY(id)
);

CREATE TABLE payment (
	id char(36) NOT NULL,
	type VARCHAR(35) NOT NULL,
	CONSTRAINT pk_payment PRIMARY KEY(id)
);


CREATE TABLE picture (
	id char(36) NOT NULL,
	png VARCHAR(35),
	CONSTRAINT pl_picture PRIMARY KEY(id)
);

CREATE TABLE role (
	id char(36) NOT NULL,
	roleName VARCHAR(35) NOT NULL,
	CONSTRAINT pk_role PRIMARY KEY(id)
);

CREATE TABLE user (
	id char(36) NOT NULL,
	username VARCHAR(15) NOT NULL,
	password VARCHAR(20) NOT NULL,
	email VARCHAR(30) NOT NULL,
	loyaltyPoints INT NOT NULL,
	CONSTRAINT pk_user PRIMARY KEY(id)
);