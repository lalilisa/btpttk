package Composite;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private List<Room> rooms=new ArrayList<>();
    public  Hotel(){
        Room room1=new Room(1223);
        Room room2=new Room(1232);
        rooms.add(room1);
        rooms.add(room2);
    }
    public Hotel(String name,List<Room> rooms){
        this.name=name;
        this.rooms=rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
    public  void listRooms(){
        if (this.rooms==null)
            System.out.println("Hotel is not exist");
        else {
            for (Room room : this.rooms) {
                System.out.println(room);
            }
        }
    }
    public  void deleteHotel(){

       this.rooms=null;

    }
}

