package outputCSV_file;

public class Info {

	private String word;
	private int count;

	public void setCount(final int count) {
		this.count = count;

	}

	public int getCount() {
		return count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(final String word) {
		this.word = word;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Info info = (Info) o;

		if (count != info.count) return false;
		return word != null ? word.equals(info.word) : info.word == null;

	}

	@Override
	public int hashCode() {
		int result = word != null ? word.hashCode() : 0;
		result = 31 * result + count;
		return result;
	}

	@Override
	public String toString() {
		return "Statistic{" +
				"word='" + word + '\'' +
				", count=" + count +
				'}';
	}
}
