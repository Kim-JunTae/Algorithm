package Recursive;

import java.util.ArrayList;
import java.util.List;

public class Permutation���� {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		
		List<String> result = new ArrayList<String>();
		reculsion(arr, result, arr.size(), 2);
	}
	
	/**
	 * ���� ���ϱ�
	 * 
	 * @param arr		: ���� ����Ʈ
	 * @param result	: ����� ����� ����Ʈ
	 * @param n			: ��ü ����
	 * @param r			: ���� ����
	 */
	
	private static void reculsion(List<String> arr, List<String> result, int n, int r) {
		
		//Ż�⹮
		if(r == 0) {
			System.out.println(result.toString());
			return;
		}
		
		for(int i=0; i<n; i++) {
			result.add(arr.remove(i));
			reculsion(arr, result, n-1, r-1);
			//��� ����Ʈ�� �ִ� ���� �ٽ� ���� ����Ʈ�� �Ű��ش�.
			arr.add(i, result.remove(result.size() -1));
		}
	}
	
}
