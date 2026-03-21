package com.thinkworks.hotelbookingsystem.dto;

public class Booking {
    private int bookingId;
    private Guest guest;
    private Room[] rooms;
    private int night;

    public Booking(int bookingId, Guest guest, Room[] rooms, int night) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.rooms = rooms;
        this.night = night;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getNight() {
        return night;
    }

    public void setNight(int night) {
        this.night = night;
    }

    public double totalBookingPrice(){
        double totalBookingPrice=0;
        for(Room room:rooms){
            if(room.isAvailable()==true) {
                totalBookingPrice += (room.getPrice() * night);
            }
            else{
                System.out.println(room.getRoomId()+" : choose another room as this room is not available");
            }

        }
        return totalBookingPrice;
    }
}
