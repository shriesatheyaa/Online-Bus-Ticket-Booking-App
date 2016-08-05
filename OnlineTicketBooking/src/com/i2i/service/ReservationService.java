package com.i2i.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.i2i.dao.ReservationDao;
import com.i2i.exception.DatabaseException;
import com.i2i.model.Reservation;
import com.i2i.model.TripRoute;
import com.i2i.model.User;

/**
 * <p>Service which permits to perform all the tasks related to Reservation</p>
 * @author Shrie Satheyaa
 * @created 2016-08-02
 */
@Service("reservationService")
public class ReservationService {
   
	@Autowired 
	ReservationDao reservationDao;
	/*
	 * <p>Gets a specific Route record for given Source city and Destination city.
	 * </p>
	 * @param reservation
	 *     Object of Reservation which is to be inserted.     
     * @throws DatabaseException 
     *     If there is any interruption occurred in the database.
	 */
	public Reservation addReservation (User user, TripRoute tripRoute, int noOfSeatsBooked, double totalPrice, String paymentMode, boolean status) throws DatabaseException {
		Reservation reservation = new Reservation(user, tripRoute, noOfSeatsBooked, totalPrice, paymentMode, status);
		reservationDao.insertReservation(reservation);
		return reservation;
	}
	
}
