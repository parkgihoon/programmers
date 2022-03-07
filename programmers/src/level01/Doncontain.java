package level01;
import java.util.ArrayList;

public class Doncontain {
	private static int[] numbers = { 5,8,4,0,6,7,9 };

	public static void main(String[] args) {
		solution(numbers);
	}

	public static int solution(int[] numbers) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int arr : numbers) {
			list.add(arr);
		}

		for (int i = 0; i < 10; i++) {
			if (!list.contains(i)) {
				answer += i;
			}
		}
		System.out.println(answer);

		return answer;
	}
}
