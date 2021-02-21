package arrays_example;

public class CompareObject {

	// �迭�� ��ҵ��� ��
		public Object sum(int[] a) {
			int sum = 0;
			for(int i = 0; i < a.length; i++) {
				sum += a[i];
			}
//			System.out.println(sum);
			return sum;
		}
	
	// �� �迭�� ���ϴ� �޼���
	public static boolean compare(Object obj1, Object obj2) {
		
		if(obj1.hashCode() == obj2.hashCode()) {
			return false;		// false = defeat
		}
		for(int i = 0; i < obj1.hashCode(); i++) {
			if(obj1.hashCode() > obj2.hashCode()) {
				return true;	// true = win
			}
		}
		return false;			// defeat
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭�� ��Ұ��� ���� ������ ��ġ
		int[] team_A = new int[] {150, 50, 130, 270};
		int[] team_B = new int[] {440, 20, 190, 80};
		int[] team_C = new int[] {50, 70, 130, 370};
		int[] team_D = new int[] {250, 190, 70, 130};
		
		CompareObject co = new CompareObject();
		Object obj1 = co.sum(team_A);
		Object obj2 = co.sum(team_B);
		Object obj3 = co.sum(team_C);
		Object obj4 = co.sum(team_D);
		
		System.out.println("*** ������ ���� ***");
		System.out.println("A�� ������ : " + obj1);
		System.out.println("B�� ������ : " + obj2);
		System.out.println("C�� ������ : " + obj3);
		System.out.println("D�� ������ : " + obj4);
		
		System.out.println();
		System.out.println("*** team_A�� ���� ��� ***");
		System.out.println("team_A vs team_B ��� = " + (compare(obj1, obj2) ? "A �¸� " + (obj1.hashCode() + obj2.hashCode()) : "�й� " + obj2));
		System.out.println("team_A vs team_C ��� = " + (compare(obj1, obj3) ? "A �¸� " + (obj1.hashCode() + obj3.hashCode()) : "�й� " + obj3));
		System.out.println("team_A vs team_D ��� = " + (compare(obj1, obj4) ? "A �¸� " + (obj1.hashCode() + obj4.hashCode()) : "�й� " + obj4));
		System.out.println("*** team_B�� ���� ��� ***");
		System.out.println("team_B vs team_A ��� = " + (compare(obj2, obj1) ? "B �¸� " + (obj2.hashCode() + obj1.hashCode()) : "�й� " + obj1));
		System.out.println("team_B vs team_C ��� = " + (compare(obj2, obj3) ? "B �¸� " + (obj2.hashCode() + obj3.hashCode()) : "�й� " + obj3));
		System.out.println("team_B vs team_D ��� = " + (compare(obj2, obj4) ? "B �¸� " + (obj2.hashCode() + obj4.hashCode()) : "�й� " + obj4));
		System.out.println("*** team_C�� ���� ��� ***");
		System.out.println("team_C vs team_A ��� = " + (compare(obj3, obj1) ? "C �¸� " + (obj3.hashCode() + obj1.hashCode()) : "�й� " + obj1));
		System.out.println("team_C vs team_B ��� = " + (compare(obj3, obj2) ? "C �¸� " + (obj3.hashCode() + obj2.hashCode()) : "�й� " + obj2));
		System.out.println("team_C vs team_D ��� = " + (compare(obj3, obj4) ? "C �¸� " + (obj3.hashCode() + obj4.hashCode()) : "�й� " + obj4));
		System.out.println("*** team_B ***");
		System.out.println("team_D vs team_A ��� = " + (compare(obj4, obj1) ? "D �¸� " + (obj4.hashCode() + obj1.hashCode()) : "�й� " + obj1));
		System.out.println("team_D vs team_B ��� = " + (compare(obj4, obj2) ? "D �¸� " + (obj4.hashCode() + obj2.hashCode()) : "�й� " + obj2));
		System.out.println("team_D vs team_C ��� = " + (compare(obj4, obj3) ? "D �¸� " + (obj4.hashCode() + obj3.hashCode()) : "�й� " + obj3));
	}

}
