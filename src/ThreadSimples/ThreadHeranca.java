package ThreadSimples;

public class ThreadHeranca extends Thread {
	StringBuffer buf;
	private String texto;

	public ThreadHeranca(StringBuffer buf, String texto) {
		this.buf = buf;
		this.texto = texto;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			buf.append(texto);
			try {
				sleep((long) (Math.random() * 100));
			} catch (InterruptedException ie) {
			}
		}
	}

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		ThreadHeranca her1 = new ThreadHeranca(buf, "thread 1\n");
		ThreadHeranca her2 = new ThreadHeranca(buf, "thread 2\n");
		ThreadHeranca her3 = new ThreadHeranca(buf, "thread 3\n");
		her1.start();
		her2.start();
		her3.start();
		for (int i = 0; i < 100000 ; i++)
			System.out.println(i + ": " + buf.toString());
		

	}
}
