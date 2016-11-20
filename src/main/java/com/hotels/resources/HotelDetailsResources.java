package com.hotels.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotels.domain.Hotel;
import com.hotels.service.DataProvider;

/**
 * Created by lfilipponi on 11/20/16.
 */
@Controller
public class HotelDetailsResources {



    @Autowired
    DataProvider dataProvider;

    @RequestMapping(value = "/HotelDetails/{hotelId}", method = RequestMethod.GET)
    @ResponseBody
    public Hotel HotelDetails(@PathVariable long hotelId) {

        return dataProvider.getHotelDetail(hotelId);

    }

}
