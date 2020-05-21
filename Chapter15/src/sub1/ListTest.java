package sub1;


import java.util.ArrayList;


/*
 * 
 * 
 * 컬렉션 프레잉ㅁ워크 실습하기
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
		list2.add("김유신");
		list2.add("장보고");
		list2.add("이순신");
		list2.add("감강찬");
		list2.add("김춘추");
		
		for(String name : list2) {
			System.out.println(name);
			
		}
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 4000);
		Apple a3 = new Apple("호주", 5000);
		
		ArrayList<Apple> list3 = new ArrayList<>();
		list3.add(a1);
		list3.add(a2);
		list3.add(a3);
		
		
		a1.show123();
		
		
		
		
	}

}
