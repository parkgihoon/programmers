package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Singo {

	public static void main(String[] args) {
		String[] list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
		// report �ߺ��� ����
		ArrayList<String> arrlist = new ArrayList<>();
		for (String overlap : report) {
			if (!arrlist.contains(overlap))
				arrlist.add(overlap);
		}
		// �ٽ� �迭�� (split ��ü�� ����)
		String[] arr = arrlist.toArray(new String[arrlist.size()]);
		int k = 2;
		int[] count = new int[list.length];
		int[] result = new int[list.length];

		// list���� name ���
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				String[] value = arr[j].split(" ");
				// name�� v[0]�� ���ٸ� ����
				if (list[i].equals(value[0])) {
					// v[1]�� �ε��� ã��
					int idx = Arrays.asList(list).indexOf(value[1]);
					// �ش� �ε����� �� 1 �߰�
					count[idx]++;
				}
			}
		}
		System.out.println("�Ű���� Ƚ�� = " + Arrays.toString(count));
		
		
		for (int i = 0; i < list.length; i++) {
			if (count[i] >= k) { // �Ű���� Ƚ���� k �̻�
				for (int j = 0; j < arr.length; j++) {
					String[] value = arr[j].split(" ");
					if (value[1].equals(list[i])) {
						int idx = Arrays.asList(list).indexOf(value[0]);
						result[idx]++;
					}
				}

			}
		}

		System.out.println("�������� Ƚ�� = " + Arrays.toString(result));

	}

}
