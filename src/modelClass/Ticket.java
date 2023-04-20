/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aina
 */
public class Ticket {

    private int ticketId;
    private String seatNo;
    private double luggageWeight;
    private Flight flight;
    private Boolean isTakeInsurance = false;

    public Ticket(int ticketId, String seatNo, double luggageWeight, Flight flight, Boolean isTakeInsurance) {
        this.ticketId = ticketId;
        this.seatNo = seatNo;
        this.luggageWeight = luggageWeight;
        this.flight = flight;
        this.isTakeInsurance = isTakeInsurance;
    }

    public Ticket() {
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Boolean getIsTakeInsurance() {
        return isTakeInsurance;
    }

    public void setIsTakeInsurance(Boolean isTakeInsurance) {
        this.isTakeInsurance = isTakeInsurance;
    }

    public double getLuggageWeight() {
        return luggageWeight;
    }

    public void setLuggageWeight(double luggageWeight) {
        this.luggageWeight = luggageWeight;
    }

    public Double getLuggageWeightPrice() {
        Double total = 0.0;
//        If within 4kg
        if (luggageWeight > 0 && luggageWeight < 1) {
            total = 25.0;
        } else if (luggageWeight < 3) {
            total = 45.0;
        } else if (luggageWeight < 6) {
            total = 65.0;
        } else {
            total = 150.0;
        }

        return total;
    }

    public double calcTotalPrice() {
        double total = flight.getPrice();
        if (isTakeInsurance) {
            total += 50;
        }
        total += getLuggageWeightPrice();
        
        return total;
    }

}
