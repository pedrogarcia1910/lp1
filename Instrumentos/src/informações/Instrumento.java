package informa��es;

public class Instrumento {
	private String nome;
	private String tipo;
	private String cor;
	private float pre�o;
	private String material;
	
	//construtor
	public Instrumento(String nome, String Tipo){
		tipo=Tipo;
		this.nome=nome;
		}
	
	//metodos de acesso tipo setter
		public void setCor(String c) {
			cor=c;
		}
		
		public void setPre�o(float p) {
			pre�o=p;
		}
		
		public void setMaterial(String m) {
			material=m;
		}
		
		//metodo de acesso tipo getter

		public String getNome() {
			return nome;
		}

		public String getTipo() {
			return tipo;
		}

		public String getCor() {
			return cor;
		}

		public float getPre�o() {
			return pre�o;
		}

		public String getMaterial() {
			return material;
		}
		
		//musica
		public void musica() {
			System.out.println("combina com m�sicas de rock");
		}	
		//musica2
		public void musica2() {
			System.out.println("combina com m�sica cl�ssica");
		}
		
		//musica3
		public void musica3() {
			System.out.println("combina com sertanejo");
		}
		
		
		

}
