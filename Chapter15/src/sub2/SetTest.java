package sub2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set<Double> set = new HashSet<>();
		
		set.add(1.1);
		set.add(1.23);
		set.add(1.3);
		set.add(1.1);
		set.add(1.1);
		set.add(0.14);
		
		System.out.println(set);
		
		// �ݺ��ڸ� �̿��� ���տ��� ���
		Iterator<Double> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println("���� : "+iter.next());
			
		}
		
		
		
		
	}
	

}
