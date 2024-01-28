package cooperacao;

public class Main2 {
	public static void main(String[] args) {
		BufferCoop buf = new BufferCoop();
		ThreadHeranca3 her1 = new ThreadHeranca3(buf, '1');
		ThreadHeranca3 her2 = new ThreadHeranca3(buf, '2');
		ThreadHeranca3 her3 = new ThreadHeranca3(buf, '3');
		her1.start();
		her2.start();
		her3.start();
		String result;
		for (int i = 0; i < 10; i++) {
			result = buf.esvaziar();
			System.out.println("\n\nImpressao # " + (i + 1) + ":\n Buffer = "
					+ result + " -> Tamanho: " + result.length());
		}
		System.out.println("Terminando...");
		
	}
}
