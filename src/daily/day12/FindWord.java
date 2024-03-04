package daily.day12;

import java.util.ArrayList;
import java.util.List;

// 2942. Find Words Containing Character
public class FindWord {
	public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> reslut = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) >= 0) {
                reslut.add(i);
            }
        }
        return reslut;
    }
}
