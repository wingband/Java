package sub1;


import java.util.ArrayList;


/*
 * 
 * 
 * �÷��� �����פ���ũ �ǽ��ϱ�
 * 
 */
public class ListTest {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.remove(2);
		
		System.out.println(list1.get(0));
		System.out.println(arr[1]);
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("������");
		list2.add("�庸��");
		list2.add("�̼���");
		list2.add("������");
		list2.add("������");
		
		for(String name : list2) {
			System.out.println(name);
			
		}
		
		Apple a1 = new Apple("�ѱ�", 3000);
		Apple a2 = new Apple("�̱�", 4000);
		Apple a3 = new Apple("ȣ��", 5000);
		
		ArrayList<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		
		a1.show123();
		
		
		
		
	}

}
