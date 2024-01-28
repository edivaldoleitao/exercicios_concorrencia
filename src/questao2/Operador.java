package questao2;

import java.util.concurrent.Semaphore;

public class Operador {

	private int[] operadores = { 1, 2, 3, 4, 5 };
	private Semaphore semafore;
	private int index = 0;

	public Operador(Semaphore sem) {
		this.semafore = sem;

	}

	public void usarOperador() {
		// while (true) {
		try {
			semafore.acquire();
			System.out.println("usando o operador:" + operadores[index]);
			this.index++;
		} catch (Exception e) {

		}

		// }
	}

	public void liberarClient() {
		// while (true) {
		try {

			System.out.println("O operador " + index + " foi liberado !");
			semafore.release();
			index--;
		} catch (Exception e) {

		}

		// }
	}

}
