package informações_Fatec;

public class GerenciaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alunos pdr=new Alunos("Pedro", 19);
		pdr.setCursoAnterior("mecatrônica");
		pdr.setExp("não possui experiência");
		pdr.setMateriaPref("Química");
		pdr.setCursoAtual("logística");
		System.out.println("O aluno se chama: "+ pdr.getNome());
		System.out.println("idade: " + pdr.getIdade());
		System.out.println("experiência de trabalho: "+ pdr.getExp());
	    System.out.println("matéria preferida: "+ pdr.getMateriaPref());
	    System.out.println("curso técnico: "+pdr.getCursoAnterior());
	    System.out.println("curso atual: "+ pdr.getCursoAtual());
	    pdr.videogame();
	    System.out.println("---------");
	    
	    Alunos jrg=new Alunos("Jorge", 30);
	    jrg.setCursoAnterior("informática");
	    jrg.setExp("2 anos de estágio em TI");
	    jrg.setMateriaPref("banco de dados");
	    jrg.setCursoAtual("banco de dados");
	    System.out.println("O aluno se chama: "+ jrg.getNome());
		System.out.println("idade: " + jrg.getIdade());
		System.out.println("experiência de trabalho: "+ jrg.getExp());
	    System.out.println("matéria preferida: "+ jrg.getMateriaPref());
	    System.out.println("curso técnico: "+ jrg.getCursoAnterior());
	    System.out.println("curso atual: "+ jrg.getCursoAtual());
	    jrg.café();
	    System.out.println("---------");
	    
	    Alunos amd=new Alunos("Amanda", 26);
	    amd.setCursoAnterior("mecânica");
	    amd.setExp("3 anos em uma fábrica de vidro");
	    amd.setMateriaPref("matemática discreta");
	    amd.setCursoAtual("manutenção de aeronaves");
	    System.out.println("A aluna se chama: "+ amd.getNome());
		System.out.println("idade: " + amd.getIdade());
		System.out.println("experiência de trabalho: "+ amd.getExp());
	    System.out.println("matéria preferida: "+ amd.getMateriaPref());
	    System.out.println("curso técnico: "+ amd.getCursoAnterior());
	    System.out.println("curso atual: "+ amd.getCursoAtual());
	    amd.trilha();
	    System.out.println("---------");
	    
	    Alunos cr=new Alunos("Cristina", 40);
	    cr.setCursoAnterior("enfermagem");
	    cr.setExp("2 anos de estágio em uma farmácia");
	    cr.setMateriaPref("biologia");
	    cr.setCursoAtual("análise e desenvolivemnto de sistemas");
	    System.out.println("O aluno se chama: "+ cr.getNome());
		System.out.println("idade: " + cr.getIdade());
		System.out.println("experiência de trabalho: "+ cr.getExp());
		System.out.println("matéria preferida: "+ cr.getMateriaPref());
	    System.out.println("curso técnico: "+ cr.getCursoAnterior());
	    System.out.println("curso atual: "+ cr.getCursoAtual());
	    pdr.videogame();
	    System.out.println("---------");
	    
	    Alunos ncl=new Alunos("nicolas", 18);
	    ncl.setCursoAnterior("elétrica");
	    ncl.setExp("não possui");
	    ncl.setMateriaPref("cálculo");
	    ncl.setCursoAtual("banco de dados");
	    System.out.println("O aluno se chama: "+ ncl.getNome());
		System.out.println("idade: " + ncl.getIdade());
		System.out.println("experiência de trabalho: "+ ncl.getExp());
		System.out.println("matéria preferida: "+ ncl.getMateriaPref());
	    System.out.println("curso técnico: "+ ncl.getCursoAnterior());
	    System.out.println("curso atual: "+ ncl.getCursoAtual());
	    ncl.café();
	    
	    

	}

}
