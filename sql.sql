CREATE DATABASE DB_PROYECTOLP1;
use db_proyectolp1;

CREATE TABLE USUARIO(
	 usuario varchar(30) PRIMARY KEY not null,
     clave varchar(30) 
);
INSERT INTO USUARIO VALUES ("piero", "meza"),
							("profesor", "lp1"),
                            ("andree", "chiquis");
 CREATE table TB_BLANCOS (
	CodBanco int primary key auto_increment,
    nomBanco varchar (100)
    );
Insert into TB_BLANCOS values 	(null,"Interbank"),
								(null,"BBVA"),
                                (null,"Scotiabank"),
                                (null,"BCP"),
                                (null,"Mibanco"),
                                (null,"Citibank"),
                                (null,"Banbif");                           
CREATE TABLE TB_PARTICIPANTE (
	codParticipante  int PRIMARY KEY AUTO_INCREMENT,
    dniParticipante		int ,
    nombreParticipante varchar(30) ,
    apellidoParticipante varchar(30) ,
    telefonoParticipante int ,
    correoParticipante varchar(60)
);

CREATE TABLE TB_MODALIDAD(
	codModalidad INT PRIMARY KEY AUTO_INCREMENT,
    nombreModalidad varchar(30)
);
INSERT INTO TB_MODALIDAD VALUES
(null, 'Licitación Pública'),
(null, 'Concurso Público'),
(null, 'Adjudicación Directa Pública');

CREATE TABLE TB_CONTRATADOS(
	codContratado int primary key auto_increment,
    dniContratado char(8),
    nombreContratado varchar(30),
    apellidoContratado varchar(30),
    direcContratado varchar(50),
    emailContratado varchar(100),
    celContratado int,
    sueldo double,
    codBanco int default null,
    FOREIGN KEY (codBanco) REFERENCES TB_BLANCOS (CodBanco)
);

-- agregan valores gaaaaa


INSERT INTO TB_PARTICIPANTE VALUES
(null, 84536984 , "Stefano","Meza",	946552814,"Stefano_Meza@gmail.com"),
(null, 58964287 ,"Roberto","Martinez",996874254,"Roberto_Martinez@gmail.com"),
(null, 85369745 , "Cindy","Tejada",	955687241,"Cindy_Tejada@gmail.com"),
(null, 88736984 , "Luis","Quispe",	781885184,"Luis_Quispe@gmail.com"),
(null, 57804287 ,"Victor","Flores",	968574233,"Victor_Flores@gmail.com"),
(null, 79669745 , "José","Sánchez",	984753641,"José_Sánchez@gmail.com"),
(null, 89856745 , "María","Garcia",	957489634,"María_Garcia@gmail.com"),
(null, 85744745 , "Juan","Rodriguéz",978451278,"Juan_Rodriguéz@gmail.com"),
(null, 89853541 , "Alberto","Rojas",984756321,"Alberto_Rojas@gmail.com"),
(null, 89454534 , "Antonio","López",945821795,"Antonio_Lopez@gmail.com"),
(null, 48613489 , "Ana","Ramos",984203014,"Ana_Ramos@gmail.com"),
(null, 78423571 , "Luz","Torres",914005871,"Luz_Torres@gmail.com"),
(null, 71583489 , "Carmen","Díaz",948035987,"Carmen_Díaz@gmail.com"),
(null, 78439841 , "César","Ramírez",978950179,"César_Ramírez@gmail.com"),
(null, 89587434 , "Miguel","Gonzales",900147701,"Miguel_Gonzales@gmail.com"),
(null, 74918234 , "Julio","Espinoza",989885503,"Julio_Espinoza@gmail.com"),
(null, 19141735 , "Manuel","Cruz", 900258963,"Manuel_Cruz@gmail.com"),
(null, 64819743 , "Angela","Silva",	988951470,"Angela_Silva@gmail.com"),
(null, 81369866 , "Ruth","Córdova",	977442580,"Ruth_Córdova@gmail.com"),
(null, 98423185 , "Alex","De la Cruz",955648984,"Alex_delaCruz@gmail.com");

CREATE TABLE TB_PROPUESTA(
	codPropuesta  int PRIMARY KEY AUTO_INCREMENT,
    nombrePropuesta varchar(30) ,
    duracionPropuesta int,
    presupuestoPropuesta int ,
	puntajeTecnico int,
    puntajeEconomico int,
	codParticipante int default null,
    
FOREIGN KEY (codParticipante) REFERENCES TB_PARTICIPANTE (codParticipante)
);
-- insertando valores
INSERT INTO TB_PROPUESTA VALUES
(null, "Casa Propia","2021-01-14","2021-05-28",null),
(null,"Puente Gatuno","2020-11-01","2021-04-18",null),
(null, "Puenta Sevilla","2019-02-25","2019-05-28",null),
(null, "Capilla Cristina","2021-02-26","2021-03-30",null),
(null, "Casa Propia","2021-08-11","2021-11-13",null),
(null, "Puente roca","2021-01-14","2021-04-22",null),
(null, "Casa Paredes","2021-02-07","2021-05-02",null),
(null, "Condominio","2021-03-18","2027-05-12",null),
(null, "Casa Propia","2021-04-16","2021-05-09",null),
(null, "Edificio","2021-06-30","2027-11-09",null),
(null, "Edificio","2021-07-03","2029-10-01",null),
(null, "Condominio","2021-10-14","2026-05-17",null),
(null, "Casa Propia","2021-05-20","2021-09-28",null),
(null, "Casa Propia","2021-04-09","2021-08-10",null),
(null, "Edificio","2021-08-11","2029-02-16",null),
(null, "Rascacielo","2021-09-27","2030-08-08",null),
(null, "Mansion","2021-11-02","2023-09-28",null),
(null, "Condominio","2021-08-20","2026-05-01",null),
(null, "Capilla Cristina","2021-07-30","2022-09-02",null),
(null, "Puente Tacna","2021-01-18","2021-04-13",null);


CREATE TABLE TB_EVALUADOR(
	codEvaluador int PRIMARY KEY AUTO_INCREMENT,
    puestoEvaluador varchar(60) ,
    nomEvaluador varchar(100) ,
	codPropuesta int ,
FOREIGN KEY (codPropuesta) REFERENCES TB_PROPUESTA (codPropuesta)
);
-- valores
INSERT INTO TB_EVALUADOR VALUES
(null, "Representante Organo de Control","Armando Casas",       null),
(null, "Representante de Gerencia Logistica","Antonio Paredes" ,null),
(null, "Representante de Comité Especial","Jose Laguna",        null);