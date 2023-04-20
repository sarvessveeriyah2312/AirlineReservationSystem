/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlineReservationSystem2021;

import modelClass.Reservation;

/**
 *
 * @author kimai
 */
public class TicketDetails extends javax.swing.JFrame {

    private static Reservation reservation;

    /**
     * Creates new form TicketDetails
     */
    public TicketDetails(Reservation reservation) {
        initComponents();

        this.reservation = reservation;

        txtTicketID.setText(String.valueOf(reservation.getTicket().getTicketId()));
        txtName.setText(reservation.getUser().getName());
        txtInsurance.setText(String.valueOf(reservation.getTicket().getIsTakeInsurance()));
        txtLuggageWeight.setText(String.valueOf(reservation.getTicket().getLuggageWeight()));

        txtOrigin.setText(reservation.getTicket().getFlight().getOrigin().getValue());
        txtDestination.setText(reservation.getTicket().getFlight().getDestination().getValue());
        txtGate.setText(reservation.getTicket().getFlight().getGate().label);
        txtFlightNum.setText(reservation.getTicket().getFlight().getFlightNo());
        txtSeatNum.setText(reservation.getTicket().getSeatNo());

        txtDate.setText(reservation.getTicket().getFlight().getBoardingDateString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblTicketID = new javax.swing.JLabel();
        lblInsurance = new javax.swing.JLabel();
        txtTicketID = new javax.swing.JLabel();
        txtInsurance = new javax.swing.JLabel();
        lblLuggageWeight = new javax.swing.JLabel();
        txtLuggageWeight = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtDepart = new javax.swing.JLabel();
        lblDepart = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtOrigin = new javax.swing.JLabel();
        lblOrigin = new javax.swing.JLabel();
        dottedLine = new javax.swing.JLabel();
        txtDestination = new javax.swing.JLabel();
        lblDestination = new javax.swing.JLabel();
        lblFlightNum = new javax.swing.JLabel();
        txtFlightNum = new javax.swing.JLabel();
        lblSeatNum = new javax.swing.JLabel();
        txtSeatNum = new javax.swing.JLabel();
        txtGate = new javax.swing.JLabel();
        lblGate = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        btnViewReservation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblTitle.setFont(new java.awt.Font("Sitka Subheading", 1, 22)); // NOI18N
        lblTitle.setText("TICKET DETAILS");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(30, 130, 200, 30);

        txtName.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        txtName.setText("Your Name");
        getContentPane().add(txtName);
        txtName.setBounds(100, 190, 110, 21);

        lblName.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblName.setText("NAME:");
        getContentPane().add(lblName);
        lblName.setBounds(40, 190, 60, 21);

        lblTicketID.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblTicketID.setText("TICKET ID:");
        getContentPane().add(lblTicketID);
        lblTicketID.setBounds(280, 190, 85, 21);

        lblInsurance.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblInsurance.setText("INSURANCE:");
        getContentPane().add(lblInsurance);
        lblInsurance.setBounds(540, 190, 98, 21);

        txtTicketID.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        txtTicketID.setText("Ticket ID");
        getContentPane().add(txtTicketID);
        txtTicketID.setBounds(380, 190, 72, 21);

        txtInsurance.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        txtInsurance.setText("Insurance");
        getContentPane().add(txtInsurance);
        txtInsurance.setBounds(650, 190, 79, 21);

        lblLuggageWeight.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblLuggageWeight.setText("LUGGAGE WEIGHT:");
        getContentPane().add(lblLuggageWeight);
        lblLuggageWeight.setBounds(790, 190, 152, 21);

        txtLuggageWeight.setFont(new java.awt.Font("Sitka Text", 1, 16)); // NOI18N
        txtLuggageWeight.setText("Weight");
        getContentPane().add(txtLuggageWeight);
        txtLuggageWeight.setBounds(950, 190, 57, 21);

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(880, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(30, 230, 990, 5);

        txtDepart.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtDepart.setText("13:15");
        getContentPane().add(txtDepart);
        txtDepart.setBounds(660, 310, 150, 20);

        lblDepart.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblDepart.setText("DEPART:");
        getContentPane().add(lblDepart);
        lblDepart.setBounds(660, 280, 80, 21);

        txtDate.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtDate.setText("21 - 01 - 2022");
        txtDate.setToolTipText("");
        getContentPane().add(txtDate);
        txtDate.setBounds(380, 310, 150, 20);

        lblDate.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblDate.setText("DATE:");
        getContentPane().add(lblDate);
        lblDate.setBounds(380, 280, 60, 20);

        txtOrigin.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtOrigin.setText("from the location flight");
        getContentPane().add(txtOrigin);
        txtOrigin.setBounds(40, 310, 300, 23);

        lblOrigin.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblOrigin.setText("FROM:");
        getContentPane().add(lblOrigin);
        lblOrigin.setBounds(40, 280, 51, 20);

        dottedLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dottedLine.png"))); // NOI18N
        getContentPane().add(dottedLine);
        dottedLine.setBounds(350, 250, 10, 380);

        txtDestination.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtDestination.setText("SINGAPORE");
        getContentPane().add(txtDestination);
        txtDestination.setBounds(40, 460, 300, 23);

        lblDestination.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblDestination.setText("TO:");
        getContentPane().add(lblDestination);
        lblDestination.setBounds(40, 430, 27, 20);

        lblFlightNum.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblFlightNum.setText("FLIGHT NUMBER:");
        getContentPane().add(lblFlightNum);
        lblFlightNum.setBounds(380, 430, 160, 21);

        txtFlightNum.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtFlightNum.setText("FLG-50017");
        getContentPane().add(txtFlightNum);
        txtFlightNum.setBounds(380, 460, 200, 20);

        lblSeatNum.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblSeatNum.setText("SEAT NUMBER:");
        getContentPane().add(lblSeatNum);
        lblSeatNum.setBounds(380, 560, 130, 21);

        txtSeatNum.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtSeatNum.setText("15");
        getContentPane().add(txtSeatNum);
        txtSeatNum.setBounds(380, 590, 100, 20);

        txtGate.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtGate.setText("A1");
        getContentPane().add(txtGate);
        txtGate.setBounds(40, 590, 100, 23);

        lblGate.setFont(new java.awt.Font("Sitka Text", 0, 16)); // NOI18N
        lblGate.setText("GATE:");
        getContentPane().add(lblGate);
        lblGate.setBounds(40, 560, 60, 20);

        btnPrint.setBackground(new java.awt.Color(0, 102, 255));
        btnPrint.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnPrint.setText("PRINT TICKET");
        btnPrint.setFocusPainted(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrint);
        btnPrint.setBounds(470, 670, 270, 40);

        btnViewReservation.setBackground(new java.awt.Color(0, 102, 255));
        btnViewReservation.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        btnViewReservation.setText("VIEW RESERVATION");
        btnViewReservation.setFocusPainted(false);
        btnViewReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReservationActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewReservation);
        btnViewReservation.setBounds(760, 670, 270, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/airplane_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(690, 400, 300, 180);

        title.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("ARS");
        getContentPane().add(title);
        title.setBounds(30, 20, 80, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hero.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 90, 1060, 640);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(null);

        etTitle1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        etTitle1.setForeground(new java.awt.Color(255, 255, 255));
        etTitle1.setText("ARS");
        jPanel2.add(etTitle1);
        etTitle1.setBounds(30, 20, 80, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1060, 90);

        setBounds(0, 0, 1078, 787);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReservationActionPerformed

        MyReservation myReservation;
        myReservation = new MyReservation(reservation.getUser());
        myReservation.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnViewReservationActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

    }//GEN-LAST:event_btnPrintActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnViewReservation;
    private javax.swing.JLabel dottedLine;
    private javax.swing.JLabel etTitle1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDepart;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblFlightNum;
    private javax.swing.JLabel lblGate;
    private javax.swing.JLabel lblInsurance;
    private javax.swing.JLabel lblLuggageWeight;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrigin;
    private javax.swing.JLabel lblSeatNum;
    private javax.swing.JLabel lblTicketID;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtDepart;
    private javax.swing.JLabel txtDestination;
    private javax.swing.JLabel txtFlightNum;
    private javax.swing.JLabel txtGate;
    private javax.swing.JLabel txtInsurance;
    private javax.swing.JLabel txtLuggageWeight;
    private javax.swing.JLabel txtName;
    private javax.swing.JLabel txtOrigin;
    private javax.swing.JLabel txtSeatNum;
    private javax.swing.JLabel txtTicketID;
    // End of variables declaration//GEN-END:variables
}
