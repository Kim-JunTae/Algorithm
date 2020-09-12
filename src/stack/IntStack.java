package stack;

public class IntStack {
	private int max; //스택용량
	private int ptr; //스택포인터
	private int[] stk; //스택 본체
	
	//실행 시 예외 : 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//실행 시 예외 : 스택이 가득 참
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}

	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];			// 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {	// 생성할 수 없음
			max = 0;
		}
	}
	
	//스택에 x를 푸시
	public int push(int x) throws OverflowIntStackException{
		// => 보다 == 이 프로그램의 더 안정성을 높일 수 있다.
		if(ptr == max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;	
	}
	
	//스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0)	//스택이 비어있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	
	//스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄)
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr -1];
	}
	
	//스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i = ptr-1; i >= 0; i--)
			if(stk[i] == x)
				return i;	//검색 성공
			return -1;		//검색 실패
	}
	
	//스택을 비움
}
