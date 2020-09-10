package informações;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrumento fl=new Instrumento("flauta", "sopro");
		fl.setCor("preta");
		fl.setMaterial("plástico");
		fl.setPreço((float) 79.99);
		System.out.println("O instrumento se chama: "+ fl.getNome());
		System.out.println("tipo: " + fl.getTipo());
		System.out.println("cor: " + fl.getCor());
		System.out.println("material: "+ fl.getMaterial());
		System.out.println("preço: " + fl.getPreço());
		fl.musica();
		System.out.println("---------");
	
		Instrumento vl=new Instrumento("violão", "corda");
		vl.setCor("marrom");
		vl.setMaterial("madeira e plástico");
		vl.setPreço((float)120);
		System.out.println("O instrumento se chama: "+ vl.getNome());
		System.out.println("tipo: "+ vl.getTipo());
		System.out.println("cor: "+ vl.getCor());
		System.out.println("material: "+ vl.getMaterial());
	    System.out.println("preço: "+ vl.getPreço());
	    vl.musica3();
	    System.out.println("---------");
	    
	    Instrumento vio=new Instrumento("violino", "corda");
	    vio.setCor("bege");
	    vio.setMaterial("madeira, metal e plástico");
	    vio.setPreço(500);
	    System.out.println("O instrumento se chama: "+ vio.getNome());
		System.out.println("tipo: "+ vio.getTipo());
		System.out.println("cor: "+ vio.getCor());
		System.out.println("material: "+ vio.getMaterial());
	    System.out.println("preço: "+ vio.getPreço());
	    vio.musica2();
	    System.out.println("---------");
	    
	    Instrumento cn=new Instrumento("congas", "percussão");
	    cn.setCor("marrom");
	    cn.setMaterial("madeira");
	    cn.setPreço(260);
	    System.out.println("O instrumento se chama: "+ cn.getNome());
		System.out.println("tipo: "+ cn.getTipo());
		System.out.println("cor: "+ cn.getCor());
		System.out.println("material: "+ cn.getMaterial());
	    System.out.println("preço: "+ cn.getPreço());
	    vl.musica3();
	    System.out.println("---------");
	    
	    Instrumento ob=new Instrumento("oboé", "sopro");
	    ob.setCor("preto e dourado");
	    ob.setMaterial("metal e plástico");
	    ob.setPreço(400);
	    System.out.println("O instrumento se chama: "+ ob.getNome());
		System.out.println("tipo: "+ ob.getTipo());
		System.out.println("cor: "+ ob.getCor());
		System.out.println("material: "+ ob.getMaterial());
	    System.out.println("preço: "+ ob.getPreço());
	    ob.musica2();
	    System.out.println("---------");
	    
		
	   }

}
