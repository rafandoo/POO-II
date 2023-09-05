CREATE TABLE contatos (
  id SERIAL PRIMARY KEY,
  nome VARCHAR(100) NOT NULL,
  data_nascimento VARCHAR(10),
  telefone VARCHAR(20),
  email VARCHAR(100)
);
