package com.thinkworks.hotelbookingsystem.service;

import com.thinkworks.hotelbookingsystem.dto.Guest;
import com.thinkworks.hotelbookingsystem.dto.Room;

public class BookingService {
    public static final String HOTEL_NAME="REST IN PEACE";
    public void printRoomDetails(Room room) {
        if (room != null) {
            System.out.println("ID : " + room.getRoomId());
            System.out.println("Room Type : " + room.getRoomType());
            System.out.println("Price : " + room.getPrice());
            System.out.println("Current Status: " + room.isAvailable());
        } else {
            System.out.println("Enter a proper value");
        }
    }


    public void printGuestDetails(Guest guest) {
        if (guest != null) {
            System.out.println("ID : " + guest.getGuestId());
            System.out.println("Name : " + guest.getGuestName());
            System.out.println("Contact : " + guest.getContactnumber());
            System.out.println("Rooms : ");
            for(Room room: guest.getRooms()){
                System.out.println(room.getRoomType());
            }
        } else {
            System.out.println("Enter a proper value");
        }
    }

    public void printBookingDetails(Guest guest){
        for(Room room:guest.getRooms()){
            if(room.isAvailable()){
                room.setAvailable(false);
                System.out.println("Room "+room.getRoomType()+" is booked");

            }
            else System.out.println("Room "+room.getRoomType()+" is not available");
        }
    }


}
