/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aina
 */
public class Passenger extends User implements Auth {

    private String passportNo;
    private String password;
    private String username;

    public Passenger(String passportNo, int age, String name, String username, String icNo, String phoneNo, String email, String password, GenderEnum gender) {
        super(age, name, icNo, phoneNo, email, gender);
        this.passportNo = passportNo;
    }

    public Passenger() {

    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }


    public void checkIn(String reservationId) {

    }

    public void cancelReservation(Reservation reservation, String cancellationReason) {
//        int index = listReservation.indexOf(reservation);
//        if (index != -1) {
//            // If element exist in the array, we have to insert the date
//            listReservation.get(index).setCancelledAt(new Date());
//        }

    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean validatePassword(String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String generateId() {
        String idGenerated = "LP" + super.generateRandomNumber();
        super.setId(idGenerated);

        return idGenerated;
    }

    @Override
    public String getUserType() {
        return "Passenger";
    }
}
