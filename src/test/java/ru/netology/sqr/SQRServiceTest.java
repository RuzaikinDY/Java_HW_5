package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {


    @ParameterizedTest
//    @CsvSource({
//            "10,99,0",
//            "100,9801,90",
//            "9802,15000,0"
//    })
    @CsvFileSource(resources = {"/TestData.csv"})

    public void test(int Minvalue, int Maxvalue, int expected) {
        SQRService service = new SQRService();
        int result = service.squareNumber(Minvalue, Maxvalue);

        Assertions.assertEquals(expected, result);
    }
}
