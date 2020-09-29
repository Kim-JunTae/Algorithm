package Recursive;

//������ : �������� ������ ��� �κ������� ���� ����(�ߺ� ����)
//rCr

public class Powerset������ {
	
	public static void main(String[] args) {
		//���� ����
		String[] arr = new String[] {"a", "b", "c"};
		
		//���� üũ
		boolean[] state = new boolean[arr.length];
		
		//������ ����Լ� ȣ��
		powerset(arr, state, 0, arr.length);
	}
	
	/**
	 * ��� �κ����� ���ϱ�
	 * 
	 * @param arr 		: ���� �迭
	 * @param state		: "���� ���� ���� ���" ���°� üũ
	 * @param index 	: ���� ������ �Ǵ� �ε���
	 * @param end		: �迭�� ������
	 */
	public static void powerset(String[] arr, boolean[] state, int i, int end) {
		//Ż�⹮
		if(i >= end) {
			//�κ� ������ ���ϴ� ����
			//���� true�� üũ�Ǿ� �ִ� �ε����� ���� ���
			for(int w=0; w<end; w++) {
				if(state[w]) {
					System.out.print(arr[w] + " ");
				}
			}
			System.out.println();
			
			return;
		}
		
		//"���� ���� ���"�� üũ�� �� �ٸ� �κ������� ���ϴ� ����Լ� ȣ��(���� �ε����� ���� �̵�)
		state[i] = false;
		powerset(arr, state, i+1, end);
		
		//"���� ���� ���"�� üũ�� �� �ٸ� �κ������� ���ϴ� ����Լ� ȣ��(���� �ε����� ���� �̵�)
		state[i] = true;
		powerset(arr, state, i+1, end);
	}

}
