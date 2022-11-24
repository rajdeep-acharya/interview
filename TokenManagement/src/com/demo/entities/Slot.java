package com.demo.entities;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Slot {

    private enum SlotBookingStatus{
        BOOKED ,
        AVAILABLE;
    }

    private UUID slotId;

    //
    private ZonedDateTime perSlotTime;

    // already checked during the getSlot
    private Integer slotSize;


    private DayOfWeek slotFutureDays;


    private ZonedDateTime slotOpenTime;

    private ZonedDateTime slotCloseTime;

}
