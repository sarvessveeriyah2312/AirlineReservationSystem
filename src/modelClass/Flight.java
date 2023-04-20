package modelClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;

/**
 * Name: Sarvess S/O Veeriyah Matrix No: CB20146 Section: 03 | 03B
 */
public class Flight {

    private String flightNo;
    private int flightId;
    private ArrayList<Pilot> listPilot;
    private ComboItem origin;
    private ComboItem destination;
    private int totalSeats;
    private double price;
    private String imageUrl;
    private Date boardingDate;
    private GateEnum gate;

    //Constructor
    public Flight(String flightNo, ArrayList<Pilot> listPilot, ComboItem origin, ComboItem destination, int totalSeats, double price, String imageUrl, Date boardingDate, GateEnum gate) {
        this.flightNo = flightNo;
        this.listPilot = new ArrayList<Pilot>();
        this.origin = origin;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.price = price;
        this.imageUrl = imageUrl;
        this.boardingDate = boardingDate;
        this.gate = gate;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Date getBoardingDate() {
        return boardingDate;
    }

    public String getBoardingDateString() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm");
        return dateFormat.format(boardingDate);
    }

    public void setBoardingDate(Date boardingDate) {
        this.boardingDate = boardingDate;
    }

    public GateEnum getGate() {
        return gate;
    }

    public void setGate(GateEnum gate) {
        this.gate = gate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Flight() {
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public ArrayList<Pilot> getListPilot() {
        return listPilot;
    }

    public void setListPilot(ArrayList<Pilot> listPilot) {
        this.listPilot = listPilot;
    }

    public ComboItem getOrigin() {
        return origin;
    }

    public void setOrigin(ComboItem origin) {
        this.origin = origin;
    }

    public ComboItem getDestination() {
        return destination;
    }

    public void setDestination(ComboItem destination) {
        this.destination = destination;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Add & Remove Pilot
    public void addPilot(Pilot pilot) {
        listPilot.add(pilot);
    }

    public void removePilot(Pilot pilot) {
        listPilot.remove(pilot);
    }

}
