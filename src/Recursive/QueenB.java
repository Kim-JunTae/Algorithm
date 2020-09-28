package Recursive;

//�� ���� 1���� ���� ��ġ�ϴ� ������ ��������� �����մϴ�.

public class QueenB {
	static int[] pos = new int[8]; //�� ���� ���� ��ġ
	
	//�� ���� ���� ��ġ�� ����մϴ�.
	static void print() {
		for(int i=0; i<8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}

	//i���� ���� �����ϴ�.
	static void set(int i) {
		for(int j=0; j<8; j++) {
			pos[i] = j; 	//���� j�࿡ ��ġ�մϴ�.
			if(i==7)		//��� ���� ���� ��ġ�Ͽ����ϴ�.
				print();
			else
				set(i+1);	//���� ���� ���� ��ġ�մϴ�.
		}
	}
	
	public static void main(String[] args) {
		set(0);

	}

}
