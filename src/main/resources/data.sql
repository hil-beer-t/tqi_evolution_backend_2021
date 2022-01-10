INSERT INTO client(client_id, cpf, rg, name, email, status, income, password, created_at) VALUES(1,"25680972050","370937508","Gustavo Henrique","gus@gmail.com","new",654848,"password",current_timestamp);
INSERT INTO loan(loan_id, value, num_months, status, created_at, initiated_at, signed_at, client_id) VALUES(1, 60000, 20, "waiting_team", current_time, NULL, NULL, 1);
INSERT INTO address(address_id, city, state, zip_code, district, complement, client_id) VALUES(1,"Teresina", "PI", "39990970", "Bela vista", "complemento", 1);
