
import java.sql.Connection;
import dao.ConnectionProvider;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author sujith
 */
public class SalePlot extends javax.swing.JFrame {

	/**
	 * Creates new form buyPlot
	 */
	public String username = "";

	public SalePlot() {
		initComponents();
	}

	public SalePlot(String tempUsername) {
		initComponents();
		setLocationRelativeTo(null);
		username = tempUsername;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAgentID = new javax.swing.JTextField();
        txtCityName = new javax.swing.JTextField();
        txtColonyName = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSquareFeet = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        txtFacing = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaasthu Nirmaan");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 24, 184));
        jLabel1.setText("Add Plot");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(104, 24, 184));
        jLabel2.setText("Agent ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 300, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(104, 24, 184));
        jLabel3.setText("Colony Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 300, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(104, 24, 184));
        jLabel4.setText("City Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(104, 24, 184));
        jLabel5.setText("State");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 300, -1));

        txtAgentID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtAgentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 300, 36));

        txtCityName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtCityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 300, 36));

        txtColonyName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtColonyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 300, 36));

        txtState.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 300, 36));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(104, 24, 184));
        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 300, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 300, 36));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(104, 24, 184));
        jLabel10.setText("Facing");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 300, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(104, 24, 184));
        jLabel11.setText("Square Feet");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 300, -1));

        txtSquareFeet.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtSquareFeet, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 300, 36));

        saveButton.setBackground(new java.awt.Color(176, 244, 180));
        saveButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        saveButton.setForeground(new java.awt.Color(163, 17, 207));
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, -1, -1));

        txtFacing.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtFacing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North", "South", "East", "West", " " }));
        getContentPane().add(txtFacing, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 300, 40));

        backButton.setBackground(new java.awt.Color(176, 244, 180));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_two.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
		// TODO add your handling code here:
		try {
			String agentID = txtAgentID.getText();
			String colony = txtColonyName.getText();
			String city = txtCityName.getText();
			String state = txtState.getText();
			String price = txtPrice.getText();
			String facing = (String) txtFacing.getSelectedItem();
			String sqft = txtSquareFeet.getText();
			Date date = new Date();
			if (agentID.equals("")) {
				JOptionPane.showMessageDialog(null, "Agent ID field Required");
			} else if (colony.equals("")) {
				JOptionPane.showMessageDialog(null, "Colony field Required");
			} else if (city.equals("")) {
				JOptionPane.showMessageDialog(null, "City field Required");
			} else if (state.equals("")) {
				JOptionPane.showMessageDialog(null, "State field Required");
			} else if (price.equals("")) {
				JOptionPane.showMessageDialog(null, "Price field Required");
			} else if (facing.equals("")) {
				JOptionPane.showMessageDialog(null, "Facing field Required");
			} else if (sqft.equals("")) {
				JOptionPane.showMessageDialog(null, "Square Feet field Required");
			} else {
				Connection con = ConnectionProvider.getCon();
				java.sql.Date mDate = new java.sql.Date(date.getTime());
				PreparedStatement ps = con.prepareStatement("insert into plot(sellerID, agentID, startDate, colonyName, cityName, state, price, facing, squareFeet) values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
				ps.setString(1, username);
				ps.setString(2, agentID);
				ps.setDate(3, mDate);
				ps.setString(4, colony);
				ps.setString(5, city);
				ps.setString(6, state);
				ps.setString(7, price);
				ps.setString(8, facing);
				ps.setString(9, sqft);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Plot added succesfully!");
				setVisible(false);
				new CustomerDashboard().setVisible(true);
			}
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, e);
		}
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
		// TODO add your handling code here:
		setVisible(false);
		new CustomerDashboard(username).setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SalePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SalePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SalePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SalePlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SalePlot().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtColonyName;
    private javax.swing.JComboBox<String> txtFacing;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSquareFeet;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
