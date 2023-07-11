package com.Dc.BankApplication.Service;
import java.util.*;

import com.Dc.BankApplication.Model.Account;

public class BankService1 implements BankService2 {
	Scanner sc = new Scanner(System.in);
	int accNumber;
	String name, Address, Pan_num;
	double balance;
	
	Account BA = new Account();

	@Override
	public void createAcc() {
		// TODO Auto-generated method stub
		System.out.println("******** Welcome To Bank Service *****");
		
		System.out.println("Enter your Account number ");
		accNumber = sc.nextInt();
		BA.setAccNo(accNumber);
		
		System.out.println("Enter your name");
		name = sc.next();
		BA.setAccName(name);
		
		System.out.println("Enter your Address");
		Address = sc.next();
		BA.setAccAddr(Address);
		
		System.out.println("Enter your Pan number");
		sc.nextLine();
		Pan_num = sc.next();
		BA.setAccPan(Pan_num);
		
		System.out.println("Enter deposit Amount");
		balance = sc.nextLong();
		BA.setAccBal(balance);
		
		System.out.println("Your Account Successfully Created .... Your Corrent Balance is: "+balance);
		
	}
 
	@Override
	public void viewAcc() {
		// TODO Auto-generated method stub
		System.out.println(BA.toString());
		System.out.println("Your Account number is: "+ BA.getAccNo());
		System.out.println("Your Name is: "+ BA.getAccName());
		System.out.println("Your Addresss is: "+ BA.getAccAddr());
		System.out.println("Your Pan Number is: "+ BA.getAccPan());
		System.out.println("Your Corrent Balance is: "+ BA.getAccBal());
	}



	@Override
	public void withdrawMoney() {
		
		System.out.println("Enter Account number: ");
		double acc = sc.nextDouble();
		if(acc == BA.getAccNo()) {
			System.out.println("Enter Your withdraw amount");
			double amount = sc.nextLong();
			if(balance >= amount) {
			balance-= amount;
			BA.setAccBal(balance);
				System.out.println("Withdraw Sucsefully..... Your corretnt balance is: "+ balance);
				
			}
			else {
				System.out.println("Insufficiant Balance in Your account *******");
			}
		}
		else {
			System.out.println("Incorrect Account number");
		}
			
		}
		

	@Override
	public void depositMoney() {
		System.out.println("Enter your Account Number");
		double acc = sc.nextDouble();
		if(acc == BA.getAccNo()) {
			System.out.println("Enter your Deposit Amount");
			double amount = sc.nextLong();
				balance += amount;
				BA.setAccBal(balance);
				System.out.println("Deposit Succssefully..... Your corretnt balance is: "+ balance);
			}

	else {
		System.out.println("Incorrect Account Number ");
	}
	}

	@Override
	public void updateAcc() {
		   boolean b= true;
		while(b) {
		System.out.println("1. Update name");
		System.out.println("2. Update Address");
		System.out.println("3. Update Pan Number");
		System.out.println("4. Exit to Home");
		
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Enter New name");
		    sc.nextLine();
		    String name = sc.next();
		    BA.setAccName(name);
		    System.out.println("Your New name Updated****");
		    break;
		
		case 2:
		    System.out.println("Enter New Address");
		    sc.nextLine();
		    String address = sc.next();
		    BA.setAccAddr(address);
		    System.out.println("Your New Address Updated****");
		    break;
		    
		case 3:
		    System.out.println("Enter New Pan Number");
		    sc.nextLine();
		    String Pan = sc.next();
		    BA.setAccPan(Pan);
		    System.out.println("Your New Pan Number Updated****");
		    break;
		case 4:
			b= false;
			break;
			default :
				System.out.println("Invailid choice");
		}
		}
		System.out.println("your details update Successfully*****");
		
	}

	
}
