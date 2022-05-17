package ru.netology.sqr;

public class SQRService {

    public int squareNumber(int minvalue, int maxvalue) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= minvalue) {
                if (x <= maxvalue) {
                    count++;
                }
            }

        }
        return count;
    }

}
