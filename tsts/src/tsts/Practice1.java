package tsts;
import java.io.IOException;

public class Practice1 {

	public static void main(String[] args) throws IOException {//(0��C �� 9/5) + 32 = 32��F
		// TODO Auto-generated method stub
		System.out.print("���� : ");
		int CelsiusT = System.in.read(); //�����µ� �Է�
		System.out.print(CelsiusT);
		double FahrenheitT = (CelsiusT* (9/5))+32;
		System.out.print("ȭ�� :"+ FahrenheitT+"F");
	}
}
