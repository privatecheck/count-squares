package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCount() {
        SQRService service = new SQRService();

        int actual = service.countSqr(500, 600);

        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotCount() {
        SQRService service = new SQRService();

        int actual = service.countSqr(0, 99);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void negativeValues() {
        SQRService service = new SQRService();

        int actual = service.countSqr(- 100, 0);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}