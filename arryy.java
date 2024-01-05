package MyPackage;//using scanner +ARRY

import java.util.Scanner;

public class arryy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++) {
        	a[i]=s.nextInt();
        	
        }
	}

}
