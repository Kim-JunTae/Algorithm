package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//��ü�˻� ������ �迭�� �����մϴ�.
public class PhyscExamSort {
	//��ü�˻� ������
	static class PhyscData{
		String 	name;		//�̸�
		int 	height;		//Ű
		double	vision;		//�÷�
		
		//������
		PhyscData(String name, int height, double vision) {
			this.name = name;	this.height = height;	this.vision = vision;
		}

		//��ü�˻� �����͸� ���ڿ��� ��ȯ�մϴ�.
		@Override
		public String toString() {
			return "PhyscData [name=" + name + ", height=" + height + ", vision=" + vision + "]";
		}
		
		//Ű ���������� comparator
		static final Comparator<PhyscData> HEIFHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :
						(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = {
				new PhyscData("�̳���", 162, 0.3),
				new PhyscData("������", 173, 0.7),
				new PhyscData("�̼���", 175, 2.0),
				new PhyscData("ȫ�ر�", 171, 1.5),
				new PhyscData("������", 168, 0.4),
				new PhyscData("��ȣ��", 174, 1.2),
				new PhyscData("���Ѱ�", 169, 0.8),
		};
		
		Arrays.sort(x,					//�迭 x��
				PhyscData.HEIFHT_ORDER	//HEIGHT_ORDER�� ����Ͽ� ����
		);
		
		System.out.println("- ��ü�˻� ����Ʈ  -");
		System.out.println("�̸�        Ű        �÷�");
		System.out.println("---------------");
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
	}

}
