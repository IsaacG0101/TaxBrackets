package hello;

import java.util.Scanner;

public class Isaac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int income;
		boolean citizen = false;
		boolean senior = false;
		boolean nonprofit = false;
		boolean profit = false;
		String name;
		String old;
		String business;
		String okids;
		String ykids;
		int amount;
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Hello, its that time of the month...Pay Day!!!!");
		System.out.println("What's your name");
		name = kb.next();
		System.out.println("Hello " + name);
		System.out.println("what is your income");
		income = kb.nextInt();
		System.out.println(name +" " + income);
		System.out.println("Are you a senior yes or no");
		old = kb.next();
		
		if (old.equals("yes")) {
			senior =true;
		} else {
			citizen = true;
		}
		
		System.out.println("do you work for a non-profit organization yes or no");
		business = kb.next();
		
		if (business.equals("yes")) {
			nonprofit = true;
		} else {
			profit = true;
		}
		
		System.out.println("do you have any kids under the age of 13 yes or no");
		
		ykids = kb.next();
		
		System.out.println("do you have any kids above the age of 13 yes or no");
		
		okids = kb.next();
		
		if (ykids.equals("yes") && citizen) {
			System.out.println("how many kids under 13 do you have");
			amount =kb.nextInt();
			amount *= 5000;
			income -= amount;
			System.out.println("after deductions your income is" + ""+ income);
		}
		
		if (okids.equals("yes")&& citizen) {
			System.out.println("how many kids older than 13 do you have");
			amount =kb.nextInt();
			amount *= 65000;
			income -= amount;
			System.out.println("after deductions your income is" + ""+ income);
		}
		
		if (ykids.equals("yes") && senior) {
			System.out.println("how many kids under 13 do you have");
			amount =kb.nextInt();
			amount *= 6500;
			income -= amount;
			System.out.println("after deductions your income is" + ""+ income);
		}
		
		if (okids.equals("yes") && senior) {
			System.out.println("how many kids older than 13 do you have");
			amount =kb.nextInt();
			amount *= 8000;
			income -= amount;
			System.out.println("after deductions your income is" + ""+ income);
		}
		
		
		if (income <= 11500) {
			System.out.println("NO Tax");
		}
		
		if (income >= 11501 && income <= 36000 && nonprofit) {
			System.out.println("You will be taxed 8.75%");
			income *= .875;
			System.out.println(income);
		}
		if (income >= 11501 && income <= 36000 && profit) {
			System.out.println("You will be taxed 11.5%");
			income *= .115;
			System.out.println(income);
		}
		
		if (income >= 36001 && income <= 82500) {
			System.out.println("you will be taxed 22.9%");
			income *= .229;
			System.out.println(income);
		}
		
		if (income >= 82501) {
			System.out.println("you will be taxed 46.9%");
			income *= .469;
			System.out.println(income);
		}
	}

	

}
