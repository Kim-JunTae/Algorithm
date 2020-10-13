package set;

//int�� ����
public class IntSet {
	private int max;	//������ �ִ� ����
	private int num;	//������ ��� ����
	private int[] set;	//���� ��ü
	
	//������
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];	//���� �迭 ����
		}catch(OutOfMemoryError e){
			//�迭 ���� ����
			max = 0;
		}
	}
	
	//������ �ִ� ����
	public int capacity() {
		return max;
	}
	
	//������ ��� ����
	public int size() {
		return num;
	}
	
	//���տ��� n�� �˻��մϴ�.(index ��ȯ)
	public int indexOf(int n) {
		for(int i=0; i<num; i++) {
			if(set[i] == n)
				return i;	//�˻� ����
		}
		return -1; 			//�˻� ����
	}
	
	//���տ� n�� �ִ��� ������ Ȯ���մϴ�.
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
	}
	
	//���տ� n�� �߰��մϴ�.
	public boolean add(int n) {
		if(num >= max || contains(n) == true)	//���� á�ų� �̹� n�� �����Ѵٸ�
			return false;
		else {
			set[num++] = n;		//���� ������ �ڸ��� �߰��մϴ�.
			return true;
		}
	}
	
	//���տ��� n�� �����մϴ�.
	public boolean remove(int n) {
		int idx;		//n�� ����� ����� �ε���
		
		if(num <= 0 || (idx = indexOf(n)) == -1)	//����ְų� n�� �������� �ʽ��ϴ�.
			return false;
		else {
			set[idx] = set[--num];		//������ ��Ҹ� ������ ������ �ű�ϴ�.
			return true;
		}
	}
	
	//���� s�� �����մϴ�.
	public void copyTo(IntSet s) {
		int n = (s.max < num) ? s.max : num;	//������ ����� ����
		for(int i=0; i<n; i++)
			s.set[i] = set[i];
		s.num = n;
	}
	
	//���� s�� �����մϴ�.
	public void copyFrom(IntSet s) {
		int n = (max < s.num) ? max : s.num;	//������ ����� ����
		for(int i=0; i<n; i++)
			set[i] = s.set[i];
		num = n;
	}
	
	//���� s�� ������ Ȯ���մϴ�.
	public boolean equalTo(IntSet s) {
		if(num != s.num)	//��� ������ ���� ������
			return false;
		
		for(int i=0; i<num; i++) {
			int j=0;
			for(; j<s.num; j++)
				if(set[i] == s.set[j])
					break;
			if(j==s.num)		//set[i]�� s�� ���Ե��� �ʽ��ϴ�.
				return false;
		}	
		return true;
	}
	
	//���� s1�� s2�� �������� �����մϴ�.
	public void unionOf(IntSet s1, IntSet s2) {
		copyFrom(s1);	//���� s1�� �����մϴ�.
		for(int i=0; i<s2.num; i++)	//���� s2�� ��Ҹ� �߰��մϴ�.
			add(s2.set[i]);
	}
	
	//"{a, b, c}"������ ���ڿ��� ǥ���� �ٲߴϴ�.
	public String toString() {
		StringBuffer temp = new StringBuffer("{ ");
		for(int i=0; i<num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}
}