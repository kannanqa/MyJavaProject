package basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fileReader;
		BufferedReader bufferedReader;
		try {
			fileReader = new FileReader("D:\\readfromfile.txt");
			bufferedReader = new BufferedReader(fileReader);

			String textfromfile = null;

			while ((textfromfile = bufferedReader.readLine()) != null) {

				System.out.println(textfromfile);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
