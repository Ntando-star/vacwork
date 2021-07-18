package com.psybergate.vacwork_202107;

import java.util.Scanner;

public class Expenses {
  public static double calculateExpense(double salary, double bonus) {
    // single responsibilities
    //
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Retirement Funding : ");
    double funds = scan.nextDouble();
    System.out.println("Enter Travel allowance : ");
    double travel = scan.nextDouble();
    if (travel > 80000) {
      travel = 80000;
    } else {
      travel = 0;
    }
    double fund = (salary + bonus) * 0.275;
    if (fund > 350000) {
      fund = 350000;
    } else if (funds < fund) {
      fund = funds;
    }
    double expense = fund + travel;
    return expense;
  }

}
