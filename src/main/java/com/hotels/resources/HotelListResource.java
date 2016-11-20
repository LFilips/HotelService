package com.hotels.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hotels.domain.Hotel;
import com.hotels.domain.HotelList;
import com.hotels.service.DataProvider;

/**
 * Created by lfilipponi on 11/20/16.
 */
@Controller
public class HotelListResource {


    @Autowired
    DataProvider dataProvider;

    /**
     *
     * Gets the hotel list near a city
     *
     * @param city
     * @return
     */
    @RequestMapping(value="/search/{city}", method= RequestMethod.GET)
    @ResponseBody
    public HotelList HotelList(@PathVariable String city){

        return dataProvider.getHotelList();

    }


}
