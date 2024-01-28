package cooperacao;

import java.util.concurrent.Semaphore;

public class BufferCoop {
	private char[] buf;
	private int tam;
	private final int MAX = 100;
	private Semaphore semaforo;

	public BufferCoop() {
		buf = new char[MAX];
		tam = 0;
	}
	
	public BufferCoop(Semaphore semaforo ) {
		buf = new char[MAX];
		tam = 0;
		this.semaforo = semaforo;
	}

	public synchronized void inserir(char c) {
		if (tam == MAX)
			notifyAll();
		else
			buf[tam++] = c;
	}

	public synchronized String esvaziar() {		
		while (tam < MAX)
			try {
				wait();
			} catch (InterruptedException ie) {
			}
		tam = 0;
		return new String(buf);
	}
	
	public void inserirSem(char c) {
		if (tam == MAX) {
			semaforo.release();
		}
		else {
			buf[tam++] = c;
		}
			
	}

	public String esvaziarSem() {		
			try {
				semaforo.acquire();
			} catch (InterruptedException ie) {
			}
		tam = 0;
		return new String(buf);
	}
		
}
