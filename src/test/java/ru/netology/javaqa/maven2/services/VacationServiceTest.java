package ru.netology.javaqa.maven2.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/test.csv")
    public void testCalculateWithParams(int income, int expenses, int threshold, int expected) {
        VacationService service = new VacationService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVacation() {
        VacationService service = new VacationService();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testVacation2() {
        VacationService service = new VacationService();
        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }


}



