-- -----------------------------------------------------
-- Table `universidade`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS universidade (
  id SERIAL,
  nome VARCHAR(45) NULL,
  endereço VARCHAR(45) NOT NULL,
  telefone INT NOT NULL,
  pais VARCHAR(25) NOT NULL,
  idioma VARCHAR(25) NOT NULL,
  PRIMARY KEY (ID))
;


-- -----------------------------------------------------
-- Table `profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS profesor (
  CPF INT NOT NULL,
  Nome VARCHAR(45) NULL,
  Area VARCHAR(45) NULL,
  Endereço VARCHAR(45) NULL,
  Salario VARCHAR(45) NULL,
  Telefone VARCHAR(45) NULL,
  PRIMARY KEY (CPF))
;


-- -----------------------------------------------------
-- Table `intercambio`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS intercambio (
  idIntercambio SERIAL,
  Data DATE NULL,
  Pais VARCHAR(45) NULL,
  Ciudade VARCHAR(45) NULL,
  Universidade VARCHAR(45) NULL,
  Curso VARCHAR(45) NULL,
  Duração VARCHAR(45) NULL,
  DificultadePapelada INT NULL,
  ConselhoGeral INT NULL,
  TratamentoRecibido INT NULL,
  QualidadeInfraestrutura INT NULL,
  QualidadeEnsino INT NULL,
  QualidadeVida INT NULL,
  PRIMARY KEY (idIntercambio))
;


-- -----------------------------------------------------
-- Table `aluno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS aluno (
  CPF INT NOT NULL,
  Nome VARCHAR(45) NULL,
  Curso VARCHAR(45) NULL,
  Endereço VARCHAR(45) NULL,
  Telefone VARCHAR(45) NULL,
  Coordinador INT NULL,
  UNIVERSIDADE INT NOT NULL,
  Intercambio INT NULL,
  PRIMARY KEY (CPF)
 ,
  CONSTRAINT fk_Alunos_Profesores1
    FOREIGN KEY (Coordinador)
    REFERENCES profesor (CPF)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Alunos_UNIVERSIDADE1
    FOREIGN KEY (UNIVERSIDADE)
    REFERENCES universidade (ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Alunos_Intercâmbio1
    FOREIGN KEY (Intercambio)
    REFERENCES intercambio (idIntercambio)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE INDEX fk_Alunos_Profesores1_idx ON aluno (Coordinador ASC);
CREATE INDEX fk_Alunos_UNIVERSIDADE1_idx ON aluno (UNIVERSIDADE ASC);
CREATE INDEX fk_Alunos_Intercâmbio1_idx ON aluno (Intercambio ASC);


-- -----------------------------------------------------
-- Table `nativo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS nativo (
  idNativo INT NOT NULL,
  Nome VARCHAR(45) NOT NULL,
  DataNascimiento VARCHAR(45) NOT NULL,
  Pais VARCHAR(45) NOT NULL,
  Idioma VARCHAR(45) NOT NULL,
  PRIMARY KEY (idNativo))
;


-- -----------------------------------------------------
-- Table `tandem`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS tandem (
  idTandem SERIAL,
  Idioma VARCHAR(45) NULL,
  Localização VARCHAR(45) NULL,
  Calendario VARCHAR(45) NULL,
  Aluno INT NOT NULL,
  Nativo INT NOT NULL,
  PRIMARY KEY (idTandem)
 ,
  CONSTRAINT fk_Tandem_Aluno1
    FOREIGN KEY (Aluno)
    REFERENCES aluno (CPF)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_Tandem_Nativo1
    FOREIGN KEY (Nativo)
    REFERENCES nativo (idNativo)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
;

CREATE INDEX fk_Tandem_Aluno1_idx ON tandem (Aluno ASC);
CREATE INDEX fk_Tandem_Nativo1_idx ON tandem (Nativo ASC);


