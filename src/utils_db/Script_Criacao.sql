CREATE DATABASE iip
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'pt_BR.UTF-8'
       LC_CTYPE = 'pt_BR.UTF-8'
       CONNECTION LIMIT = -1;

CREATE TABLE Pais (
    codigo  SERIAL PRIMARY KEY NOT NULL,
    nome    VARCHAR(75),
    sigla   VARCHAR(3)
);


CREATE TABLE Estado (
    codigo  SERIAL PRIMARY KEY NOT NULL,
    nome    VARCHAR(75),
    uf      VARCHAR(2),
    pais    SERIAL REFERENCES Pais
);


CREATE TABLE Cidade (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    estado	SERIAL REFERENCES Estado
);


CREATE TABLE TipoEndereco (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    sigla	VARCHAR(5),
    descricao	VARCHAR(150),
    ativo	BOOLEAN
);


CREATE TABLE Logradouro (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    sigla	VARCHAR(5),
    ativo	BOOLEAN
);

CREATE TABLE Endereco (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    rua 	VARCHAR(150),
    numero	VARCHAR(45),
    bairro	VARCHAR(75),
    cep		VARCHAR(10),
    complemento	VARCHAR(150),
    logradouro	SERIAL REFERENCES Logradouro,
    cidade	SERIAL REFERENCES Cidade
);

CREATE TABLE Possui(
    cliente         SERIAL,
    endereco        SERIAL,
    tipoEndereco    SERIAL REFERENCES TipoEndereco,
    CONSTRAINT pk_composta PRIMARY KEY (cliente, endereco),
    CONSTRAINT fk_cliente FOREIGN KEY (cliente) REFERENCES Pessoa (codigo),
    CONSTRAINT fk_endereco FOREIGN KEY (endereco) REFERENCES Endereco (codigo)
);

CREATE TABLE Pessoa(
    codigo      SERIAL PRIMARY KEY NOT NULL,
    nome VARCHAR(75) NOT NULL,
    apelido varchar(50),
    cpf varchar(11),
    rg  varchar(15),
    nascimento  date NOT NULL,
    orgexp  varchar(10),
    genero  char(2)
);

CREATE TABLE TipoEvento (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    descricao	VARCHAR(150),
    ativo	BOOLEAN
);

CREATE TABLE Evento (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    horaInicio  DATE,
    horaTermino DATE,
    descricao	VARCHAR(150),
    tipoevento	SERIAL REFERENCES TipoEvento,
    endereco	SERIAL REFERENCES Endereco,
    ativo	BOOLEAN
);
