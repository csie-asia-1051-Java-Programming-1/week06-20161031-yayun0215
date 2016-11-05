package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println(fun(scn.nextInt(),scn.nextInt()));

	}

	public static float fun(float nextInt, int nextInt2) {

		float a=0;
		switch(nextInt2){
		case 1:
			a = (float) ((nextInt - 170) * 0.6 + 62);
			break;
		case 2:
			a = (float) ((nextInt - 158) * 0.5 + 52);
			break;

		}
		
		return a;
	}

}
