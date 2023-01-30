package com.bridgelabz;

public class RideRepository {
    private int userId;
    private int totalRides;
    private int totalFare;
    private int averageFare;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getTotalRides() {
        return totalRides;
    }

    public void setTotalRides(int totalRides) {
        this.totalRides = totalRides;
    }

    public int getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(int totalFare) {
        this.totalFare = totalFare;
    }

    public int getAverageFare() {
        return averageFare;
    }

    public void setAverageFare(int averageFare) {
        this.averageFare = averageFare;
    }
    public RideRepository(){

    }

    public RideRepository(int userId, int totalRides, int totalFare, int averageFare) {
        this.userId = userId;
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare = averageFare;
    }

    public String toString() {
        String display = "User id : " + userId + "\nTotal rides : " + totalRides
                + "\nTotal Fare for this ride : " + totalFare + "\nAverage Fare for this ride : " + averageFare + "\n";
        return display;
    }
}
