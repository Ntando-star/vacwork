package com.psybergate.vacwork_202107;

import java.util.ArrayList;
import java.util.List;

public class DataHandler {
  public static List<Band> getBands() {
    List<Band> bands = new ArrayList<>();
    bands.add(new Band(0.0, 216200.0, 0.18)); // 150k 0
    bands.add(new Band(216201.0, 337800.0, 0.26)); // 228k // 300k 1
    bands.add(new Band(337801.0, 467500.0, 0.31)); // 2
    bands.add(new Band(467501.0, 613600.0, 0.36));
    bands.add(new Band(613601.0, 782200.0, 0.39));
    bands.add(new Band(782201.0, 1665600.0, 0.41));
    bands.add(new Band(1665601.0, 1_000_000_000.0, 0.45));
    return bands;
  }
}
