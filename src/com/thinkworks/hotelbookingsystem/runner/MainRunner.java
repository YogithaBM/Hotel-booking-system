package com.thinkworks.hotelbookingsystem.runner;

import com.thinkworks.hotelbookingsystem.dto.Booking;
import com.thinkworks.hotelbookingsystem.dto.Guest;
import com.thinkworks.hotelbookingsystem.dto.Room;
import com.thinkworks.hotelbookingsystem.enums.RoomType;
import com.thinkworks.hotelbookingsystem.service.BookingService;

public class MainRunner {
    public static void main(String[] args) {

        Room room1=new Room(4543, RoomType.DOUBLE,7956.8D,true);
        Room room2=new Room(7835,RoomType.SINGLE,6437.65D,false);
        Room room3=new Room(5633,RoomType.SUITE,9753.983D,true);
        Room[] rooms={room1,room2,room3};

        Guest guest=new Guest(5433,"Hitha",893624434L);

        Booking booking=new Booking(8724,guest,rooms,3);

        BookingService bookingService=new BookingService();

        bookingService.printRoomDetails(room1);
        System.out.println("  ");

        bookingService.printGuestDetails(guest);
        System.out.println("  ");

        bookingService.printBookingDetails(booking);

        //bookingService.availableRoom(rooms);

    }
}
