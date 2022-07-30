package ru.netology.javamvn.sqrt.SQRService;

public class SQRService {
    public int calcSqrService(int min, int max) {
        int iteration = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                iteration = iteration+1;
            }
        }
        return iteration;
    }
}
