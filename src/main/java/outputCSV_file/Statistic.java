package outputCSV_file;

import java.util.HashSet;

public class Statistic {


	public HashSet<Info> countStatistic(final String[] text) {
		HashSet<Info> infos = new HashSet<>();
		Info info;


		for (String s : text) {
			int count = 0;

			info = getWords(s,count);
			infos.add(info);


		}

		return infos;
	}


	private Info getWords(final String s, int count) {

		Info info = new Info();
		info.setWord(s);
		count++;
		info.setCount(count);

		return info;
	}


}
