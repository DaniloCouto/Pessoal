
public class Main {

	public static void main(String[] args) {
		Teste t = new Teste(1,"Oi", 3.5);
		Teste t2 = new Teste(2, "Ola", 4.5);
		
		System.out.println("\nId :"+t.getI()+"\nNome :"+t.getS()+"\nValor :"+t.getV());
		System.out.println("\nId :"+t2.getI()+"\nNome :"+t2.getS()+"\nValor :"+t2.getV());
		
	}

}
