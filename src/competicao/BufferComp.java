package competicao;

public class BufferComp {
	private StringBuffer buf;
	static int numBuffer = 0;
	private int num;

	public BufferComp() {
		buf = new StringBuffer();
		if (numBuffer != 0) {

			this.num = numBuffer;
			numBuffer++;
		} else {
			num = numBuffer;
			numBuffer++;
		}
	}

	public synchronized void add(String novo) {
		for (int i = 0; i < novo.length(); i++)
			buf.append(novo.charAt(i));
	}

	public synchronized void print() {
		System.out.println(buf + "Buffer" + this.num);
	}
}
