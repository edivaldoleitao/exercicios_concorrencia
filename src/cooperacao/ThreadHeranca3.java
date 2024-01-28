package cooperacao;

import java.util.concurrent.Semaphore;

public class ThreadHeranca3 extends Thread {
	private BufferCoop buf;
	private char c;

	public ThreadHeranca3(BufferCoop buf, char c) {
		this.buf = buf;
		this.c = c;
	}
	

	public void run() {
		for (int i = 0; i < 500; i++) {
			buf.inserirSem(c);
			try {
				sleep((long) 50);
			} catch (InterruptedException ie) {
			}
		}
		System.out.println("terminei: " + c);
	}
}
