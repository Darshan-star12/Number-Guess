package com.Numberguess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory e=	Persistence.createEntityManagerFactory("dev");
		EntityManager p=e.createEntityManager();
		EntityTransaction t=p.getTransaction();
		Scanner sc =new Scanner(System.in);
		boolean flag=true;
		
		
		while(flag) {
			System.out.println("Play the Game");
			System.out.println("Check The Result");
			System.out.println("Delete The History");
			System.out.println("Exit");
			
			switch (sc.nextInt()) {
			case 1:{

				System.out.println("enter the name");
				String pname=sc.next();
				System.out.println("enter the contactnumber");
				long pnumber=sc.nextLong();
				System.out.println("enetr the age");
				int page=sc.nextInt();
				System.out.println("enetr the amount");
				double investAmount=sc.nextDouble();
				
				int[] systemnum=new int[3];
				int[] userEnetrNumber=new int[3];
				double amountperMatch=investAmount/3;
				
				double totalEarnedAmount=0;
				
				Random rd=new Random();
				for (int i = 0; i < systemnum.length; i++) {
					systemnum[i]=rd.nextInt(10);
				}
				System.out.println("System Generated Numbers \n"+Arrays.toString(systemnum));
				
				System.out.println("All The Best");
				
				for (int i = 0; i < systemnum.length; i++) {
					System.out.println("Eneter the "+(i+1)+"number");
					userEnetrNumber[i]=sc.nextInt();
					
					if(userEnetrNumber[i]==systemnum[i]) {
					totalEarnedAmount+=amountperMatch;
					System.out.println("Good Guess");
					}
					else{
						System.out.println("oops wrong guess");
					}
					 
						
					
				}
					Playerdetails pd=new Playerdetails();
					
					
					pd.setName(pname);
					pd.setContact(pnumber);
					pd.setAge(page);
					pd.setAmount(investAmount);
					
					
					pd.setTotalAmountEarnedAfterTheMatch(totalEarnedAmount);
					pd.setSystemGeneratedNumber(Arrays.toString(systemnum));
					pd.setUserEnetredNumber(Arrays.toString(userEnetrNumber));
					
					
					t.begin();
					p.merge(pd);
					t.commit();
					
					System.out.println("System generated number:"+Arrays.toString(systemnum));
					System.out.println("You enetered number"+Arrays.toString(userEnetrNumber));
					System.out.println("Toatal amount earned"+totalEarnedAmount);
					

				}

			
				
				
				break;
				
			case 2:{
				System.out.println("Enter ID");
				Playerdetails p1= p.find(Playerdetails.class, sc.nextInt());

				System.out.println(p1);
			}
			break;
			
			case 3:{
				Playerdetails p1=p.find(Playerdetails.class, sc.nextInt());
				if(p1!=null) {
				t.begin();
				p.remove(p1);
				t.commit();
				System.out.println("Object deleted successfully");
				}

			}
				break;
				
			case 4:{
				System.out.println("Thank You Come Again");
				flag=false;
			}
			break;

			default:
				System.out.println("Invalid Choice");
				
				break;
			}
		}

	}

}
