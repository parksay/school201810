
//int�� ������ ������ ���� ���� ��ȯ�ϱ�
public class BasicTest2 {

	public static void main(String[] args) {
		int x, y, z;
		
		x = 100;
		y = 200;
		
		System.out.println("��ȯ �� : x=" + x + ", y=" + y);
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("��ȯ �� : x=" + x + ", y=" + y);
	}

}
