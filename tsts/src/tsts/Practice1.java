package tsts;
import java.io.IOException;

public class Practice1 {

	public static void main(String[] args) throws IOException {//(0¡ÆC ¡¿ 9/5) + 32 = 32¡ÆF
		// TODO Auto-generated method stub
		System.out.print("¼·¾¾ : ");
		int CelsiusT = System.in.read(); //¼·¾¾¿Âµµ ÀÔ·Â
		System.out.print(CelsiusT);
		double FahrenheitT = (CelsiusT* (9/5))+32;
		System.out.print("È­¾¾ :"+ FahrenheitT+"F");
	}
}
