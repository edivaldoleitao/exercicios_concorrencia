package cooperacao;

public class ThreadImprimir extends Thread {
	private BufferCoop buf;
	
	public ThreadImprimir(BufferCoop buf) {
		this.buf = buf;
	}
	
	@Override
	public void run() {
		String result;
		for (int i = 0; i < 10; i++) {
			
			result = buf.esvaziarSem();
			System.out.println("\n\nImpressao # " + (i + 1) + ":\n Buffer = "
					+ result + " -> Tamanho: " + result.length());
		}
		System.out.println("Terminando...");
	}
}
