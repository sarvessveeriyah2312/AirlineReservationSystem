package airlineReservationSystem2021;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import modelClass.BankAccount;
import modelClass.Payment;
import modelClass.Reservation;
import modelClass.StatusEnum;

/**
 *
 * @author Chan Yuen Fu
 */
public class PaymentGatewayLogin extends javax.swing.JFrame {

    private static Reservation reservation;

    public PaymentGatewayLogin(Reservation reservation) {
        initComponents();
        this.reservation = reservation;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAccName = new javax.swing.JLabel();
        labelAccPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        labelPayGate = new javax.swing.JLabel();
        etAccUsername = new javax.swing.JTextField();
        etAccPassword = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        lableARS = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelAccName.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelAccName.setText("ACCOUNT USERNAME:");
        getContentPane().add(labelAccName);
        labelAccName.setBounds(188, 372, 220, 23);

        labelAccPassword.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        labelAccPassword.setText("ACCOUNT PASSWORD:");
        getContentPane().add(labelAccPassword);
        labelAccPassword.setBounds(188, 442, 220, 23);

        btnLogin.setBackground(new java.awt.Color(0, 102, 255));
        btnLogin.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(470, 560, 270, 40);

        labelPayGate.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        labelPayGate.setText("PAYMENT GATEWAY");
        getContentPane().add(labelPayGate);
        labelPayGate.setBounds(91, 167, 260, 31);

        etAccUsername.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        etAccUsername.setPreferredSize(new java.awt.Dimension(75, 30));
        getContentPane().add(etAccUsername);
        etAccUsername.setBounds(460, 360, 270, 30);

        etAccPassword.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        etAccPassword.setPreferredSize(new java.awt.Dimension(75, 30));
        getContentPane().add(etAccPassword);
        etAccPassword.setBounds(460, 430, 270, 30);

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(null);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        btnBack.setText("jLabel1");
        btnBack.setMaximumSize(new java.awt.Dimension(60, 60));
        btnBack.setMinimumSize(new java.awt.Dimension(60, 60));
        btnBack.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel2.add(btnBack);
        btnBack.setBounds(20, 20, 60, 60);

        lableARS.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        lableARS.setForeground(new java.awt.Color(255, 255, 255));
        lableARS.setText("ARS");
        jPanel2.add(lableARS);
        lableARS.setBounds(100, 30, 80, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1060, 90);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Hero.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1056, 731));
        getContentPane().add(background);
        background.setBounds(0, 90, 1060, 640);

        setSize(new java.awt.Dimension(1070, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        try {
            String query = "SELECT * FROM bank_account WHERE username = ? AND password = ? LIMIT 1";

            PreparedStatement ps = InitDb.getConnection().prepareStatement(query);

            ps.setString(1, etAccUsername.getText());
            ps.setString(2, etAccPassword.getText());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                BankAccount bankAcc = new BankAccount();
                bankAcc.setId(rs.getInt("id"));
                bankAcc.setUsername(rs.getString("username"));
                bankAcc.setAccountNo(rs.getString("account_no"));
                bankAcc.setBankName(rs.getString("bank_name"));
                bankAcc.setAmount(rs.getDouble("amount"));

                Payment payment = new Payment(reservation.getTicket().calcTotalPrice(), bankAcc, Calendar.getInstance().getTime(), StatusEnum.PENDING);
                reservation.setPayment(payment);

                new PaymentGatewayPay(reservation).setVisible(true);
                this.dispose();

            } else {
                System.out.println("Invalid Credentials");
            }

            InitDb.close();
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField etAccPassword;
    private javax.swing.JTextField etAccUsername;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAccName;
    private javax.swing.JLabel labelAccPassword;
    private javax.swing.JLabel labelPayGate;
    private javax.swing.JLabel lableARS;
    // End of variables declaration//GEN-END:variables
}
