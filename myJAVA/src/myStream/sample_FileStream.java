package myStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample_FileStream {

	private String fileName;
	private String data;

	public sample_FileStream() {

		fileName = "C:\\Users\\taianluo\\Documents\\GitHub\\myJavaCode\\myJAVA\\res\\student.txt";
		try {

			// InputStreamReader & BufferedReader
			InputStreamReader isReader = new InputStreamReader(System.in);
			BufferedReader bfReader = new BufferedReader(isReader);
			System.out.println("Please input string");
			String str = bfReader.readLine();
			System.out.println(str);
			isReader.close();

			// FileWriter & BufferedWriter
			FileWriter fWriter = new FileWriter(fileName);
			BufferedWriter bfWriter = new BufferedWriter(fWriter);

			bfWriter.write("王一,90,80");
			bfWriter.newLine();
			bfWriter.write("張三,70,85");
			bfWriter.newLine();
			bfWriter.flush();
			fWriter.close();

			// FileReader & BufferedReader
			FileReader fRead = new FileReader(fileName);
			BufferedReader bfReader1 = new BufferedReader(fRead);

			do {
				data = bfReader1.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			} while (true);

			fRead.close();

			// FileInputStream &
			String jpgName = "Penguins.jpg";
			FileInputStream fiStream = new FileInputStream(jpgName);
			byte[] data = new byte[fiStream.available()];
			fiStream.read(data);
			fiStream.close();

			FileOutputStream foStream = new FileOutputStream("複製" + jpgName);
			foStream.write(data);
			foStream.close();

			// test
			String fName1 = "poem1.txt";
			String fName2 = "poem2.txt";

			FileReader fReadT = new FileReader(fName1);
			BufferedReader bfReaderT = new BufferedReader(fReadT);

			FileWriter fWriterT = new FileWriter("poem3.txt");
			BufferedWriter bfWriterT = new BufferedWriter(fWriterT);

			do {
				String fdata = bfReaderT.readLine();
				if (fdata == null) {
					break;
				}
				bfWriterT.write(fdata);
				bfWriterT.newLine();
			} while (true);
			fReadT.close();

			FileReader fReadT1 = new FileReader(fName2);
			BufferedReader bfReaderT1 = new BufferedReader(fReadT1);

			do {
				String fdata = bfReaderT1.readLine();
				if (fdata == null) {
					break;
				}
				bfWriterT.write(fdata);
				bfWriterT.newLine();
			} while (true);
			fReadT1.close();
			bfWriterT.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File ERROR !!");
		}
	}
}
