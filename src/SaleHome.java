
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author sujith
 */
public class SaleHome extends javax.swing.JFrame {

	/**
	 * Creates new form NewForm
	 */
	public String username = "";

	public SaleHome() {
		initComponents();
	}

	public SaleHome(String tempUsername) {
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

        jLabel2 = new javax.swing.JLabel();
        txtAgentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtColonyName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFacing = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtBHK = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtYOC = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtSquareFeet = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        txtSS = new javax.swing.JComboBox<>();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaasthu Nirmaan");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(104, 24, 184));
        jLabel2.setText("Agent ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 300, -1));

        txtAgentID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtAgentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 300, 36));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(104, 24, 184));
        jLabel3.setText("Colony Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 300, -1));

        txtColonyName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtColonyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 300, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(104, 24, 184));
        jLabel4.setText("City Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 300, -1));

        txtCityName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtCityName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 300, 36));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(104, 24, 184));
        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 300, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 300, 36));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(104, 24, 184));
        jLabel10.setText("Facing");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 280, 300, -1));

        txtFacing.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtFacing.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "North", "South", "East", "West", " " }));
        getContentPane().add(txtFacing, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 330, 300, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(104, 24, 184));
        jLabel11.setText("Square Feet");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 300, -1));

        txtBHK.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtBHK, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 300, 36));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(104, 24, 184));
        jLabel5.setText("State");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 300, -1));

        txtState.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 300, 36));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(104, 24, 184));
        jLabel12.setText("Year Of Construction");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 300, -1));

        txtYOC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtYOC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        getContentPane().add(txtYOC, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, 300, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(104, 24, 184));
        jLabel13.setText("BHK");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 300, -1));

        txtSquareFeet.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(txtSquareFeet, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 300, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(104, 24, 184));
        jLabel1.setText("Add Home");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

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
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, -1, -1));

        txtSS.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sell", "Rent" }));
        getContentPane().add(txtSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, -1, -1));

        backButton.setBackground(new java.awt.Color(176, 244, 180));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_two.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
			String sqft = txtPrice.getText();
			String facing = (String) txtFacing.getSelectedItem();
			String yoc = (String) txtYOC.getSelectedItem();
			String ss = (String) txtSS.getSelectedItem();
			String bhk = txtBHK.getText();
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
			} else if (yoc.equals("")) {
				JOptionPane.showMessageDialog(null, "Year Of Construction field Required");
			} else if (bhk.equals("")) {
				JOptionPane.showMessageDialog(null, "BHK field Required");
			} else if (ss.equals("")) {
				JOptionPane.showMessageDialog(null, "Select whether the home is for rent or sale!");
			} else {
				Connection con = ConnectionProvider.getCon();
				java.sql.Date mDate = new java.sql.Date(date.getTime());
				PreparedStatement ps = con.prepareStatement("insert into home(sellerID, agentID, startDate, colonyName, cityName, state, price, facing, squareFeet, bhk, yearOfConstruction, sellingState) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				ps.setString(1, username);
				ps.setString(2, agentID);
				ps.setDate(3, mDate);
				ps.setString(4, colony);
				ps.setString(5, city);
				ps.setString(6, state);
				ps.setString(7, price);
				ps.setString(8, facing);
				ps.setString(9, sqft);
				ps.setString(10, bhk);
				ps.setString(11, yoc);
				ps.setString(12, ss);
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
			java.util.logging.Logger.getLogger(SaleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SaleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SaleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SaleHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SaleHome().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextField txtBHK;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtColonyName;
    private javax.swing.JComboBox<String> txtFacing;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JComboBox<String> txtSS;
    private javax.swing.JTextField txtSquareFeet;
    private javax.swing.JTextField txtState;
    private javax.swing.JComboBox<String> txtYOC;
    // End of variables declaration//GEN-END:variables
}
