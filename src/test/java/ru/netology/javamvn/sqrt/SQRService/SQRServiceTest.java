package ru.netology.javamvn.sqrt.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    void testDefaultLowerAndUpperBounds() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 9801;
        int expected = 90;
        int actual = service.calcSqrService(min, max);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testLowerMinLimit() {
        SQRService service = new SQRService();
        int min = 0;
        int max = 100;
        int expected = 1;
        int actual = service.calcSqrService(min, max);
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testUpperMaxLimit() {
        SQRService service = new SQRService();
        int min = 9802;
        int max = 10_000_000;
        int expected = 0;
        int actual = service.calcSqrService(min, max);
        Assertions.assertEquals(actual, expected);
    }
}