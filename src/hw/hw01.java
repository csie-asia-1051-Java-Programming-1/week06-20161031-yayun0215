package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println(fun(scn.nextInt(), scn.nextInt()));

	}

	public static int fun(int v1, int v2) {
		int a=0;
		switch (v2) {
		case 1:
			a = (v1 - 32) * (5 / 9);
			break;
		case 2:
			a = (v1 * 9 / 5 + 32);
			break;
		}
		return a;

	}

}