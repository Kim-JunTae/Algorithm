package linear_search;

import java.util.Scanner;

//�����˻� (���ʹ�_sentinel)
public class P3_3_SeqSearchSen {
	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�.
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key; //���ʸ� �߰�
		
		while(true) {
			if(a[i] == key)	//�˻� ����
				break;
			i++;
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��ڼ� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
}
