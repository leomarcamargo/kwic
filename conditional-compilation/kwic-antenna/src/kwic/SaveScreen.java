package kwic;

import java.util.List;

public class SaveScreen implements Save {
	public void save(List<StringStorage> list) {
		System.out.println("    [WORD]-----------[CONTEXT]");
		for (StringStorage j : list) {
			System.out.println("    " + j.getKeyword() + " " + j.getRight() + "/" + j.getLeft());
		}
	}
}
