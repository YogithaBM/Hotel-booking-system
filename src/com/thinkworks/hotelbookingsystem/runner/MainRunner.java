package com.thinkworks.hotelbookingsystem.runner;

import com.thinkworks.hotelbookingsystem.dto.Guest;
import com.thinkworks.hotelbookingsystem.dto.Room;
import com.thinkworks.hotelbookingsystem.enums.RoomType;
import com.thinkworks.hotelbookingsystem.service.BookingService;

public class MainRunner {
    public static void main(String[] args) {

        Room room1=new Room(4543, RoomType.DOUBLE,7956.8D);
        Room room2=new Room(7835,RoomType.SINGLE,6437.65D);
        Room room3=new Room(5633,RoomType.SUITE,9753.983D);
        Room[] rooms={room1,room2,room3};

        Guest guest=new Guest(5433,"Hitha",893624434L,rooms,65);

        BookingService bookingService=new BookingService();

        bookingService.printRoomDetails(room1);
        System.out.println("  ");

        bookingService.printGuestDetails(guest);
        System.out.println("  ");

        bookingService.printBookingDetails(guest);


    }
}
