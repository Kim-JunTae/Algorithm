package stack;

public class IntStack {
	private int max; //���ÿ뷮
	private int ptr; //����������
	private int[] stk; //���� ��ü
	
	//���� �� ���� : ������ ��� ����
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	//���� �� ���� : ������ ���� ��
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}

	//������
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];			// ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) {	// ������ �� ����
			max = 0;
		}
	}
	
	//���ÿ� x�� Ǫ��
	public int push(int x) throws OverflowIntStackException{
		// => ���� == �� ���α׷��� �� �������� ���� �� �ִ�.
		if(ptr == max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;	
	}
	
	//���ÿ��� �����͸� ��(���� �ִ� �����͸� ����)
	public int pop() throws EmptyIntStackException{
		if(ptr <= 0)	//������ �������
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	
	//���ÿ��� �����͸� ��ũ(���� �ִ� �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntStackException{
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr -1];
	}
	
	//���ÿ��� x�� ã�� �ε���(������ -1)�� ��ȯ
	public int indexOf(int x) {
		for(int i = ptr-1; i >= 0; i--)
			if(stk[i] == x)
				return i;	//�˻� ����
			return -1;		//�˻� ����
	}
	
	//������ ���
}
