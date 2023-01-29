package com.bridgelabz;

public class CarInvoice {
    final static int farePerKm = 10;
    final static int minFare = 5;
    public int calculateFare(int distance, int timeInMin){
        int totalFare = (distance * farePerKm) + (timeInMin) + minFare;
        return totalFare;
    }
}
