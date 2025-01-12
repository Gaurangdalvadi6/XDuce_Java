package collectionExample;
// 15/4/2024
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialization {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Java");
	al.add("Python");
	al.add("DotNet");
	al.add("PHP");
	al.add("C");
	al.add("C++");
	
	try {
//		// Serialization
//		FileOutputStream fos = new FileOutputStream("file.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(al);
//		fos.close();
//		oos.close();
		
		// DeSerialization
		FileInputStream fis = new FileInputStream("file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList list = (ArrayList) ois.readObject();
		System.out.println(list);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
