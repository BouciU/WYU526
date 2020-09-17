package File0917;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Text1\\note.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}

}
