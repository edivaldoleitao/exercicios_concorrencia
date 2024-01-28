package cooperacao;

import java.util.concurrent.Semaphore;

public class MainSemaforos {
	
	public static void main(String[] args) {
		Semaphore sem = new Semaphore(0);
		BufferCoop buf = new BufferCoop(sem);
		ThreadHeranca3 her1 = new ThreadHeranca3(buf, '1');
		ThreadHeranca3 her2 = new ThreadHeranca3(buf, '2');
		ThreadHeranca3 her3 = new ThreadHeranca3(buf, '3');
		ThreadImprimir imp = new ThreadImprimir(buf);
		her1.start();
		her2.start();
		her3.start();
		imp.start();
		
	}

}
