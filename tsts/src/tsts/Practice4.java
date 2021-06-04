package tsts;

import java.io.IOException;

public class Practice4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter line number");
		int end =System.in.read();
		System.out.print(end);
		int add =1;
		for(int i=1; i<=end; i++) {
			
			for(int j=1;j<=add;j++){
				System.out.print("*");
			}
			add++;
			System.out.print("\n");
		}

	}

}
