package informa��es;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrumento fl=new Instrumento("flauta", "sopro");
		fl.setCor("preta");
		fl.setMaterial("pl�stico");
		fl.setPre�o((float) 79.99);
		System.out.println("O instrumento se chama: "+ fl.getNome());
		System.out.println("tipo: " + fl.getTipo());
		System.out.println("cor: " + fl.getCor());
		System.out.println("material: "+ fl.getMaterial());
		System.out.println("pre�o: " + fl.getPre�o());
		fl.musica();
		System.out.println("---------");
	
		Instrumento vl=new Instrumento("viol�o", "corda");
		vl.setCor("marrom");
		vl.setMaterial("madeira e pl�stico");
		vl.setPre�o((float)120);
		System.out.println("O instrumento se chama: "+ vl.getNome());
		System.out.println("tipo: "+ vl.getTipo());
		System.out.println("cor: "+ vl.getCor());
		System.out.println("material: "+ vl.getMaterial());
	    System.out.println("pre�o: "+ vl.getPre�o());
	    vl.musica3();
	    System.out.println("---------");
	    
	    Instrumento vio=new Instrumento("violino", "corda");
	    vio.setCor("bege");
	    vio.setMaterial("madeira, metal e pl�stico");
	    vio.setPre�o(500);
	    System.out.println("O instrumento se chama: "+ vio.getNome());
		System.out.println("tipo: "+ vio.getTipo());
		System.out.println("cor: "+ vio.getCor());
		System.out.println("material: "+ vio.getMaterial());
	    System.out.println("pre�o: "+ vio.getPre�o());
	    vio.musica2();
	    System.out.println("---------");
	    
	    Instrumento cn=new Instrumento("congas", "percuss�o");
	    cn.setCor("marrom");
	    cn.setMaterial("madeira");
	    cn.setPre�o(260);
	    System.out.println("O instrumento se chama: "+ cn.getNome());
		System.out.println("tipo: "+ cn.getTipo());
		System.out.println("cor: "+ cn.getCor());
		System.out.println("material: "+ cn.getMaterial());
	    System.out.println("pre�o: "+ cn.getPre�o());
	    vl.musica3();
	    System.out.println("---------");
	    
	    Instrumento ob=new Instrumento("obo�", "sopro");
	    ob.setCor("preto e dourado");
	    ob.setMaterial("metal e pl�stico");
	    ob.setPre�o(400);
	    System.out.println("O instrumento se chama: "+ ob.getNome());
		System.out.println("tipo: "+ ob.getTipo());
		System.out.println("cor: "+ ob.getCor());
		System.out.println("material: "+ ob.getMaterial());
	    System.out.println("pre�o: "+ ob.getPre�o());
	    ob.musica2();
	    System.out.println("---------");
	    
		
	   }

}
