
import java.util.Scanner;

//������ �Է¹޾� �հ� ���ϱ� (���������, �ڷ���)
public class BasicTest1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int kor, eng, mat, tot;
		double avg;
		
		System.out.print("���� ���� : ");
		kor = input.nextInt();
		System.out.print("���� ���� : ");
		eng = input.nextInt();
		System.out.print("���� ���� : ");
		mat = input.nextInt();
		
		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		System.out.println("���� : " + tot + " ��� : " + avg);
	}

}
