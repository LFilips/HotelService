package com.hotels.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotels.domain.Hotel;
import com.hotels.domain.HotelList;
import com.hotels.storage.DataStorage;

/**
 * Created by lfilipponi on 11/20/16.
 */
@Service
public class DataProvider {


    @Autowired
    DataStorage dataStorage;

    /**
     *
     * gets the hotel lists near a citym in this case there are just the id and the starRating
     *
     * @return
     */
    public HotelList getHotelList() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new HotelList(dataStorage.getHotelList());

    }


    public Hotel getHotelDetail(long id) {


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dataStorage.getHotelDetail(id);

    }


}
