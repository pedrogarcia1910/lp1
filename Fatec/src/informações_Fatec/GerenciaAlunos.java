package informa��es_Fatec;

public class GerenciaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alunos pdr=new Alunos("Pedro", 19);
		pdr.setCursoAnterior("mecatr�nica");
		pdr.setExp("n�o possui experi�ncia");
		pdr.setMateriaPref("Qu�mica");
		pdr.setCursoAtual("log�stica");
		System.out.println("O aluno se chama: "+ pdr.getNome());
		System.out.println("idade: " + pdr.getIdade());
		System.out.println("experi�ncia de trabalho: "+ pdr.getExp());
	    System.out.println("mat�ria preferida: "+ pdr.getMateriaPref());
	    System.out.println("curso t�cnico: "+pdr.getCursoAnterior());
	    System.out.println("curso atual: "+ pdr.getCursoAtual());
	    pdr.videogame();
	    System.out.println("---------");
	    
	    Alunos jrg=new Alunos("Jorge", 30);
	    jrg.setCursoAnterior("inform�tica");
	    jrg.setExp("2 anos de est�gio em TI");
	    jrg.setMateriaPref("banco de dados");
	    jrg.setCursoAtual("banco de dados");
	    System.out.println("O aluno se chama: "+ jrg.getNome());
		System.out.println("idade: " + jrg.getIdade());
		System.out.println("experi�ncia de trabalho: "+ jrg.getExp());
	    System.out.println("mat�ria preferida: "+ jrg.getMateriaPref());
	    System.out.println("curso t�cnico: "+ jrg.getCursoAnterior());
	    System.out.println("curso atual: "+ jrg.getCursoAtual());
	    jrg.caf�();
	    System.out.println("---------");
	    
	    Alunos amd=new Alunos("Amanda", 26);
	    amd.setCursoAnterior("mec�nica");
	    amd.setExp("3 anos em uma f�brica de vidro");
	    amd.setMateriaPref("matem�tica discreta");
	    amd.setCursoAtual("manuten��o de aeronaves");
	    System.out.println("A aluna se chama: "+ amd.getNome());
		System.out.println("idade: " + amd.getIdade());
		System.out.println("experi�ncia de trabalho: "+ amd.getExp());
	    System.out.println("mat�ria preferida: "+ amd.getMateriaPref());
	    System.out.println("curso t�cnico: "+ amd.getCursoAnterior());
	    System.out.println("curso atual: "+ amd.getCursoAtual());
	    amd.trilha();
	    System.out.println("---------");
	    
	    Alunos cr=new Alunos("Cristina", 40);
	    cr.setCursoAnterior("enfermagem");
	    cr.setExp("2 anos de est�gio em uma farm�cia");
	    cr.setMateriaPref("biologia");
	    cr.setCursoAtual("an�lise e desenvolivemnto de sistemas");
	    System.out.println("O aluno se chama: "+ cr.getNome());
		System.out.println("idade: " + cr.getIdade());
		System.out.println("experi�ncia de trabalho: "+ cr.getExp());
		System.out.println("mat�ria preferida: "+ cr.getMateriaPref());
	    System.out.println("curso t�cnico: "+ cr.getCursoAnterior());
	    System.out.println("curso atual: "+ cr.getCursoAtual());
	    pdr.videogame();
	    System.out.println("---------");
	    
	    Alunos ncl=new Alunos("nicolas", 18);
	    ncl.setCursoAnterior("el�trica");
	    ncl.setExp("n�o possui");
	    ncl.setMateriaPref("c�lculo");
	    ncl.setCursoAtual("banco de dados");
	    System.out.println("O aluno se chama: "+ ncl.getNome());
		System.out.println("idade: " + ncl.getIdade());
		System.out.println("experi�ncia de trabalho: "+ ncl.getExp());
		System.out.println("mat�ria preferida: "+ ncl.getMateriaPref());
	    System.out.println("curso t�cnico: "+ ncl.getCursoAnterior());
	    System.out.println("curso atual: "+ ncl.getCursoAtual());
	    ncl.caf�();
	    
	    

	}

}
