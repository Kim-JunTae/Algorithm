package Recursive;

import java.util.ArrayList;
import java.util.List;

public class Combination���� {

	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("1");
		arr.add("2");
		arr.add("3");
		
		List<String> result = new ArrayList<String>();
		reculsion(arr, result, 0, arr.size(), 2);
	}
	
	/**
	 * ���� ���ϱ�
	 * 
	 * @param arr		: ���� ����Ʈ
	 * @param result	: ����� ����� ����Ʈ
	 * @param index		: �ݺ��� ���� �ε���
	 * @param n			: ��ü ����
	 * @param r			: ���� ����
	 */
	
	private static void reculsion(List<String> arr, List<String> result, int index, int n, int r) {
		
		//Ż�⹮
		if(r == 0) {
			System.out.println(result.toString());
			return;
		}
		
		for(int i=index; i<n; i++) {
			result.add(arr.get(i));
			reculsion(arr, result, i+1, n, r-1);
			result.remove(result.size()-1);
		}
	}
	
}
