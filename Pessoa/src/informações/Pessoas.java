package informações;

public class Pessoas {
	private String nome;
	private float tamanho;
	private int idade;
	private float peso;
	private String CorPreferida;

	//construtor
	public Pessoas(String nome, int Idade){
		this.idade=Idade;
		this.nome=nome;
		}
	
	//metodos de acesso tipo setter
	public void setTamanho(float t) {
		tamanho=t;
	}
	
	public void setPeso(float p) {
		peso=p;
	}
	
	public void setCorPreferida(String c) {
		CorPreferida=c;
	}
	
	//metodo de acesso tipo getter
	public String getCorPreferida() {
		return CorPreferida;
	
	}
	public float getTamanho() {
		return tamanho;
	}

	public float getPeso() {
		return peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	//corrida
	public void correr() {
		System.out.println("corre na avenida nos fins de semana");
	}
	
	//café
	public void café() {
		System.out.println("bebe café todos os dias");
		}
	
	//trilha
	public void trilha() {
		System.out.println("pratica trilha todos os feriados");
	}
	
	//video game
	public void videogame() {
		System.out.println("joga video game todos os dias");
	}
	
	//musica
	public void musica() {
		System.out.println("escuta 5 músicas por dia");
	}
}
