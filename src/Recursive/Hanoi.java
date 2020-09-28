package Recursive;

import java.util.Scanner;

//�ϳ����� ž
public class Hanoi {
	//no���� ������ x�� ��տ��� y�� ������� �ű�
	//��  ���α׷��� ��� ��ȣ�� ���� 1,2,3���� ��Ÿ���ϴ�.
	//��� ��ȣ��  ���� 6�̹Ƿ� ���� ���, ��ǥ ����� ��� ����̶�
	//�߰� ����� 6-x-y�� ���� �� �ֽ��ϴ�.
	static void move(int no, int x, int y) {
		if(no > 1)
			move(no-1, x, 6-x-y);
		System.out.println("���� [" + no + "]�� " + x + "��տ��� " + y + "������� �ű�");
		
		if(no > 1)
			move(no-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ϳ����� ž");
		System.out.print("���� ���� : ");
		int n = stdIn. nextInt();
		
		move(n, 1, 3);
	}
}
