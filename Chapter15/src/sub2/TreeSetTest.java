package sub2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		Set<Integer> tree = new TreeSet<> ();
		tree.add(23);
		tree.add(10);
		tree.add(48);
		tree.add(15);
//		tree.add(7);
//		tree.add(22);
//		tree.add(56);
		
		for(int num : tree) {
			System.out.println(num+", ");
		}
	}

}
