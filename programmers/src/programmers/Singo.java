package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Singo {

	public static void main(String[] args) {
		String[] list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		// report 중복값 제거
		ArrayList<String> arrlist = new ArrayList<>();
		for (String overlap : report) {
			if (!arrlist.contains(overlap))
				arrlist.add(overlap);
		}
		// 다시 배열로 (split 대체를 몰라서)
		String[] arr = arrlist.toArray(new String[arrlist.size()]);
		int k = 2;
		int[] count = new int[list.length];
		int[] result = new int[list.length];

		// list에서 name 출력
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				String[] value = arr[j].split(" ");
				// name과 v[0]이 같다면 진행
				if (list[i].equals(value[0])) {
					// v[1]의 인덱스 찾기
					int idx = Arrays.asList(list).indexOf(value[1]);
					// 해당 인덱스에 값 1 추가
					count[idx]++;
				}
			}
		}
		System.out.println("신고당한 횟수 = " + Arrays.toString(count));
		
		
		for (int i = 0; i < list.length; i++) {
			if (count[i] >= k) { // 신고당한 횟수가 k 이상
				for (int j = 0; j < arr.length; j++) {
					String[] value = arr[j].split(" ");
					if (value[1].equals(list[i])) {
						int idx = Arrays.asList(list).indexOf(value[0]);
						result[idx]++;
					}
				}

			}
		}

		System.out.println("연락받은 횟수 = " + Arrays.toString(result));

	}

}
