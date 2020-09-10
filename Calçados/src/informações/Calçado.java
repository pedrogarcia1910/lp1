package informações;

public class Calçado {
	private String nome;
	private int preço;
	private String cor;
	private int tamanho;
	private String marca;
	
	//contsrutor
	public Calçado(String nome, String cor){
		this.cor=cor;
		this.nome=nome;
		}
	
	//metodo de acesso tipo setter
	public void setPreço(int preço) {
		this.preço = preço;
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

	public int getPreço() {
		return preço;
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
	
	//ações
	public void ação1() {  
		System.out.println("esse calçado é propício para caminhada");
	}
			
	public void ação2() {
		System.out.println("esse calçado é ideal para eventos");
	}
	
	public void ação3() {
		System.out.println("esse calçado é ideal para aventuras");
	}
	

			
	
	

}
