package questao2;

import java.util.Random;

public class ThreadClient extends Thread {
	public static int numeroClient;
	private Operador operadores;

	public ThreadClient(Operador ope) {
		this.operadores = ope;
		if (numeroClient < 0 || numeroClient > 15) {
			numeroClient = 0;
		} else {
			numeroClient++;
		}
	}

	public void run() {
		// sleep ((long) (new Random().nextInt(4000) + 1000));
		while (true) {

			try {
				this.operadores.usarOperador();
				System.out.println("o cliente " + numeroClient + " esta sendo atendido !");
				sleep((long) (new Random().nextInt(4000) + 3000));
				this.operadores.liberarClient();

			} catch (Exception e) {

			}

		}
	}
}