/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Author:  leonardo_santos29
 * Created: 28/08/2023
 */

CREATE TYPE tipo_pessoa as ENUM ('PF','PJ');
CREATE TABLE t_pessoa(
	id UUID primary key,
	nome VARCHAR(100) NOT NULL,
	documento VARCHAR(18) NOT NULL UNIQUE,
	tipo tipo_pessoa NOT NULL
);

CREATE TYPE tipo_conta as ENUM ('corrente', 'salario', 'poupanca');
CREATE TABLE t_conta (
	id UUID primary key,
	numero INTEGER NOT NULL UNIQUE,
	saldo DECIMAL(15,2) NOT NULL DEFAULT(0.0),
	tipo tipo_conta NOT NULL,
	pessoa_id UUID references t_pessoa(id)
)
select * from t_conta

CREATE TYPE enum_tipo_operacao as ENUM('entrada', 'saida');

CREATE TABLE transactions (
	id SERIAL primary key,
	conta_id UUID NOT NULL references t_conta(id),
	created_at DATE NOT NULL,
	tipo_operacao enum_tipo_operacao NOT NULL ,
                  saldo_conta DECIMAL NOT NULL,
                  valor DECIMAL NOT NULL
)
t.created_at, t.tipo_operacao, p.nome, c.numero, c.saldo, c.tipo

ALTER TABLE transactions ADD COLUMN saldo_conta DECIMAL NOT NULL

ALTER TABLE transactions ADD COLUMN valor DECIMAL NOT NULL

