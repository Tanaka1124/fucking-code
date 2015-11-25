public class test {
	static final int[] HELLO_WORLD = { 72, 29, 7, 0, 3, -79, 87, -8, 3, -6, -8, -67 };

	public static void main(String[] args) {
		int buf = 0;
		for (int hw : HELLO_WORLD) {
			System.out.print((char) buf);
			buf += hw;
		}
	}
}
