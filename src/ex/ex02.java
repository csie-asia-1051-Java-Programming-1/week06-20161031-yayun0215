package ex;
import java.util.Scanner;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021062 鄭雅韵
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入兩個整數");
		int m=scn.nextInt();
		int n=scn.nextInt();
		int a=m-n;
		System.out.println(c(m)/(c(n)*c(a)));

	}
	public static int c(int d){
		int sum=1;
		for(int i=1;i<=d;i++){
			sum=sum*i;
		}
		return sum;
		
		
	}
	
 
}
