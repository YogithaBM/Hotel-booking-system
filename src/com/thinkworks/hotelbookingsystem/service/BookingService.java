package com.thinkworks.hotelbookingsystem.service;

import com.thinkworks.hotelbookingsystem.dto.Booking;
import com.thinkworks.hotelbookingsystem.dto.Guest;
import com.thinkworks.hotelbookingsystem.dto.Room;

public class BookingService {
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
            System.out.println("Contact : " + guest.getContactNO());
        } else {
            System.out.println("Enter a proper value");
        }
    }

    public void printBookingDetails(Booking booking) {
        if (booking != null) {
            System.out.println("ID : " + booking.getBookingId());
            System.out.println("Guests : " + booking.getGuest().getGuestName());
            System.out.println("Nights : " + booking.getNight());
            System.out.println("Rooms : ");
            for (Room room : booking.getRooms()) {
                System.out.println("  Room Types : "+room.getRoomType());
            }
            System.out.println("Total Price : " + booking.totalBookingPrice());
        }
        else {
            System.out.println("Enter a proper value");
        }
    }
//    public void availableRoom(Room[] rooms){
//        for (Room room:rooms){
//            if(room.isAvailable()==true){
//                System.out.println(room.getRoomId()+" : is available");
//            }
//            else{
//                System.out.println(room.getRoomId()+" : is not available");
//            }
//        }


}
