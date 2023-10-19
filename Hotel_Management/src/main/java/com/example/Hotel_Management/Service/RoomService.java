package com.example.Hotel_Management.Service;

import com.example.Hotel_Management.Model.Room;
import com.example.Hotel_Management.Model.Type;
import com.example.Hotel_Management.Repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {

    @Autowired
    RoomRepo roomRepo;

    public String addRoom(Room newRoom) {
        roomRepo.save(newRoom);
        return "Room Added Succesfully";
    }

    public List<Room> getAllRooms() {
        return (List<Room>) roomRepo.findAll();
    }

    public String addRooms(List<Room> newRooms) {
        roomRepo.saveAll(newRooms);
        return newRooms.size()+" rooms were added..";
    }


    public Room getRoomsById(Integer id) {
        return roomRepo.findById(id).get();
    }

    public String removeRoomsByIds(List<Integer> ids) {
        roomRepo.deleteAllById(ids);
        return " rooms removed successfully..";
    }

    public List<Room> getRoomByPrice(double price) {
        return roomRepo.findByRoomPrice(price);
    }


    public List<Room> getRoomsAvailableAndBelowPrice(double price) {
        return roomRepo.findByRoomPriceLessThanEqualAndRoomAvailable(price,true);
    }

    public List<Room> getRoomsAvailableOrBelowPrice(double price) {
        return roomRepo.findByRoomPriceLessThanEqualOrRoomAvailable(price,true);
    }

    public List<Room> getAvailableRoomsOrAcSortedByPrice() {
        return roomRepo.findByRoomTypeOrRoomAvailableOrderByRoomPrice(Type.AC,true);
    }
}
