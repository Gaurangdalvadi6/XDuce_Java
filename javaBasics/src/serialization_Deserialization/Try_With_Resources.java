package serialization_Deserialization;

public class Try_With_Resources {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		try {
			j = 18/i;
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong");
		}
		finally {
			System.out.println("Bye...");
		}
	}
}
