package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class P3_7_StringBinarySearch {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] x = {
				"abstract",	"assert",	"boolean", 
				"break", 	"byte",		"case", 	
				"catch",	"char", 	"class",	
				"const"
		};
		
		System.out.print("���ϴ� Ű���带 �Է��ϼ��� : ");
		
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0)
			System.out.println("�ش� Ű���尡 �����ϴ�.");
		else
			System.out.println("�ش� Ű����� x["+idx+"]�� �ֽ��ϴ�.");
	}

}


