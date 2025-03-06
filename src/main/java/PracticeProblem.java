import java.io.*;
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {}

	public static String readFile(String Filename) {
		
		String readFile = "";
		FileReader reader = null;

		try {
			reader = new FileReader(Filename);
			int character;
			while ((character = reader.read()) != -1) {
				readFile = readFile + (char)character;
			}
		}

		catch (IOException e) {}

		finally {
			try {
				if (reader != null) {
					reader.close();
				}
			}
			catch (IOException e) {}
		}

		return readFile;
	}

	public static String backwardsReadFile(String filename) {

		String readFile = "";
		FileReader reader = null;

		try {
			reader = new FileReader(filename);
			int character;
			while ((character = reader.read()) != -1) {
				readFile = (char)character + readFile;
			}
		}

		catch (IOException e) {}

		finally {
			try {
				if (reader != null) {
					reader.close();
				}
			}
			catch (IOException e) {}
		}

		return readFile;

	}

}