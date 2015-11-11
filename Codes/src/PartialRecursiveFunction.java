import java.util.ArrayList;

public class PartialRecursiveFunction {
	public static void main(String[] args) {
		try {
			int i = 4 / 0;
		} catch (Exception e) {
			ArrayList<Object> l = new ArrayList<Object>() {
				public boolean add(Object o) {
					if (o.equals(1))
						this.add(1);
					return true;
				}
			};
			l.add(1);
		}
	}
}
