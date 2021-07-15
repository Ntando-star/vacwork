package com.psybergate.vacwork_202107;

import java.util.Scanner;

public class Tax {

  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("Enter salary :");
    double salary = scan.nextDouble();
    System.out.println("Enter bonus :");
    double bonus = scan.nextDouble();
    System.out.println("Enter interest :");
    double interest = scan.nextDouble();
    System.out.println("Enter dividends :");
    double div = scan.nextDouble();
    System.out.println("Enter capital gains :");
    double gains = scan.nextDouble();

    double taxableIncome = ((Income.getIncome(salary,bonus,interest,gains))-(Expenses.getExpense(salary,bonus)));
    Calculator.calculate(taxableIncome);
    System.out.println("Nett Taxable Income : R "+ taxableIncome);

  }

}
