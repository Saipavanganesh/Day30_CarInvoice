package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInvoiceTest {
    CarInvoice carInvoice = new CarInvoice();

    @Test
    public void fareOneRide(){
        int distance = 5;
        int timeInMin = 13;
        int totalFare = carInvoice.calculateFare(distance, timeInMin);
        Assertions.assertEquals(68, totalFare);
    }
}