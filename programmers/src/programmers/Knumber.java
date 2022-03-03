package programmers;

import java.util.Arrays;

public class Knumber {
	public static void main(String[] args) {
		int[] array = new int[] { 1, 5, 2, 6, 3, 7, 4 };
		int[][] command = new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } }; // return [5,6,3]
		int[][] sortarr = new int[command.length][command[0].length];
		int[] answer = new int[command.length];

		// 배열 추출 후 sort()
		for (int i = 0; i < command.length; i++) {
			sortarr[i] = Arrays.copyOfRange(array, (command[i][0] - 1), command[i][1]);
			Arrays.sort(sortarr[i]);
		}
	      

		// return 값 찾기
		for (int i = 0; i < sortarr.length; i++) {
			answer[i] = sortarr[i][(command[i][2] - 1) /*2*/];   // { 2(0) 3(1) 5(2) 6(3) }
		}
		
		System.out.println(Arrays.toString(answer));

		// for (int i = 0; i < sortarr.length; i++) {
		// System.out.println("sort[" + i + "] 번쨰의 배열");
		// System.out.print("{ ");
		// for (int j = 0; j < sortarr[i].length; j++) {
		// System.out.print(sortarr[i][j] + " ");
		// }
		// System.out.println("}");
		// }
	}
}
