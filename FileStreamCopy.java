package File0917;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamCopy {
	public static void Copy1(String src, String dest) throws IOException {
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		if (!file.exists())
			file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while ((c = in.read(buffer)) != -1) {
			for (int i = 0; i < c; i++) {
				out.write(buffer[i]);
			}
		}
		in.close();
		out.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String src = "C:\\Text1\\myfile.txt";
		String dest = "C:\\Text1\\myfile_cp.txt";
		Copy1(src, dest);
		System.out.println("¸´ÖÆÍê³É");

	}

}
