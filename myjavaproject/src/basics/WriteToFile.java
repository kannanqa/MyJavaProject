package basics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String textToWrite = "I'm learning Java";

		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("D:\\writeTofile.txt"));
			writer.write(textToWrite);
			writer.close();
			System.out.println("The file is created and written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
