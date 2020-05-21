package sub3;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListMapTest {
	public static void main(String[] args) {
		
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> map1 = new HashMap<>();
		map1.put(101, new Apple("한국", 3000));
		map1.put(102, new Apple("중국", 2000));
		map1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(201, new Apple("미국", 6000));
		map2.put(202, new Apple("영국", 4000));
		map2.put(203, new Apple("호주", 2000));
		
		Map<Integer, Apple> map3 = new HashMap<>();
		map3.put(301, new Apple("대만", 8000));
		map3.put(302, new Apple("태국", 9000));
		map3.put(303, new Apple("독일", 2000));
		
		
		list.add(map1);
		
		
		list.add(map2);
		list.add(map3);
		
		
		
		Map<Integer, Apple> m1 = list.get(0);
		Apple a1 = m1.get(101);
		a1.show();
		
		
		list.get(1).get(203).show();
		
		
		Map<Integer, Apple> m2 = list.get(1);
		Apple a2 = m2.get(203);
		a2.show();
		
		
	}

}
