package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExample {

	public static void main(String[] args) {

		File file = new File("sample.txt");

		System.out.println(file.getAbsolutePath());
		System.out.println("File exists? " + file.exists());

		// . means the current directory
		// .. means the parent directory

		File dir = new File("C:\\Users\\kelly\\development\\Kelly 2023-RTT-81\\CoreJavaBasics");
		System.out.println(dir.getAbsolutePath());

		File parent = new File("..\\..\\..\\..\\..\\..\\..");

		System.out.println("Parent directory " + parent.getAbsolutePath());
		for (File f : parent.listFiles()) {
			System.out.println(f.getName());
		}

		try {
			PrintWriter writer = new PrintWriter(new FileWriter(file, true));
			writer.append("This is the java class ");
			writer.flush();
			writer.close();
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());

		}

	}

}
