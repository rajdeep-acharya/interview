package com.demo.entities;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

public interface TokenApp {

//    enum {
//        (SLOT_AVILABLE);
//        (SLOT_BOOKED);
//    }

    List<Object> viewSlot(ZonedDateTime dateTime);

    BookingStatus bookSlot(Slot slot);
}
