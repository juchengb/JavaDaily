package daily.day20;

import java.util.ArrayList;
import java.util.List;

public class Node {
	
	String value;
    List<Node> children = new ArrayList<Node>();
		
    public Node(String value){
        this.value = value;
    }    
    	
	public List<Node> search(String qt) {
		List<Node> result = new ArrayList<>();
		if (qt == null) {
			return result;
		}
		
		if (qt.equals(this.value)) {
			result.add(this);
		}
		
		for (Node child: this.children) {
			result.addAll(child.search(qt));
		}
		return result;
	}
}
