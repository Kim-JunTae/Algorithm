package binary_search;

public class P3_4_BinSearch {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2; //중앙 요소의 인덱스
			if(a[pc]==key)
				return pc;
			else if(a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		}while(pl <= pr);
		
		return -1;		//검색 실패
	}
	
	public static void main(String[] args) {
		
	}
}
