package com.example.myapplication;

public class Reservation {
    private String date;
    private String partySize;
    private String restaurantName;
    private String status;
    private String time;
    private String email;

    public Reservation() {}

    public Reservation(String date, String partySize, String restaurantName, String status, String time, String email) {
        this.date = date;
        this.partySize = partySize;
        this.restaurantName = restaurantName;
        this.status = status;
        this.time = time;
        this.email = email;
    }

    // Getters
    public String getDate() {
        return date;
    }

    public String getPartySize() {
        return partySize;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getStatus() {
        return status;
    }

    public String getTime() {
        return time;
    }

    public String getEmail() {
        return email;
    }
}