package informa��es;

public class Cal�ado {
	private String nome;
	private int pre�o;
	private String cor;
	private int tamanho;
	private String marca;
	
	//contsrutor
	public Cal�ado(String nome, String cor){
		this.cor=cor;
		this.nome=nome;
		}
	
	//metodo de acesso tipo setter
	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//metodo de acesso tipo getter
	public String getNome() {
		return nome;
	}

	public int getPre�o() {
		return pre�o;
	}

	public String getCor() {
		return cor;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getMarca() {
		return marca;
	}
	
	//a��es
	public void a��o1() {  
		System.out.println("esse cal�ado � prop�cio para caminhada");
	}
			
	public void a��o2() {
		System.out.println("esse cal�ado � ideal para eventos");
	}
	
	public void a��o3() {
		System.out.println("esse cal�ado � ideal para aventuras");
	}
	

			
	
	

}
