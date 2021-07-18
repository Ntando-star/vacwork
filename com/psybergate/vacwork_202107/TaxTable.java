package com.psybergate.vacwork_202107;

import java.util.ArrayList;
import java.util.List;

public class TaxTable {
  public static List<TaxBracket> getTaxBrackets() {
    List<TaxBracket> taxBrackets = new ArrayList<>();
    taxBrackets.add(new TaxBracket(0.0, 216200.0, 0.18)); // 150k 0
    taxBrackets.add(new TaxBracket(216201.0, 337800.0, 0.26)); // 228k // 300k 1
    taxBrackets.add(new TaxBracket(337801.0, 467500.0, 0.31)); // 2
    taxBrackets.add(new TaxBracket(467501.0, 613600.0, 0.36));
    taxBrackets.add(new TaxBracket(613601.0, 782200.0, 0.39));
    taxBrackets.add(new TaxBracket(782201.0, 1665600.0, 0.41));
    taxBrackets.add(new TaxBracket(1665601.0, 1_000_000_000.0, 0.45));
    return taxBrackets;
  }
}
