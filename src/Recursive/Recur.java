package Recursive;

import java.util.Scanner;

public class Recur {
	//����Լ�
	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.print(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���  : ");
		int x = stdIn.nextInt();
		stdIn.close();
		recur(x);
	}
}
