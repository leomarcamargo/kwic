package kwic;

import java.util.*;

public class IndexManager {

	Map<String, List<IndexStorage>> map = new HashMap();

	public boolean isEmpty() {
		return map.isEmpty();
	}

	public void initMap(String word, String line, int pos) {

		IndexStorage index = new IndexStorage();
		index.setLine(line);
		index.setPosition(pos);

		if (map.containsKey(word)) {
			map.get(word).add(index);
		} else {
			List<IndexStorage> list = new LinkedList<>();
			list.add(index);
			map.put(word, list);
		}
	}

	public List<IndexStorage> ocurrencesOfWord(String word) {
		return map.get(word);
	}

	public List<String> sortedWords() {
		SortedSet<String> keys = new TreeSet<String>(map.keySet());
		List<String> list = new ArrayList<>(keys);
		return list;
	}

}
