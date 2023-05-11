INSERT INTO tb_carro(ano, documento, marca ,modelo, placa) VALUES (2000, '1111111111','Fiat ','UNO', '123-AMC');
INSERT INTO tb_carro(ano, documento, marca ,modelo, placa) VALUES (2013, '1222222222','Hyundai ','HB20', '021-KLD');
INSERT INTO tb_carro(ano, documento, marca ,modelo, placa) VALUES (1993, '1111443561','Chevrolet ','Chevete', '422-AKC');
INSERT INTO tb_carro(ano, documento, marca ,modelo, placa) VALUES (2001, '1111123111','Jeep ','Renegade', '713-PMC');

INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (1);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (2);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (3);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (4);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (5);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (6);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (7);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (8);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (9);
INSERT INTO tb_vagas_estacionamento(numero_vaga) VALUES (10);

INSERT INTO park_take(hour_take, carro_id, vaga_id) VALUES ('11:15', 1, 1);
INSERT INTO park_take(hour_take, carro_id, vaga_id) VALUES ('12:15', 2, 1);
INSERT INTO park_take(hour_take, carro_id, vaga_id) VALUES ('9:10', 1, 5);
INSERT INTO park_take(hour_take, carro_id, vaga_id) VALUES ('11:15', 3, 8);
INSERT INTO park_take(hour_take, carro_id, vaga_id) VALUES ('11:15', 2, 9);
INSERT INTO park_take(hour_take, carro_id, vaga_id) VALUES ('10:30', 4, 10);

