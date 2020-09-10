package informações_Fatec;

public class Alunos {
	private String nome;
	private int idade;
	private String CursoAnterior;
	private String exp;
	private String MateriaPref;
	private String CursoAtual;
	
	//construtor
	public Alunos(String nome, int Idade) {
		idade=Idade;
		this.nome=nome;
		}
	
	//metodo de entrada setter
	public void setCursoAnterior(String c) {
		CursoAnterior=c;
	}
	
	public void setExp(String e) {
		exp=e;
	}
	
	public void setMateriaPref(String m) {
		MateriaPref=m;
	}

	public void setCursoAtual(String cursoAtual) {
		CursoAtual = cursoAtual;
	}

	//metodo acesso tipo getter
	public String getCursoAnterior() {
		return CursoAnterior;
	}
	public String getExp() {
		return exp;
	}
	public String getMateriaPref() {
		return MateriaPref;
	}
	public String getNome() {
		return nome;
	}
	
	public String getCursoAtual() {
		return CursoAtual;
	}
	
	public int getIdade() {
		return idade;
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
}
