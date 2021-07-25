package com.psybergate.vacwork_202107.userInterface;

import java.util.Scanner;

public class UserInterface {
  Scanner scan = new Scanner(System.in);
  public String[] getUserRegistrationInfo(){
    String[] userInfo = new String[4];

    return userInfo;
  }

  public double[] getUserIncomes() {
    double[] userIncomes = new double[6];
    // 0 --> salary, 1 --> bonus, 2 --> interest, 3 --> dividends, 4 --> capital gains, 5 --> medical aid credits
    System.out.println("Please Enter Annual CTC salary :");
    userIncomes[0] = scan.nextDouble();
    System.out.println("Please Enter bonus :");
    userIncomes[1]  = scan.nextDouble();
    System.out.println("Enter interest :");
    userIncomes[2]  = scan.nextDouble();
    System.out.println("Enter dividends :");
    userIncomes[3]  = scan.nextDouble();
    System.out.println("Enter capital gains :");
    userIncomes[4]  = scan.nextDouble();
    System.out.println("Enter medical aid credits :");
    userIncomes[5]  = scan.nextDouble();
    return userIncomes;
  }

  public double[] getUserExpenses() {
    double[] userExpenses = new double[5];
    return userExpenses;
  }
}
