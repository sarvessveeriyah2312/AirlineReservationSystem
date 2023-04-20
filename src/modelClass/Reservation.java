package modelClass;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Name: Chan Yuen Fu Matrix No: CB20048 Section: 03 | 03B
 */
public class Reservation {

    private String reservationId;
    private Date confirmationAt;
    private Date cancelledAt;
    private String cancellationReason;
    private User user;
    private Ticket ticket;
    private Payment payment;

    public Reservation(
            String reservationId,
            Date confirmationAt,
            Date cancelledAt,
            String cancellationReason,
            User user,
            Payment payment,
            int ticketId,
            String seatNo,
            double luggageWeight,
            Flight flight,
            Boolean isTakeInsurance
    ) {
        this.reservationId = reservationId;
        this.confirmationAt = confirmationAt;
        this.cancelledAt = cancelledAt;
        this.cancellationReason = cancellationReason;
//        Aggregation
        this.user = user;
//        Composition
        this.ticket = new Ticket(ticketId, seatNo, luggageWeight, flight, isTakeInsurance);
//        Aggregation
        this.payment = payment;
    }

    public Reservation() {
        this.ticket = new Ticket();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Date getConfirmationAt() {
        return confirmationAt;
    }

    public void setConfirmationAt(Date confirmationAt) {
        this.confirmationAt = confirmationAt;
    }

    public String getCancelledAt() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatter.format(cancelledAt);
    }

    public void setCancelledAt(Date cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCancellationReason() {
        return cancellationReason;
    }

    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(int ticketId, String seatNo, double luggageWeight, Flight flight, Boolean isTakeInsurance) {
        this.ticket = this.ticket = new Ticket(ticketId, seatNo, luggageWeight, flight, isTakeInsurance);
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
