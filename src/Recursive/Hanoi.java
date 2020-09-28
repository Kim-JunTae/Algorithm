package Recursive;

import java.util.Scanner;

//하노이의 탑
public class Hanoi {
	//no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
	//이  프로그램은 기둥 번호를 정수 1,2,3으로 나타냅니다.
	//기둥 번호의  합이 6이므로 시작 기둥, 목표 기둥이 어느 기둥이라도
	//중간 기둥은 6-x-y로 구할 수 있습니다.
	static void move(int no, int x, int y) {
		if(no > 1)
			move(no-1, x, 6-x-y);
		System.out.println("원반 [" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");
		
		if(no > 1)
			move(no-1, 6-x-y, y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("하노이의 탑");
		System.out.print("원반 갯수 : ");
		int n = stdIn. nextInt();
		
		move(n, 1, 3);
	}
}
