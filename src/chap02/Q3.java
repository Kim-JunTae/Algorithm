package chap02;

import java.util.Scanner;

public class Q3 {
    static int sum = 0;

    static int sumOf(int[] a){
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("배열 요소의 수는 : ");
        int num = stdIn.nextInt();

        int[] a = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("x[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("모든 요소의 합계는 " + sumOf(a) + "이다");
    }
}
