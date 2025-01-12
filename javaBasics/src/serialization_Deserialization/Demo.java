package serialization_Deserialization;

class GaurangException extends Exception {
	public GaurangException(String string) {
		super(string);
	}
}

public class Demo {
	public static void main(String[] args) {

		int i = 20;
		int j = 0;

		try {
			j = 18 / i;
			if (j == 0) {
				throw new GaurangException("i don't want Zero");
			}
		} catch (GaurangException e) {
			j = 18 / 1;
			System.out.println("that is default output " + e);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(j);
		System.out.println("Bye");
	}
}
