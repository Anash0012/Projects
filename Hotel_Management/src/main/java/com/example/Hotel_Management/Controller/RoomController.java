package com.example.Hotel_Management.Controller;

import com.example.Hotel_Management.Model.Room;
import com.example.Hotel_Management.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom){
        return roomService.addRoom(newRoom);
    }

    @PostMapping("rooms")
    public String addRooms(@RequestBody List<Room> newRooms){
        return roomService.addRooms(newRooms);
    }
    @GetMapping("rooms")
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }

    @GetMapping("room/id/{id}")
    public Room getRoomsById(@PathVariable Integer id){
        return roomService.getRoomsById(id);
    }

    @DeleteMapping("room/id")
    public String removeRoomsByIds(@RequestBody List<Integer> ids){
        return roomService.removeRoomsByIds(ids);
    }

    @GetMapping("rooms/price/{price}")
    public List<Room> getRoomByPrice(@PathVariable double price){
        return roomService.getRoomByPrice(price);
    }

    @GetMapping("rooms/available/and/price/{price}")
    public List<Room> getRoomsAvailableAndBelowPrice(@PathVariable double price){
        return roomService.getRoomsAvailableAndBelowPrice(price);
    }

    @GetMapping("rooms/available/or/price/{price}")
    public List<Room> getRoomsAvailableOrBelowPrice(@PathVariable double price){
        return roomService.getRoomsAvailableOrBelowPrice(price);
    }

    @GetMapping("rooms/AC/or/available")
     public List<Room> getAvailableRoomsOrAcSortedByPrice(){
        return roomService.getAvailableRoomsOrAcSortedByPrice();
    }
}
