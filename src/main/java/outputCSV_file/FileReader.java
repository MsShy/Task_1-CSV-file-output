package outputCSV_file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {

	private static final Logger logger = LoggerFactory.getLogger(FileReader.class);

	public String read(String fileName) {
		StringBuilder builder = new StringBuilder();

		try (FileInputStream reader = new FileInputStream(fileName);
		     InputStreamReader inputStreamReader = new InputStreamReader(reader)) {
			int output;
			while ((output = inputStreamReader.read()) != -1) {
				builder.append((char) output);
			}
			reader.close();
		} catch (IOException ex) {
			logger.error(ex.getMessage(), ex);
		}
		return builder.toString();
	}

	public String[] split(String text) {

		Pattern pattern = Pattern.compile("[\\!\\.\\?\\s]+");
		String[] myStr = pattern.split(text);

		for (int i = 0; i < myStr.length; i++) {
			for (char c : myStr[i].toCharArray()) {
				if (!Character.isLetterOrDigit(c)) {
					myStr[i] = "";

				}
			}
		}
		return myStr;
	}
}
		/*public String[] split(String text) {
			StringBuilder builder = new StringBuilder();
			Pattern pattern = Pattern.compile("[\\!\\.\\?\\s]+");
			String[] myStr = pattern.split(text);

			for (String s : myStr) {
				for (char c : s.toCharArray()) {
					if (!Character.isLetterOrDigit(c)) {
						builder.append(c);

					}
				}
				builder.append(" ");
			}
			return builder.toString();

		}
	}*/
/*	public String split(String text) {
		StringBuilder builder = new StringBuilder();
		for (char c : text.toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				builder.append(c);
			} else {
				builder.append(' ');
			}
		}
		return builder.toString();
}
	}*/



		/*String delimiter = ".,? :;//";
		StringBuilder builder = new StringBuilder();

		for (char textChar : text.toCharArray()) {
			if (Character.isLetterOrDigit(textChar)) {
				builder.append(textChar);
			}

			for (char del : delimiter.toCharArray()) {
				if (textChar == del) {
					builder.append(' ');
				}
			}
		}
		return builder.toString();*/


