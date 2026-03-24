package com.thinkworks.hotelbookingsystem.dto;

public class Guest {
    private int guestId;
    private String guestName;
    private long contactnumber;
    private Room[] rooms;
    private int guestAge;


    public Guest(int guestId, String guestName, long contactnumber, Room[] rooms,int guestAge) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.contactnumber = contactnumber;
        this.rooms=rooms;
        this.guestAge=guestAge;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public long getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(long contactnumber) {
        this.contactnumber = contactnumber;
    }
}
