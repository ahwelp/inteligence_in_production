CREATE DATABASE iip
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'pt_BR.UTF-8'
       LC_CTYPE = 'pt_BR.UTF-8'
       CONNECTION LIMIT = -1;

CREATE TABLE pessoa(
    codigo      SERIAL PRIMARY KEY NOT NULL,
    nome VARCHAR(75) NOT NULL,
    apelido varchar(50),
    cpf varchar(11),
    rg  varchar(15),
    nascimento  date NOT NULL,
    orgexp  varchar(10),
    genero  char(2)
);

CREATE TABLE pais (
    codigo  SERIAL PRIMARY KEY NOT NULL,
    nome    VARCHAR(75),
    sigla   VARCHAR(3)
);

CREATE TABLE estado (
    codigo  SERIAL PRIMARY KEY NOT NULL,
    nome    VARCHAR(75),
    uf      VARCHAR(2),
    pais    SERIAL REFERENCES Pais
);

CREATE TABLE cidade (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    estado	SERIAL REFERENCES Estado
);

CREATE TABLE logradouro (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    sigla	VARCHAR(5),
    ativo	BOOLEAN
);

CREATE TABLE tipo_endereco (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    sigla	VARCHAR(5),
    descricao	VARCHAR(150),
    ativo	BOOLEAN
);

CREATE TABLE endereco (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    rua 	VARCHAR(150),
    numero	VARCHAR(45),
    bairro	VARCHAR(75),
    cep		VARCHAR(10),
    complemento	VARCHAR(150),
    logradouro	SERIAL REFERENCES Logradouro,
    cidade	SERIAL REFERENCES Cidade
);

CREATE TABLE possui_endereco(
    cliente         SERIAL,
    endereco        SERIAL,
    tipoEndereco    SERIAL REFERENCES tipo_endereco,
    CONSTRAINT pk_pendereco_composta PRIMARY KEY (cliente, endereco),
    CONSTRAINT fk_pendereco_cliente FOREIGN KEY (cliente) REFERENCES Pessoa (codigo),
    CONSTRAINT fk_pendereco_endereco FOREIGN KEY (endereco) REFERENCES Endereco (codigo)
);

CREATE TABLE tipo_evento (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    nome	VARCHAR(75),
    descricao	VARCHAR(150),
    ativo	BOOLEAN
);

CREATE TABLE evento (
    codigo	SERIAL PRIMARY KEY NOT NULL,
    horaInicio  DATE,
    horaTermino DATE,
    descricao	VARCHAR(150),
    tipoevento	SERIAL REFERENCES tipo_evento,
    endereco	SERIAL REFERENCES endereco,
    ativo	BOOLEAN
);

CREATE TABLE contato (
  codigo SERIAL NOT NULL,
  contato character varying(75),
  descricao character varying(150),
  CONSTRAINT pk_contato PRIMARY KEY (codigo)
);

CREATE TABLE tipo_contato(
  codigo SERIAL NOT NULL,
  nome character varying(75),
  sigla character varying(3),
  descricao character varying(150),
  CONSTRAINT pk_tipocontato PRIMARY KEY (codigo)
);

CREATE TABLE possui_contato (
    cliente         SERIAL,
    contato         SERIAL,
    tipo_contato    SERIAL REFERENCES tipo_contato,
    CONSTRAINT pk_pcontato_composta PRIMARY KEY (cliente, contato),
    CONSTRAINT fk_pcontato_cliente FOREIGN KEY (cliente) REFERENCES Pessoa (codigo),
    CONSTRAINT fk_pcontato_contato FOREIGN KEY (contato) REFERENCES Contato (codigo)
);