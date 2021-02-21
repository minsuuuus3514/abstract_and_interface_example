package arrays_example;

public class CompareArray {

	// �� �迭�� ���ϴ� �޼���
	public static boolean equals(int[] a, int[] b) {
		
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {	
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] {5, 7, 13, 27, 19};
		int[] b = new int[] {44, 21, 19, 27, 4};
		int[] c = new int[] {5, 7, 13, 27, 19};
		int[] d = new int[] {5, 19, 7, 13, 27};
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
		System.out.println();
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		System.out.println();
		
		for(int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		
		System.out.println();
		System.out.println("�迭 a�� b�� " + (equals(a, b) ? "����." : "�ٸ���."));
		System.out.println("�迭 a�� c�� " + (equals(a, c) ? "����." : "�ٸ���."));
		System.out.println("�迭 a�� d�� " + (equals(a, d) ? "����." : "�ٸ���."));
	}

}
