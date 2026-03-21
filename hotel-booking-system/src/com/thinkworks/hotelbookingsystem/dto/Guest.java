package com.thinkworks.hotelbookingsystem.dto;

public class Guest {
    private int guestId;
    private String guestName;
    private long contactNO;

    public Guest(int guestId, String guestName, long contactNO) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.contactNO = contactNO;
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

    public long getContactNO() {
        return contactNO;
    }

    public void setContactNO(long contactNO) {
        this.contactNO = contactNO;
    }
}
