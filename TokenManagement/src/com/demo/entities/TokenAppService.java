package com.demo.entities;

import java.time.ZonedDateTime;
import java.util.List;


public class TokenAppService implements TokenApp{

    @Override
    public List<Object> viewSlot(ZonedDateTime dateTime) {
        if (dateTime.getDayOfMonth() < ZonedDateTime.now().getDayOfMonth() + 7) {
            List<Slot> slotList = checkForAvailableSlot(dateTime);
            if (slotList == null || slotList.isEmpty()) {
                throw new Exception("No slots available");
            }
        } else {
            throw new Exception("Date is beyond 7 days");
        }


        return null;
    }

    @Override
    public BookingStatus bookSlot(Slot slot) {

        return null;
    }

    private List<Slot> checkForAvailableSlot(ZonedDateTime dateTime) {
        Query q = "select * from slot as s where s.availablility = 'AVAILABLE' AND date = :dateTime";
        q.setParameter("dateTime", dateTime);
        return (List<Slot>))getResultSet();
    }
}
