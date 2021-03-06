package com.psybergate.vacwork_202107;

import java.util.Scanner;

public class Tax {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please Enter Annual CTC salary :");
    double salary = scan.nextDouble();
    System.out.println("Please Enter bonus :");
    double bonus = scan.nextDouble();
    System.out.println("Enter interest :");
    double interest = scan.nextDouble();
    System.out.println("Enter dividends :");
    double div = scan.nextDouble();
    System.out.println("Enter capital gains :");
    double gains = scan.nextDouble();

    double taxableIncome = ((Income.getIncome(salary, bonus, interest, gains)) - (Expenses.calculateExpense(salary, bonus)));
    System.out.println("Nett Taxable Income : R " + taxableIncome);
    System.out.println("Nett Tax payable = " + Calculator.calculate(taxableIncome));

  }

}
