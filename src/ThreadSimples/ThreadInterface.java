package ThreadSimples;

import javax.swing.plaf.SliderUI;

public class ThreadInterface implements Runnable {

	private StringBuffer buf;
	private String texto;

	public ThreadInterface(StringBuffer buf, String texto) {
		this.buf = buf;
		this.texto = texto;
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			buf.append(texto);
			for (int j = 0; j < Integer.MAX_VALUE / 600; j++)
				;
		}
	}

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		Thread inter1 = new Thread(new ThreadInterface(buf, "thread 1\n"));
		Thread inter2 = new Thread(new ThreadInterface(buf, "thread 2\n"));
		Thread inter3 = new Thread(new ThreadInterface(buf, "thread 3\n"));

		inter1.start();
		inter2.start();
		inter3.start();

		for (int i = 0; i < 100000 ; i++)
			System.out.println(i+": " +buf.toString());

	}

}
