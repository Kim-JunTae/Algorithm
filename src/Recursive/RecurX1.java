package Recursive;

public class RecurX1 {
	//���� ��͸� ����
	static void recur(int n) {
		if(n > 0) {
			recur(n-1);
			System.out.print(n);
			n = n-2;
		}
	}
}
