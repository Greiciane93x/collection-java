CREATE TABLE USUARIO(ID INT PRIMARY KEY AUTO_INCREMENT, 
                    NOME CHAR(15), 
                    EMAIL CHAR(45));
                    
CREATE TABLE ENDERECO(ID_ENDERECO INT PRIMARY KEY AUTO_INCREMENT,
                     LOGRADOURO CHAR(20),
                     CEP CHAR(50),
                     ID_USUARIO INT, 
                     FOREIGN KEY (ID_USUARIO) REFERENCES USUARIO(ID)

                     ); 
                    
INSERT INTO USUARIO values (null,'Greiciane', 'assis@teste'); 
INSERT INTO USUARIO values (null,'Alice', 'alice@teste'); 
INSERT INTO USUARIO values (null,'BRUNO', 'bruno@teste'); 
INSERT INTO USUARIO values (null,'Neia', 'neia@teste'); 
INSERT INTO USUARIO values (null,'Marcelo', 'marcelo@teste'); 
INSERT INTO USUARIO values (null,'Neusa', 'neusa@teste'); 
INSERT INTO USUARIO values (null,'Francisca', 'francisca@teste'); 
INSERT INTO USUARIO values (null,'Miguel', 'miguel@teste'); 
INSERT INTO USUARIO values (null,'João', 'joao@teste'); 
INSERT INTO USUARIO values (null,'Felipe', 'felipe@teste'); 

INSERT INTO ENDERECO values(null, 'logradouro1', '213022123', 1); 
INSERT INTO ENDERECO values(null, 'logradouro2', '21321321212', 2);
INSERT INTO ENDERECO values(null, 'logradouro3', '21321020213', 3);
INSERT INTO ENDERECO values(null, 'logradouro4', '21321302021', 4);
INSERT INTO ENDERECO values(null, 'logradouro5', '21321321231', 5);
INSERT INTO ENDERECO values(null, 'logradouro6', '21321323366', 6);
INSERT INTO ENDERECO values(null, 'logradouro7', '213213211221', 7);
INSERT INTO ENDERECO values(null, 'logradouro8', '213213212213', 8);
INSERT INTO ENDERECO values(null, 'logradouro9', '213287872565', 9);
INSERT INTO ENDERECO values(null, 'logradouro10', '21328789217', 10);


SELECT * FROM USUARIO; 
SELECT LENGTH(CEP) FROM ENDERECO
WHERE ID_USUARIO = 2; 

SELECT LENGTH(CEP) FROM ENDERECO;

SELECT LENGTH(CEP) < 10 FROM ENDERECO; 

