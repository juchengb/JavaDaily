package daily.day46;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// About HashSet, LinkedHashSet, TreeSet
public class Sets {

	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<>();
		hs.add(9);
		hs.add(8);
		hs.add(1);
		hs.add(6);
		hs.add(5);
		hs.add(8);
		System.out.println("HashSet = " + hs);
		
		Set<Integer> lhs = new LinkedHashSet<>();
		lhs.add(9);
		lhs.add(8);
		lhs.add(1);
		lhs.add(6);
		lhs.add(5);
		lhs.add(8);
		System.out.println("LinkedHashSet = " + lhs);
		
		Set<Integer> ts = new TreeSet<>();
		ts.add(9);
		ts.add(8);
		ts.add(1);
		ts.add(6);
		ts.add(5);
		ts.add(8);
		System.out.println("TreeSet = " + ts);
		
		System.out.println("=====================");
		
		Set<String> hsString = new HashSet<>();
		hsString.add("Mary");
		hsString.add("Ben");
		hsString.add("David");
		hsString.add("Ben");
		System.out.println("HashSet String = " + hsString);
		
		Set<String> lhsString = new LinkedHashSet<>();
		lhsString.add("Mary");
		lhsString.add("Ben");
		lhsString.add("David");
		lhsString.add("Ben");
		System.out.println("LinkedHashSet String = " + lhsString);
		
		Set<String> tsString = new TreeSet<>();
		tsString.add("Mary");
		tsString.add("Ben");
		tsString.add("David");
		tsString.add("Ben");
		System.out.println("TreeSet String = " + tsString);

	}

}
