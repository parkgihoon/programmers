package level01;

import java.util.HashMap;
import java.util.Map;

public class NumberAbc {
	public static String s = "one4seveneight";

	public static void main(String[] args) {
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		Map<String, String> map = new HashMap<>();
		map.put("0", "zero");
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");
		map.put("6", "six");
		map.put("7", "seven");
		map.put("8", "eight");
		map.put("9", "nine");
		
		for (String str : map.keySet()) {
			s = s.replaceAll(map.get(str), str);
		}
		
		return Integer.parseInt(s);
	}
}
