package com.psybergate.vacwork_202107;

import java.sql.*;
import java.util.Scanner;

public class DatabaseManager {
  private static Connection connection;
  private static Statement statement;

  public static void ConnectToDatabase() {

    try {
      Class.forName("org.postgresql.Driver");
      connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/taxcalculatordb", "postgres", "tebogo");
      //System.out.println("Connected to Database: " + connection.getCatalog());
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
    }

  }

  public static void Insert(double salary, double bonus, double interest, double gains, double credits, double funds,
                            double travel, double taxableIncome, double taxPayable)
      throws SQLException {

    statement = connection.createStatement();
    String sql = "INSERT INTO TAX (SALARY,BONUS,INTEREST,CAPITAL_GAINS,MEDICAL_CREDITS,RETIREMENT_FUND," +
        "TRAVEL_ALLOWANCE,TAXABLE_INCOME,TAX_PAYABLE) "
        + "VALUES (" + salary + "," + bonus + "," + interest + "," + gains + "," + credits + "," + funds + "," + travel + "," + taxableIncome + "," + taxPayable + ");";
    statement.executeUpdate(sql);

  }

  public static void Extract() throws SQLException {

    Scanner scanner = new Scanner(System.in);
    double user_id = scanner.nextInt();

    statement = connection.createStatement();
    ResultSet rs = statement.executeQuery("SELECT * FROM TAX WHERE ID=" + user_id + ";");

    while (rs.next()) {

      int id = rs.getInt("id");
      float salaryColumn = rs.getFloat("salary");
      float bonusColumn = rs.getFloat("bonus");
      float interestColumn = rs.getFloat("interest");
      float gainsColumn = rs.getFloat("capital_gains");
      float creditsColumn = rs.getFloat("medical_credits");
      float fundsColumn = rs.getFloat("retirement_fund");
      float travelColumn = rs.getFloat("travel_allowance");
      float taxableIncomeColumn = rs.getFloat("taxable_income");
      float taxPayableColumn = rs.getFloat("tax_payable");

      System.out.println("Salary = " + salaryColumn);
      System.out.println("Bonus = " + bonusColumn);
      System.out.println("Interest = " + interestColumn);
      System.out.println("Capital Gains = " + gainsColumn);
      System.out.println("Medical Credits = " + creditsColumn);
      System.out.println("Retirement Fund = " + fundsColumn);
      System.out.println("Travel Allowance = " + travelColumn);
      System.out.println("Taxable Income = " + taxableIncomeColumn);
      System.out.println("Tax Payable = " + taxPayableColumn);

    }

    rs.close();
    statement.close();
    connection.close();
  }
}
