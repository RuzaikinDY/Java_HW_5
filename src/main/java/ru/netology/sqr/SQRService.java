package ru.netology.sqr;

public class SQRService {

    public int squareNumber(int Minvalue, int Maxvalue) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= Minvalue) {
                if (x <= Maxvalue) {
                    count++;
                }
            }

        }
        return count;
    }

}
