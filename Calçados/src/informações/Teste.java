package informa��es;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal�ado sl=new Cal�ado("salto alto", "rosa");
		sl.setMarca("zattini");
		sl.setPre�o(80);
		sl.setTamanho(37);
		System.out.println("Cal�ado: "+sl.getNome());
		System.out.println("cor: " +sl.getCor());
		System.out.println("marca: " +sl.getMarca());
		System.out.println("pre�o: " +sl.getPre�o());
		System.out.println("tamanho: "+sl.getTamanho());
		sl.a��o2();
		System.out.println("-----------");
		
		Cal�ado bo=new Cal�ado("bota", "preta");
		bo.setMarca("captain");
		bo.setPre�o(180);
		bo.setTamanho(42);
		System.out.println("Cal�ado: " + bo.getNome());
		System.out.println("cor: "+ bo.getCor());
		System.out.println("marca: " + bo.getMarca());
		System.out.println("pre�o: " + bo.getPre�o());
		System.out.println("tamanho: "+ bo.getTamanho());
		bo.a��o3();
		System.out.println("-----------");
		
		Cal�ado ch=new Cal�ado("chinelo", "branco");
		ch.setMarca("havaians");
		ch.setPre�o(20);
		ch.setTamanho(40);
		System.out.println("Cal�ado: " + ch.getNome());
		System.out.println("cor: "+ ch.getCor());
		System.out.println("marca: " + ch.getMarca());
		System.out.println("pre�o: " + ch.getPre�o());
		System.out.println("tamanho: "+ ch.getTamanho());
		bo.a��o1();
		System.out.println("-----------");
		
		Cal�ado tm=new Cal�ado("tamanco", "roxo");
		tm.setMarca("dafiti");
		tm.setPre�o(100);
		tm.setTamanho(37);
		System.out.println("Cal�ado: " + tm.getNome());
		System.out.println("cor: "+ tm.getCor());
		System.out.println("marca: " + tm.getMarca());
		System.out.println("pre�o: " + tm.getPre�o());
		System.out.println("tamanho: "+ tm.getTamanho());
		tm.a��o2();
		System.out.println("-----------");
		
		Cal�ado pp=new Cal�ado("papete","vermelha");
		pp.setMarca("seninha");
		pp.setPre�o(60);
		pp.setTamanho(20);
		System.out.println("Cal�ado: " + pp.getNome());
		System.out.println("cor: "+ pp.getCor());
		System.out.println("marca: " + pp.getMarca());
		System.out.println("pre�o: " + pp.getPre�o());
		System.out.println("tamanho: "+ pp.getTamanho());
		pp.a��o3();
		System.out.println("-----------");
		
		
		

	}

}