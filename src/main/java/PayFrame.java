
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public class PayFrame extends javax.swing.JFrame {
	
	ImageIcon icon = new ImageIcon("images/hearticket.png");
	
	 int debValue = 0, credValue=0, totalPay=0; boolean err = true, go = true;
	 Object[] result = null ; int ent = 0;
	

	/**
	 * Creates new form PayFrame
	 */
	public PayFrame() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reservGroup = new javax.swing.ButtonGroup();
        payMethTitle = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        debCardtitle = new javax.swing.JLabel();
        credCardTitle = new javax.swing.JLabel();
        cardTitle = new javax.swing.JLabel();
        cbdebCard = new javax.swing.JCheckBox();
        cbcredCard = new javax.swing.JCheckBox();
        rbvalidCred = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbReservar = new javax.swing.JRadioButton();
        rbNoReservar = new javax.swing.JRadioButton();
        subirPay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        payMethTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        payMethTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payMethTitle.setText("Método de Pago");

        debCardtitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        debCardtitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        debCardtitle.setText("Debito");

        credCardTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        credCardTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        credCardTitle.setText("Credito");

        cardTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cardTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cardTitle.setText("Tarjeta");

        cbdebCard.setText("0");
        cbdebCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdebCardActionPerformed(evt);
            }
        });

        cbcredCard.setText("0");
        cbcredCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcredCardActionPerformed(evt);
            }
        });

        rbvalidCred.setText("Valida");
        rbvalidCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbvalidCredActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbdebCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(debCardtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbcredCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(credCardTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbvalidCred, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addComponent(cardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPanelLayout.createSequentialGroup()
                .addComponent(cardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debCardtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credCardTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbcredCard, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbdebCard, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(rbvalidCred)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reserva");

        reservGroup.add(rbReservar);
        rbReservar.setText("Inmediata");
        rbReservar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbReservarStateChanged(evt);
            }
        });
        rbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReservarActionPerformed(evt);
            }
        });

        reservGroup.add(rbNoReservar);
        rbNoReservar.setText("Posterior");
        rbNoReservar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbNoReservarStateChanged(evt);
            }
        });
        rbNoReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbNoReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(rbReservar)
                .addGap(18, 18, 18)
                .addComponent(rbNoReservar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        subirPay.setText("Pagar");
        subirPay.setActionCommand("");
        subirPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(payMethTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subirPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(payMethTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(subirPay)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbdebCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdebCardActionPerformed
       
	String debV = "";
	   
	if (cbdebCard.isSelected()){
		do {			
			try {
				
				debValue = Integer.parseInt(JOptionPane.showInputDialog(rootPane,
					"Ingrese la suma a pagar", "Tarjeta Debito", ent, icon, result, DISPOSE_ON_CLOSE).toString());
				err=false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Ingrese una suma valida", "Valor No Aceptado", JOptionPane.ERROR_MESSAGE);
			}
		} while (err);
		
	}
	
	totalPay = debValue + credValue;
	
	System.out.println(totalPay);
    }//GEN-LAST:event_cbdebCardActionPerformed

    private void cbcredCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcredCardActionPerformed
	if (cbcredCard.isSelected()){
		do {			
			try {

				credValue = Integer.parseInt(JOptionPane.showInputDialog(rootPane,
					"Ingrese la suma a pagar", "Tarjeta Credito", ent, icon, result, DISPOSE_ON_CLOSE).toString());
				err=false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Ingrese una suma valida", "Valor No Aceptado", JOptionPane.ERROR_MESSAGE);
			}
		} while (err);
		
		totalPay = debValue + credValue;
	
		System.out.println(totalPay);
	}
    }//GEN-LAST:event_cbcredCardActionPerformed

    private void rbvalidCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbvalidCredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbvalidCredActionPerformed

    private void rbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReservarActionPerformed
	
	if (rbReservar.isSelected() && go){
		totalPay+=2600;
		go = false;
	}else if (!rbReservar.isSelected() && go){
		totalPay -=2600;
		go = true;
	}
	System.out.println(totalPay);
    }//GEN-LAST:event_rbReservarActionPerformed

    private void rbReservarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbReservarStateChanged

    }//GEN-LAST:event_rbReservarStateChanged

    private void rbNoReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoReservarActionPerformed
	if (rbNoReservar.isSelected() && !go){
		totalPay-=2600;
		go = true;
	}else if (!rbNoReservar.isSelected() && !go){
		totalPay +=2600;
		go = false;
	}
	System.out.println(totalPay);	
    }//GEN-LAST:event_rbNoReservarActionPerformed

    private void rbNoReservarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbNoReservarStateChanged

    }//GEN-LAST:event_rbNoReservarStateChanged

    private void subirPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirPayActionPerformed
	if ( !cbdebCard.isSelected() && !cbcredCard.isSelected() || cbcredCard.isSelected() && !rbvalidCred.isSelected() ||
										!rbReservar.isSelected() && !rbNoReservar.isSelected() )
		JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios", "Tickets No Reservados", JOptionPane.ERROR_MESSAGE);
	else
		JOptionPane.showMessageDialog(null,"Su total a pagar es de: $"+totalPay, "Tickets Pagados", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_subirPayActionPerformed

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
			java.util.logging.Logger.getLogger(PayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PayFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PayFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel cardTitle;
    private javax.swing.JCheckBox cbcredCard;
    private javax.swing.JCheckBox cbdebCard;
    private javax.swing.JLabel credCardTitle;
    private javax.swing.JLabel debCardtitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel payMethTitle;
    private javax.swing.JRadioButton rbNoReservar;
    private javax.swing.JRadioButton rbReservar;
    private javax.swing.JRadioButton rbvalidCred;
    private javax.swing.ButtonGroup reservGroup;
    private javax.swing.JButton subirPay;
    // End of variables declaration//GEN-END:variables
}
