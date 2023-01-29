package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarInvoice {
    final static int farePerKm = 10;
    final static int minFare = 5;
    public int calculateFare(int distance, int timeInMin){
        int totalFare = (distance * farePerKm) + (timeInMin) + minFare;
        return totalFare;
    }
    public List enhancedInvoice(List allRides){
        int totalFare = 0;
        for(int i=0 ; i < allRides.size(); i++){
            totalFare = totalFare + (int) allRides.get(i) ;
        }
        int totalNo_ofRides = allRides.size();
        int averageFarePerRide = totalFare/totalNo_ofRides;
        List<Integer> inv = new ArrayList<>();
        inv.add(totalNo_ofRides);
        inv.add(totalFare);
        inv.add(averageFarePerRide);
        return inv;
    }
}
