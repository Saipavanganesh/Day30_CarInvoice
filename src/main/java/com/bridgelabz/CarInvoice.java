package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarInvoice {
    RideRepository rideRepository;
    ArrayList<RideRepository> rideRepositoriesList = new ArrayList<>();
    final static int farePerKm = 10;
    final static int minFare = 5;
    final static int farePerKmPremium = 15;
    final static int farePerMinutePremium = 2;

    final static int minFarePremium = 20;
    public int calculateFare(int distance, int timeInMin){
        int totalFare = (distance * farePerKm) + (timeInMin) + minFare;
        return totalFare;
    }
    public int calculatePremiumFare(int distance, int timeInMin){
        int totalFare = (distance * farePerKmPremium) + (timeInMin * farePerMinutePremium) + minFarePremium;
        return totalFare;
    }
    public void getUserDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user id to get details");
        int userId = sc.nextInt();
        List<RideRepository> userData = rideRepositoriesList.stream().filter(checkID -> checkID.getUserId() == userId).collect(Collectors.toList());
        userData.forEach(checkId -> System.out.println(checkId));
    }
    public List enhancedInvoice(int userID,List allRides){
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
        rideRepository = new RideRepository(userID, totalNo_ofRides, totalFare, averageFarePerRide);
        rideRepositoriesList.add(rideRepository);
        return inv;
    }
}
