package com.DcBankApplication.controller;
import java.util.*;
import com.Dc.BankApplication.Service.BankService1;
public class BankController  {
	public static void main(String[] args) {
		
		BankService1 Bs = new BankService1();
		Scanner sc = new Scanner(System.in);
		
		boolean b = true;
while(b) {
	
	System.out.println("******* Welcome to Bank *********");
	System.out.println("Press 1 for Account creation");
	System.out.println("Press 2 for view Account");
	System.out.println("Press 3 for withdraw money");
	System.out.println("Press 4  for deposit money");
	System.out.println("Press 5 for update Account");
	System.out.println("Press 6 for EXIT");
			int ch = sc.nextInt();
		switch (ch) {

		case 1:
			Bs.createAcc();
			break;
		case 2:
			Bs.viewAcc();
			break;
		case 3:
			Bs.withdrawMoney();
			break;
		case 4:
			Bs.depositMoney();
			break;
		case 5:
		    Bs.updateAcc();
			break;
		case 6:
			b =false;
			break;

		default:
			System.out.println("Invailid Choice");
		}
		
}
        System.out.println("Thank you For using Bank Service*****");
        sc.close();
	}

}
