import com.psybergate.vacwork_202107.Income;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class income {

  @Test
  public void testInterest(){
    Income income = new Income();
    income.getIncome(500000,25000,23801,800000);
    assertEquals(1,income.interest);

    income.getIncome(500000,25000,23800,800000);
    assertEquals(0,income.interest);

    income.getIncome(500000,25000,20000,800000);
    assertEquals(0,income.interest);
  }

  @Test
  public void testGains(){
    Income income = new Income();
    income.getIncome(500000,25000,23800,800000);
    assertEquals(304000,income.gains);

    income.getIncome(500000,25000,23800,40001);
    assertEquals(0,income.gains);

    income.getIncome(500000,25000,23800,40002);
    assertEquals(1,income.gains);
  }

  @Test
  public void testIncome(){
    Income income = new Income();
    income.getIncome(500000,25000,45000,800000);
    assertEquals(850200,income.gains);

    income.getIncome(500000,0,0,0);
    assertEquals(500000,income.gains);
  }
}
