package competicao;

public class Main {
	public static void main(String[] args) {
		BufferComp buf = new BufferComp();
		BufferComp buf2 = new BufferComp();

		ThreadHeranca2 her1 = new ThreadHeranca2(buf, "thread 1\n", buf2);
		ThreadHeranca2 her2 = new ThreadHeranca2(buf, "thread 2\n", buf2);
		ThreadHeranca2 her3 = new ThreadHeranca2(buf, "thread 3\n", buf2);
		ThreadHeranca2 her4 = new ThreadHeranca2(buf, "thread 4\n", buf2);
		ThreadHeranca2 her5 = new ThreadHeranca2(buf, "thread 5\n", buf2);

		her1.start();
		her2.start();
		her3.start();
		her4.start();
		her5.start();

		for (int i = 0; i < Integer.MAX_VALUE / 10; i++)
			;
		buf.print();
		buf2.print();

	}
}
