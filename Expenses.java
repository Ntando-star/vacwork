package com.psybergate.vacwork_202107;

public class Expenses {
    public static double getExpense(double salary, double bonus) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Retirement Funding : ");
    double fund = scan.nextDouble();
    //System.out.println("Enter Travel allowance : ");
    double travel = 80000;
    fund = (salary+bonus) * 0.275;
    double expense = fund + travel;
    return expense;
  }

}
