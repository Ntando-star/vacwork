package com.psybergate.vacwork_202107;

import java.util.Scanner;

public class Expenses {
    public static double getExpense(double salary, double bonus) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Retirement Funding : ");
    double fund = scan.nextDouble();
    //System.out.println("Enter Travel allowance : ");
    double travel = 80000; // this is the max I think not the value always present
    fund = (salary+bonus) * 0.275;
    double expense = fund + travel;
    return expense;
  }

}
