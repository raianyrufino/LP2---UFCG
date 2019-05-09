package lab05_RaianyRufino;

public class Sistema {
	
	private ControllerFornecedor sistemaFornecedor;
	private ControllerCliente sistemaCliente;
	
	public Sistema() {
		this.sistemaFornecedor = new ControllerFornecedor();
		this.sistemaCliente = new ControllerCliente();
	}

    /**
	* Retorna uma String com a informa��o a respeito do cadastro de um cliente. 
	* O cadastro pode n�o ser realizado, caso seus par�metros sejam inv�lidos,
	* ou o produto j� esteja cadastrado.
	* 
	* @param cpf Cpf do cliente.
	* @param nome Nome do cliente.
	* @param email Email do cliente.
	* @param localizacao Localiza��o do cliente.
	* @return String com a informa��o a respeito do cadastro do cliente.
	*/	
    public String adicionaCliente(String cpf, String nome, String email, String localizacao) {
    	return this.sistemaCliente.adicionaCliente(cpf, nome, email, localizacao);
    }
	
    /**
	* Retorna uma String com a informa��o a respeito da consulta de um cliente,
	* no formato: "nome - localiza��o - email".
	* A consulta pode n�o ser realizada, caso o cliente n�o esteja cadastrado, ou 
	* o cpf informado seja inv�lido.
	* 
	* @param cpf Cpf do cliente.
	* @return String com a informa��o a respeito do cliente.
	*/
    public String exibeCliente(String cpf) {
    	return this.sistemaCliente.exibeCliente(cpf);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito da consulta de todos os
	* clientes no formato: "nome - localiza��o - email | nome - localiza��o - email".
	* 
	* @return String com as informa��es a respeito de todos os clientes.
	*/
    public String exibeClientes() {
    	return this.sistemaCliente.exibeClientes();
    }
	
    /**
	* Retorna a informa��o a respeito da altera��o de um cliente.
	* A altera��o n�o � feita caso os parametros sejam inv�lidos.
	* 
	* @param cpf Cpf do cliente
	* @param atributo O atributo a ser editado.
	* @param novoValor O novo valor do atributo a ser editado.
	* @return A informa��o a respeito da edi��o do cliente.
	*/
    public void editaCliente(String cpf, String atributo, String novoValor) {
    	this.sistemaCliente.editaCliente(cpf, atributo, novoValor);
    }
    
    /**
	* Retorna a informa��o a respeito da remo��o do cliente.
	* A remo��o n�o � feita caso o cliente n�o esteja cadastrado.
	* 
	* @param cpf Cpf do cliente.
	* @return A informa��o a respeito da remo��o do cliente.
	*/	
    public void removeCliente(String cpf) {
    	this.sistemaCliente.removeCliente(cpf);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito do cadastro de um fornecedor. 
	* O cadastro pode n�o ser realizado, caso seus par�metros sejam inv�lidos,
	* ou o fornecedor j� esteja cadastrado.
	* 
	* @param nome Nome do fornecedor.
	* @param email Email do fornecedor.
	* @param telefone Telefone do fornecedor.
	* @return String com a informa��o a respeito do cadastro do fornecedor.
	*/		
    public String adicionaFornecedor(String nome, String email, String telefone) {
    	return this.sistemaFornecedor.adicionaFornecedor(nome, email, telefone);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito da consulta de um fornecedor,
	* no formato: "nome - email - telefone".
	* A consulta pode n�o ser realizada, caso o fornecedor n�o esteja cadastrado, ou 
	* o nome informado seja inv�lido.
	* 
	* @param nome Nome do cliente.
	* @return String com a informa��o a respeito do fornecedor.
	*/
    public String exibeFornecedor(String nome) {
    	return this.sistemaFornecedor.exibeFornecedor(nome);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito da consulta de todos os
	* fornecedores no formato: "nome - email - telefone | nome - email - telefone".
	* 
	* @return String com as informa��es a respeito de todos os fornecedores.
	*/
    public String exibeFornecedores() {
    	return this.sistemaFornecedor.exibeFornecedores();
    }
    
    /**
	* Retorna a informa��o a respeito da altera��o de um cliente.
	* A altera��o n�o � feita caso os parametros sejam inv�lidos.
	* 
	* @param nome O nome do fornecedor
	* @param atributo O atributo a ser editado.
	* @param novoValor O novo valor do atributo a ser editado.
	* @return A informa��o a respeito da edi��o do fornecedor.
	*/
    public void editaFornecedor(String nome, String atributo, String novoValor) {
    	this.sistemaFornecedor.editaFornecedor(nome, atributo, novoValor);
    }
    
    /**
	* Retorna a informa��o a respeito da remo��o do fornecedor.
	* A remo��o n�o � feita caso o fornecedor n�o esteja cadastrado 
	* ou seu nome seja inv�lido.
	* 
	* @param nome Nome do fornecedor.
	* @return A informa��o a respeito da remo��o do fornecedor.
	*/	
    public void removeFornecedor(String nome) {
    	this.sistemaFornecedor.removeFornecedor(nome);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito do cadastro de um produto. 
	* O cadastro pode n�o ser realizado, caso os par�metros sejam inv�lidos
	* ou o fornecedor n�o esteja cadastrado.
	* 
	* @param fornecedor Nome do fornecedor.
	* @param nome Nome do produto.
	* @param descricao Descricao do produto
	* @param preco Pre�o do produto.
	* @return String com a informa��o a respeito do cadastro do produto.
	*/
    public void adicionaProduto(String fornecedor, String nome, String descricao, double preco) {
    	this.sistemaFornecedor.adicionaProduto(fornecedor, nome, descricao, preco);
    }
    
    /**
   	* Retorna uma String com a informa��o a respeito do cadastro de um combo,
   	* que � formado por mais de um produto. 
   	* O cadastro pode n�o ser realizado, caso os par�metros sejam inv�lidos
   	* ou o fornecedor n�o esteja cadastrado.
   	* 
   	* @param fornecedor Nome do fornecedor.
   	* @param nomeDoCombo Nome do combo.
   	* @param descricao Descricao do combo.
   	* @param fator O fator de desconto do combo.
   	* @param produtosDoCombo Os produtos que far�o parte do combo.
   	* @return String com a informa��o a respeito do cadastro do combo.
   	*/
    public void adicionaCombo(String fornecedor, String nomeDoCombo, String descricao, double fator, String produtosDoCombo) {
    	this.sistemaFornecedor.adicionaCombo(fornecedor, nomeDoCombo, descricao, fator, produtosDoCombo);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito da consulta de um produto,
	* no formato: "nomeDoProduto - descricao - preco".
	* A consulta pode n�o ser realizada, caso os par�metros sejam inv�lidos
	* ou o fornecedor n�o esteja cadastrado.
	* 
	* @param nome Nome do produto.
	* @param descricao Descricao do produto.
	* @param fornecedor Nome do fornecedor.
	* @return String com a informa��o a respeito do produto.
	*/	
    public String exibeProduto(String nome, String descricao, String fornecedor) {
    	return this.sistemaFornecedor.exibeProduto(nome, descricao, fornecedor);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito da consulta de todos os
	* produtos de um fornecedor no formato: "nomeDoFornecedor - nomeDoProduto - 
	* descricao - preco | nomeDoFornecedor - nomeDoProduto - descricao - preco |".
	* A consulta pode n�o ser realizada, caso os par�metros sejam inv�lidos
	* ou o fornecedor n�o esteja cadastrado.
	* 
	* @return String com a informa��o a respeito dos produtos.
	*/	
    public String exibeProdutosFornecedor(String fornecedor) {
    	return this.sistemaFornecedor.exibeProdutosFornecedor(fornecedor);
    }
    
    /**
	* Retorna uma String com a informa��o a respeito da consulta de todos os
	* produtos cadastrados no formato: "nomeDoFornecedor - nomeDoProduto - 
	* descricao - preco | nomeDoFornecedor - nomeDoProduto - descricao - preco |".
	* A consulta pode n�o ser realizada, caso n�o hajam fornecedores cadastrados.
	* 
	* @return String com a informa��o a respeito dos produtos.
	*/
    public String exibeProdutos() {
    	return this.sistemaFornecedor.exibeProdutos();
    }
    
    /**
	* Retorna a informa��o a respeito da altera��o do 
	* atributo que representa o pre�o do produto. 
	* A altera��o pode n�o ser realizada, caso os par�metros sejam inv�lidos
	* ou o fornecedor n�o esteja cadastrado.
	* 
	* @param nome O nome do produto.
	* @param descricao A descri��o do produto.
	* @param fornecedor O nome do fornecedor.
	* @param novoPreco O novo pre�o do produto.
	* @return A informa��o a respeito da edi��o do produto.
	*/	
    public void editaProduto(String nome, String descricao, String fornecedor, double novoPreco) {
    	this.sistemaFornecedor.editaProduto(nome, descricao, fornecedor, novoPreco);
    }
    
    /**
	* Retorna a informa��o a respeito da altera��o do 
	* atributo que representa o fator de desconto do combo, e
	* consequentemente, seu pre�o. A altera��o pode n�o ser 
	* realizada, caso os par�metros sejam inv�lidos ou o 
	* fornecedor n�o esteja cadastrado.
	* 
	* @param nome O nome do combo.
	* @param descricao A descri��o do combo.
	* @param fornecedor O nome do fornecedor.
	* @param novoFator O novo fator de desconto do combo.
	* @return A informa��o a respeito da edi��o do combo.
	*/	
    public void editaCombo(String nome, String descricao, String fornecedor, double novoFator) {
    	this.sistemaFornecedor.editaCombo(nome, descricao, fornecedor, novoFator);
    }
    
    /**
	* Retorna a informa��o a respeito da remo��o do produto.
	* A remo��o pode n�o ser realizada, caso os par�metros sejam inv�lidos
	* ou o fornecedor n�o esteja cadastrado.
	* 
	* @param nome O nome do produto.
	* @param descricao A descri��o do produto.
	* @param fornecedor O nome do fornecedor.
	* @return A informa��o a respeito da remo��o do produto
	*/	
    public void removeProduto(String nome, String descricao, String fornecedor) {
    	this.sistemaFornecedor.removeProduto(nome, descricao, fornecedor);
    }
    
    public void adicionaCompra(String cpf, String fornecedor, String data, String nome_prod, String desc_prod) {
    	if(cpf.length() != 11) {
			throw new IllegalArgumentException("Erro ao cadastrar compra: cpf invalido.");
		} else if(this.sistemaCliente.existeCliente(cpf)) {
    		this.sistemaFornecedor.adicionaCompra(cpf, fornecedor, data, nome_prod, desc_prod);
    	} else {
    		throw new IllegalArgumentException("Erro ao cadastrar compra: cliente nao existe.");
    	}
    }
    
    /**
     * Acessa o d�bito de um cliente a partir de seu cpf e fornecedor.
     * @param cpf O n�mero de Cpf do cliente.
     * @param fornecedor O nome do fornecedor.
     * @return o d�bito da conta.
     */
    public String getDebito(String cpf, String fornecedor) {
    	if(cpf.length() != 11) {
			throw new IllegalArgumentException("Erro ao recuperar debito: cpf invalido."); 
    	} else if(!this.sistemaCliente.existeCliente(cpf)) {
    		throw new IllegalArgumentException("Erro ao recuperar debito: cliente nao existe.");
    	} else {
    		return this.sistemaFornecedor.getDebito(cpf, fornecedor);
    	}
    }
    
    /**
     * Exibe todas as contas.
     * @param cpf O n�mero de Cpf do cliente.
     * @param fornecedor O nome do fornecedor.
     * @return A representa��o textual das contas.
     */
    public String exibeContas(String cpf, String fornecedor) {
    	if(cpf.length() != 11) {
			throw new IllegalArgumentException("Erro ao exibir conta do cliente: cpf invalido.");
		} else if(this.sistemaCliente.existeCliente(cpf)) {
    		return "Cliente: " + this.sistemaCliente.getNome(cpf) + " | " + this.sistemaFornecedor.exibeContas(cpf, fornecedor);
    	} else {
    		throw new IllegalArgumentException("Erro ao exibir conta do cliente: cliente nao existe.");
    	}
    }
    
    /**
     * Exibe todas as contas de um cliente.
     * @param cpf O n�mero de Cpf do cliente.
     * @param fornecedor O nome do fornecedor.
     * @return A representa��o textual do cliente e de suas contas.
     */
    public String exibeContasClientes(String cpf) {
    	if(cpf.length() != 11) {
			throw new IllegalArgumentException("Erro ao exibir contas do cliente: cpf invalido.");
		} else if(!this.sistemaCliente.existeCliente(cpf)) {
			throw new IllegalArgumentException("Erro ao exibir contas do cliente: cliente nao existe.");
		} else {
			return "Cliente: " + this.sistemaCliente.getNome(cpf) + this.sistemaFornecedor.exibeContasClientes(cpf);
		}
    }
	
	
}
