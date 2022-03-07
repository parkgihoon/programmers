package level01;

import java.util.ArrayList;

public class Keypad {
	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";
		String answer = "";
		int[][] keypad = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 0, 11 } }; // return "LRLLLRLLRRL"

//		 ArrayList<Integer[]> keypad = new ArrayList<Integer[]> ();
//		 keypad.add(new Integer[] { 1, 2, 3 }); // keypad[0]
//		 keypad.add(new Integer[] { 4, 5, 6 }); // keypad[1]
//		 keypad.add(new Integer[] { 7, 8, 9 }); // keypad[2]
//		 keypad.add(new Integer[] { 10, 0, 11 });// keypad[3]

		int lx = 3;
		int ly = 0;
		
		int rx = 3;
		int ry = 2;
		
		for (int arr : numbers) {
			for(int i=0; i<keypad.length; i++) {
				if(arr == keypad[i][0]) { //1,4,7 일 때
					answer += "L";
					  lx = i;
					  ly = 2;
					
				} else if(arr == keypad[i][1]) {
					int value = (Math.abs(rx-i) + Math.abs(ry-1)) - (Math.abs(lx-i) + Math.abs(ly-1));
					if(value == 0) {
					  switch(hand) {
					  case "right" :
						  answer += "R";
						  rx = i;
						  ry = 1;
						  break;
					  case "left" : 
						  answer += "L";
						  lx = i;
						  ly = 1;
						  break;
					  }
					} else if(value < 0) {
						answer += "R";
						rx = i;
						ry = 1;
					} else if(value > 0) {
						answer += "L";
						lx = i;
						ly = 1;
					}	
				} else if(arr == keypad[i][2]) { //3,6,9 일 때
					answer += "R";
					  rx = i;
					  ry = 0;
				}
			}

			
		}
		System.out.println(answer);
	}
}
