package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void ShouldFindMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void ShouldFindMax2() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {15, 5, 8, 3, 3, 6, 11, 1, 19};
    long expected = 19;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
}