package sub3;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101,  "김유신");
		map1.put(102,  "김춘추");
		map1.put(103,  "장보고");
		map1.put(104,  "강감찬");
		map1.put(105,  "이순신");
		
		// 전체 데이터 갯수
		System.out.println(map1.size());
		
		String value = map1.get(102);
		System.out.println(value);
		
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 3000);
		Apple a3 = new Apple("호주", 3000);
		
		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(101, a1);
		map2.put(102, a2);
		map2.put(103, a3);
		
		Apple korApple = map2.get(101);
		korApple.show();
		
		map2.get(102).show();
		
		
		
		
		
	}

}
 