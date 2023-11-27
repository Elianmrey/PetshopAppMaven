package br.edu.infnet.appPetShop.model.domain;





public abstract class Produto {

    private String nome;
    private double valor;
    private String categoria;
    private int codigo;

    

    public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	@Override
    public String toString()
    {
        return nome +";"+ valor +";"+ categoria +";"+ codigo;
    }

}
