CREATE TABLE categoria (idcategoria  SERIAL NOT NULL, descricaocategoria VARCHAR(255), PRIMARY KEY (idcategoria))
CREATE TABLE compra (idcompra  SERIAL NOT NULL, criacaocompra TIMESTAMP, valorcompra BIGINT, fornecedorcompra INTEGER, funcionariocompra INTEGER, PRIMARY KEY (idcompra))
CREATE TABLE fornecedor (idfornecedor  SERIAL NOT NULL, bairro VARCHAR(255), celularcontato VARCHAR(255), cep VARCHAR(255), cidade VARCHAR(255), cnpjpessoajuridica VARCHAR(255), complemento VARCHAR(255), criacaofornecedor TIMESTAMP, emailcontato VARCHAR(255), endereco VARCHAR(255), estado VARCHAR(255), nomefornecedor VARCHAR(255), numeroendereco VARCHAR(255), razaosocialpessoajuridica VARCHAR(255), telefonecontato VARCHAR(255), PRIMARY KEY (idfornecedor))
CREATE TABLE funcionario (idfuncionario  SERIAL NOT NULL, cargofuncionario VARCHAR(255), celular VARCHAR(255), criacaofuncionario TIMESTAMP, emailcontato VARCHAR(255), nomefuncionario VARCHAR(255), telefone VARCHAR(255), PRIMARY KEY (idfuncionario))
CREATE TABLE itemcompra (iditemcompra  SERIAL NOT NULL, criacaoitemcompra TIMESTAMP, quantidadeitemcompra INTEGER, valoritemcompra BIGINT, compraitemcompra INTEGER, produtoitemcompra INTEGER, PRIMARY KEY (iditemcompra))
CREATE TABLE produto (idproduto  SERIAL NOT NULL, codigoproduto VARCHAR(255), criacaoproduto TIMESTAMP, custoproduto BIGINT, descricaoproduto VARCHAR(255), maximoproduto BIGINT, minimoproduto BIGINT, quantidade BIGINT, vendaproduto BIGINT, categoriaproduto INTEGER, fornecedorproduto INTEGER, PRIMARY KEY (idproduto))
ALTER TABLE compra ADD CONSTRAINT FK_compra_funcionariocompra FOREIGN KEY (funcionariocompra) REFERENCES funcionario (idfuncionario)
ALTER TABLE compra ADD CONSTRAINT FK_compra_fornecedorcompra FOREIGN KEY (fornecedorcompra) REFERENCES fornecedor (idfornecedor)
ALTER TABLE itemcompra ADD CONSTRAINT FK_itemcompra_compraitemcompra FOREIGN KEY (compraitemcompra) REFERENCES compra (idcompra)
ALTER TABLE itemcompra ADD CONSTRAINT FK_itemcompra_produtoitemcompra FOREIGN KEY (produtoitemcompra) REFERENCES produto (idproduto)
ALTER TABLE produto ADD CONSTRAINT FK_produto_categoriaproduto FOREIGN KEY (categoriaproduto) REFERENCES categoria (idcategoria)
ALTER TABLE produto ADD CONSTRAINT FK_produto_fornecedorproduto FOREIGN KEY (fornecedorproduto) REFERENCES fornecedor (idfornecedor)
