import com.psybergate.vacwork_202107.Income;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class income {

  @Test
  public void testInterest(){
    Income income = new Income();
    income.getIncome(500000,25000,23001,800000);
    assertEquals(1,income.interest);

    income.getIncome(500000,25000,23000,800000);
    assertEquals(0,income.interest);

    income.getIncome(500000,25000,20000,800000);
    assertEquals(0,income.interest);
  }

  @Test
  public void testGains(){

  }

  @Test
  public void testIncome(){

  }
}
