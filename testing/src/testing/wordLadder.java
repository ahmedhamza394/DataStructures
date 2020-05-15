package testing;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class wordLadder {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Queue<String> q = new LinkedList<>();
		q.add(beginWord);
		int ans = 0;
		while (!q.isEmpty()) {
			String top = q.remove();
			for (int i = 0; i < wordList.size(); i++) {
				if (oneLetterAppart(top, wordList.get(i))) {
					if (wordList.get(i) == endWord) {
						System.out.println("TRUE");
						return ans;
					}
					q.add(wordList.get(i));

				}
			}
		}
		return 0;
	}

	public boolean oneLetterAppart(String a, String b) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (count > 1)
				return false;
			if (a.charAt(i) == b.charAt(i) && count > 1)
				return false;
			if (a.charAt(i) != b.charAt(i))
				count++;
		}
		if (count > 1)
			return false;
		return true;
	}

}
