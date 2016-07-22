package outputCSV_file;

import java.util.HashSet;

public class Main {


	public static void main(String[] args) {


		FileReader read = new FileReader();
		String text = read.read("src/main/resources/task_1.txt");

		//System.out.println(read.split(text));
		String[] result = read.split(text);
		for (String s : result) {
			System.out.println(s);
		}
		Statistic statistic = new Statistic();
		HashSet<Info> infos = statistic.countStatistic(result);

		for (Info info : infos) {
			System.out.println(info.toString());
		}
	}
}
