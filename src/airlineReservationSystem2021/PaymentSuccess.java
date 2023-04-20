package airlineReservationSystem2021;

import modelClass.Reservation;

/**
 *
 * @author Chan Yuen Fu
 */
public class PaymentSuccess extends javax.swing.JFrame {

    private static Reservation reservation;

    PaymentSuccess(Reservation reservation) {
        initComponents();

        this.reservation = reservation;

        txtPaymentId.setText(String.valueOf(reservation.getPayment().getPaymentId()));
        txtTicketId.setText(String.valueOf(reservation.getTicket().getTicketId()));
        txtPaymentDate.setText(reservation.getPayment().getDateString());

        txtTotalPayment.setText(Double.toString(reservation.getPayment().getAmount()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPaymentID = new javax.swing.JLabel();
        labelPayDate = new javax.swing.JLabel();
        labelPaySuccess = new javax.swing.JLabel();
        txtPaymentId = new javax.swing.JLabel();
        labelTotalPayment = new javax.swing.JLabel();
        labelPaymentDetail = new javax.swing.JLabel();
        txtTicketId = new javax.swing.JLabel();
        labelPaymentID1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelARS = new javax.swing.JLabel();
        txtPaymentDate = new javax.swing.JLabel();
        txtTotalPayment = new javax.swing.JLabel();
        labelRM = new javax.swing.JLabel();
        btnGoToTicketDetail = new javax.swing.JButton();
        btnPrintReceipt = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelPaymentID.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelPaymentID.setText("PAYMENT ID:");
        getContentPane().add(labelPaymentID);
        labelPaymentID.setBounds(340, 310, 140, 23);

        labelPayDate.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelPayDate.setText("PAYMENT DATE:");
        getContentPane().add(labelPayDate);
        labelPayDate.setBounds(340, 390, 160, 23);

        labelPaySuccess.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        labelPaySuccess.setText("PAYMENT SUCCESSFUL");
        getContentPane().add(labelPaySuccess);
        labelPaySuccess.setBounds(380, 150, 272, 31);

        txtPaymentId.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtPaymentId.setText("show payment id");
        getContentPane().add(txtPaymentId);
        txtPaymentId.setBounds(550, 310, 160, 23);

        labelTotalPayment.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelTotalPayment.setText("TOTAL PAYMENT:");
        getContentPane().add(labelTotalPayment);
        labelTotalPayment.setBounds(340, 480, 170, 23);

        labelPaymentDetail.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelPaymentDetail.setText("PAYMENT DETAIL");
        getContentPane().add(labelPaymentDetail);
        labelPaymentDetail.setBounds(442, 207, 200, 23);

        txtTicketId.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtTicketId.setText("show payment id");
        getContentPane().add(txtTicketId);
        txtTicketId.setBounds(550, 350, 160, 23);

        labelPaymentID1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelPaymentID1.setText("TICKET ID:");
        getContentPane().add(labelPaymentID1);
        labelPaymentID1.setBounds(340, 350, 140, 23);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(null);

        labelARS.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        labelARS.setForeground(new java.awt.Color(255, 255, 255));
        labelARS.setText("ARS");
        jPanel2.add(labelARS);
        labelARS.setBounds(30, 20, 80, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1060, 90);

        txtPaymentDate.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtPaymentDate.setText("Date");
        getContentPane().add(txtPaymentDate);
        txtPaymentDate.setBounds(550, 390, 270, 20);

        txtTotalPayment.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        txtTotalPayment.setText("Amount");
        getContentPane().add(txtTotalPayment);
        txtTotalPayment.setBounds(590, 480, 270, 23);

        labelRM.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelRM.setText("RM");
        getContentPane().add(labelRM);
        labelRM.setBounds(550, 480, 40, 23);

        btnGoToTicketDetail.setBackground(new java.awt.Color(0, 102, 255));
        btnGoToTicketDetail.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        btnGoToTicketDetail.setForeground(new java.awt.Color(255, 255, 255));
        btnGoToTicketDetail.setText("GO TO TICKET DETAIL");
        btnGoToTicketDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToTicketDetailActionPerformed(evt);
            }
        });
        getContentPane().add(btnGoToTicketDetail);
        btnGoToTicketDetail.setBounds(620, 590, 310, 40);

        btnPrintReceipt.setBackground(new java.awt.Color(0, 102, 255));
        btnPrintReceipt.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        btnPrintReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintReceipt.setText("PRINT RECEIPT");
        btnPrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintReceiptActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrintReceipt);
        btnPrintReceipt.setBounds(230, 590, 270, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hero.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 90, 1060, 640);

        setSize(new java.awt.Dimension(1070, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToTicketDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToTicketDetailActionPerformed
        new TicketDetails(reservation).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnGoToTicketDetailActionPerformed

    private void btnPrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintReceiptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintReceiptActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnGoToTicketDetail;
    private javax.swing.JButton btnPrintReceipt;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelARS;
    private javax.swing.JLabel labelPayDate;
    private javax.swing.JLabel labelPaySuccess;
    private javax.swing.JLabel labelPaymentDetail;
    private javax.swing.JLabel labelPaymentID;
    private javax.swing.JLabel labelPaymentID1;
    private javax.swing.JLabel labelRM;
    private javax.swing.JLabel labelTotalPayment;
    private javax.swing.JLabel txtPaymentDate;
    private javax.swing.JLabel txtPaymentId;
    private javax.swing.JLabel txtTicketId;
    private javax.swing.JLabel txtTotalPayment;
    // End of variables declaration//GEN-END:variables
}
