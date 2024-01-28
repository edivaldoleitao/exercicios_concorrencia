package competicao;

public class ThreadHeranca2 extends Thread {
	private BufferComp buf, buf2;
	private String texto;

	public ThreadHeranca2(BufferComp buf, String texto, BufferComp buf2) {
		this.buf = buf;
		this.texto = texto;
		this.buf2 = buf2;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			buf.add(texto);
			buf2.add(texto);
		}
	}
}
