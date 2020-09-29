package sort;

import java.util.Scanner;

//���� ����(����2)
public class BubbleSort2 {
	//a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//���� ����2
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			//�н��� ��ȯ Ƚ���� ����մϴ�.
			int exchg = 0;
			
			for(int j= n-1; j>i; j--)
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					exchg++;
				}
			//��ȯ�� �̷������ ������ �����մϴ�.
			if(exchg == 0) break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� ����(����2)");
		System.out.print("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		//�迭 x�� ���� �����մϴ�.
		bubbleSort(x, nx);
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"]=" + x[i]);
		}
	}
}
