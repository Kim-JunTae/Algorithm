package sort;

import java.util.Scanner;

//버블 정렬(버전2)
public class BubbleSort2 {
	//a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//버블 정렬2
	static void bubbleSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			//패스의 교환 횟수를 기록합니다.
			int exchg = 0;
			
			for(int j= n-1; j>i; j--)
				if(a[j-1] > a[j]) {
					swap(a, j-1, j);
					exchg++;
				}
			//교환이 이루어지지 않으면 종료합니다.
			if(exchg == 0) break;
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전2)");
		System.out.print("요솟수 : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		//배열 x를 버블 정렬합니다.
		bubbleSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"]=" + x[i]);
		}
	}
}
