INSERT INTO client(client_id, cpf, rg, name, email, status, income, password, created_at) VALUES(1,'2568097200','370937508','Gustavo Henrique','gus@gmail.com','new',654848,'password',current_timestamp);
INSERT INTO loan(loan_id, value, num_months, status, created_at, initiated_at, signed_at, client_id) VALUES(1, 60000, 20, 'waiting_team', '2012-08-24 14:00:00 +02:00', NULL, NULL, 1);
INSERT INTO address(address_id, city, state, zip_code, district, complement, client_id) VALUES(1,'Teresina', 'PI', '39990970', 'Bela vista', 'complemento', 1);
