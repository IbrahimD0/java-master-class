package com.ibrahim.Booking;

import java.util.UUID;

public interface BookingDao {
    Booking[] getBookings();
    void saveBooking(Booking newBooking);
    void deleteBooking(UUID bookingId);
    default Booking findBookingById(UUID bookingId) {
        for (Booking booking : getBookings()) {
            if (booking != null && booking.getBookingId().equals(bookingId)) {
                return booking;
            }
        }
        return null;
    }
}
