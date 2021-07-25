package com.psybergate.vacwork_202107;

import com.psybergate.vacwork_202107.Income;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class income {
// get some test cases going (test 2 values in each tax bracket --> regression testing ? not sure or use edge plus middle cases)
@Test
public void testInterestAboveBoundary(){
  Income income = new Income();
  double actualValue = income.getIncome(500000,25000,23801,800000);
  assertEquals(1.0,actualValue);
}

  @Test
  public void testInterestOnBoundary() {
    Income income = new Income();
    income.getIncome(500000,25000,23800,800000);
    assertEquals(0,0);
  }

  @Test
  public void testInterestBelowBoundary() {
    Income income = new Income();
    income.getIncome(500000,25000,20000,800000);
    assertEquals(0,0);
  }

  @Test
  public void testGainsAboveBoundary() {
    Income income = new Income();
    income.getIncome(500000, 25000, 23800, 800000);
    assertEquals(304000, income.gains);
  }

  @Test
  public void testGainsOnBoundary() {
    Income income = new Income();
    income.getIncome(500000, 25000, 23800, 40001);
    assertEquals(0, income.gains);
  }
  @Test
  public void testGainsBelowBoundary(){
    Income income = new Income();
    income.getIncome(500000,25000,23800,40000);
    assertEquals(0,income.gains);
  }

  @Test
  public void testIncome() {
    Income income = new Income();
    income.getIncome(500000, 25000, 45000, 800000);
    assertEquals(850200, 0);
  }
  @Test
  public void testIncomeOnZero(){
    Income income = new Income();
    income.getIncome(0,0,0,0);
    assertEquals(0,0);
  }
}
