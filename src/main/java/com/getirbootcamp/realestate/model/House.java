package com.getirbootcamp.realestate.model;

public abstract class  House {

    private final int price;

    private final int squareMeter;

    private final int numberOfRooms;

    private final int numberOfLivingRooms;



    public House(int price, int squareMeter, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getPrice() {
        return price;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }
}
