
import javax.swing.JOptionPane;
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Login extends javax.swing.JFrame {

	public Login() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this   is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vaasthu Nirmaan");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        login.setForeground(new java.awt.Color(104, 24, 184));
        login.setText("Login");
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 130, -1));

        username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        username.setForeground(new java.awt.Color(104, 24, 184));
        username.setText("Username");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        password.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(104, 24, 184));
        password.setText("Password");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        txtUName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 300, 40));

        loginButton.setBackground(new java.awt.Color(171, 245, 177));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(163, 17, 207));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        registerButton.setBackground(new java.awt.Color(171, 245, 177));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        registerButton.setForeground(new java.awt.Color(163, 17, 207));
        registerButton.setText("Register now");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(31, 122, 140));
        jLabel4.setText("Vaasthu Nirmaan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 148, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 137, 214));
        jLabel7.setText("Real Estate Redefined: Homes and Plots for Your Future!");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 218, -1, -1));

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 300, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_two.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUNameActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_txtUNameActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
		// TODO add your handling code here:
		String aadharID = txtUName.getText();
		@SuppressWarnings("LocalVariableHidesMemberVariable")
		String password = new String(txtPassword.getPassword());
		int temp = 0;
		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from agent where aadharID = '" + aadharID + "' and password = '" + password + "'");

			while (rs.next()) {
				temp = 1;
				if (rs.getString("aadharID").charAt(0) == 'A') {
					setVisible(false);
					new AgentDashboard(aadharID).setVisible(true);
				}
			}

			rs = st.executeQuery("select * from customer where aadharID = '" + aadharID + "' and BINARY password = '" + password + "'");

			while (rs.next()) {
				temp = 1;
				if (rs.getString("aadharID").charAt(0) == 'C') {
					setVisible(false);
					new CustomerDashboard(aadharID).setVisible(true);
				}
			}

			if (temp == 0) {
				JOptionPane.showMessageDialog(null, "Incorrect credentials");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
		// TODO add your handling code here:
		setVisible(false);
		new Register().setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

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
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel login;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel password;
    private javax.swing.JButton registerButton;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUName;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
