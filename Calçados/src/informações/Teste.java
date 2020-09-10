package informações;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calçado sl=new Calçado("salto alto", "rosa");
		sl.setMarca("zattini");
		sl.setPreço(80);
		sl.setTamanho(37);
		System.out.println("Calçado: "+sl.getNome());
		System.out.println("cor: " +sl.getCor());
		System.out.println("marca: " +sl.getMarca());
		System.out.println("preço: " +sl.getPreço());
		System.out.println("tamanho: "+sl.getTamanho());
		sl.ação2();
		System.out.println("-----------");
		
		Calçado bo=new Calçado("bota", "preta");
		bo.setMarca("captain");
		bo.setPreço(180);
		bo.setTamanho(42);
		System.out.println("Calçado: " + bo.getNome());
		System.out.println("cor: "+ bo.getCor());
		System.out.println("marca: " + bo.getMarca());
		System.out.println("preço: " + bo.getPreço());
		System.out.println("tamanho: "+ bo.getTamanho());
		bo.ação3();
		System.out.println("-----------");
		
		Calçado ch=new Calçado("chinelo", "branco");
		ch.setMarca("havaians");
		ch.setPreço(20);
		ch.setTamanho(40);
		System.out.println("Calçado: " + ch.getNome());
		System.out.println("cor: "+ ch.getCor());
		System.out.println("marca: " + ch.getMarca());
		System.out.println("preço: " + ch.getPreço());
		System.out.println("tamanho: "+ ch.getTamanho());
		bo.ação1();
		System.out.println("-----------");
		
		Calçado tm=new Calçado("tamanco", "roxo");
		tm.setMarca("dafiti");
		tm.setPreço(100);
		tm.setTamanho(37);
		System.out.println("Calçado: " + tm.getNome());
		System.out.println("cor: "+ tm.getCor());
		System.out.println("marca: " + tm.getMarca());
		System.out.println("preço: " + tm.getPreço());
		System.out.println("tamanho: "+ tm.getTamanho());
		tm.ação2();
		System.out.println("-----------");
		
		Calçado pp=new Calçado("papete","vermelha");
		pp.setMarca("seninha");
		pp.setPreço(60);
		pp.setTamanho(20);
		System.out.println("Calçado: " + pp.getNome());
		System.out.println("cor: "+ pp.getCor());
		System.out.println("marca: " + pp.getMarca());
		System.out.println("preço: " + pp.getPreço());
		System.out.println("tamanho: "+ pp.getTamanho());
		pp.ação3();
		System.out.println("-----------");
		
		
		

	}

}