package com.hotels.storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.hotels.domain.Hotel;

/**
 * Created by lfilipponi on 11/20/16.
 */
@Component
public final class DataStorage {

    private ArrayList<Hotel> hotelList;

    private Map<Long,Hotel> hotelDetailsMap;


    public DataStorage(){

        this.hotelList = createList();
        this.hotelDetailsMap = createMap();

    }

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public void setHotelList(ArrayList<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    public Map<Long, Hotel> getHotelDetailsMap() {
        return hotelDetailsMap;
    }

    public void setHotelDetailsMap(Map<Long, Hotel> hotelDetailsMap) {
        this.hotelDetailsMap = hotelDetailsMap;
    }

    public Hotel getHotelDetail(Long id){

        return hotelDetailsMap.get(id);

    }

    public ArrayList<Hotel>  createList(){
        ArrayList<Hotel> hotels = new ArrayList<>();

        Hotel hotel = new Hotel.Builder(1l)
            .withAddress("via tibrtina 125, Roma")
            .withStar(5).build();

        Hotel hotel2 = new Hotel.Builder(2l)
            .withAddress("via gianicolense 123, Roma")
            .withStar(5).build();


        Hotel hotel3 = new Hotel.Builder(3l)
            .withAddress("via le mani dalle tasche 56, Roma")
            .withStar(3).build();

        Hotel hotel4 = new Hotel.Builder(4l)
            .withAddress("via ostiense 14, Roma")
            .withStar(4).build();

        Hotel hotel5 = new Hotel.Builder(5l)
            .withAddress("Piazza la bomba e scappa, 145 Roma")
            .withStar(5).build();

        hotels.add(hotel);
        hotels.add(hotel2);
        hotels.add(hotel3);
        hotels.add(hotel4);
        hotels.add(hotel5);

        return hotels;


    }


    public Map<Long,Hotel> createMap(){

        Map<Long, Hotel> hotelHashMap = new HashMap<Long, Hotel>(){{

            put(1l,new Hotel.Builder(1l)
                .withAddress("1234 street")
                .withRate(5)
                .withDescription("very cool hotel")
                .withStar(5).build());


        }};

        return hotelHashMap;

    }






}
