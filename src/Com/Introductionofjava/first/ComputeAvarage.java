package Com.Introductionofjava.first;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputeAvarage {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		int noOfVariable;
		ArrayList<Integer> nums= new ArrayList<Integer>();
		System.out.println("Please No of veriable ");
		noOfVariable=sc.nextInt();
	    for(int i=0;i<=noOfVariable;i++)
	    {
		    System.out.println("Enter the Number");
	    	nums.add(sc.nextInt());
	    }
	    float sum=0;
	    for(int num:nums) {
	    	sum+=num;
	    }
	    float average =(sum/nums.size());
	    System.out.println("Avarge is "+average);
	}

}
