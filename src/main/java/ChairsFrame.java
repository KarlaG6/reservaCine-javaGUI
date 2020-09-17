
import javax.swing.JOptionPane;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public class ChairsFrame extends javax.swing.JFrame {

	String  movieName = "";	
	int movieEntradas = 0, nChairsSelected = 0, nChairsMissin = 0; String ChairMissingSt = "";
	
	ArrayList<String> finalChairs = new ArrayList<>();
	ArrayList<Boolean> chairs = new ArrayList<>();
	ArrayList<String> ChairsNames = new ArrayList<>();
//	String[] finalChairs = {};
//	boolean[] chairs = {};
//	String[] chairsNames = {};
	
	/**
	 * Creates new form ChairsFrame
	 */
	public ChairsFrame() {
		initComponents();
	}
	
	public ChairsFrame(int movieEntradas, String  movieName) {
		initComponents();
		exeAlways(movieEntradas, movieName);
	}
	
	void exeAlways (int nChairs, String  movieName1){
		movieEntradas = nChairs;
		nChairsMissin = nChairs;
		
		movieName = movieName1;
		
		ChairMissingSt = Integer.toString(nChairs);
		movieschairs.setText(ChairMissingSt);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        A0 = new javax.swing.JCheckBox();
        B0 = new javax.swing.JCheckBox();
        C0 = new javax.swing.JCheckBox();
        D0 = new javax.swing.JCheckBox();
        A1 = new javax.swing.JCheckBox();
        B1 = new javax.swing.JCheckBox();
        C1 = new javax.swing.JCheckBox();
        D1 = new javax.swing.JCheckBox();
        A2 = new javax.swing.JCheckBox();
        B2 = new javax.swing.JCheckBox();
        elegirAsientos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        movieschairs = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        E0 = new javax.swing.JCheckBox();
        F0 = new javax.swing.JCheckBox();
        G0 = new javax.swing.JCheckBox();
        H0 = new javax.swing.JCheckBox();
        E1 = new javax.swing.JCheckBox();
        F1 = new javax.swing.JCheckBox();
        G1 = new javax.swing.JCheckBox();
        H1 = new javax.swing.JCheckBox();
        G2 = new javax.swing.JCheckBox();
        H2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        chairsMissing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frameTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        frameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameTitle.setText("Elegir Asientos");

        A0.setText("A0");
        A0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A0ActionPerformed(evt);
            }
        });

        B0.setText("B0");
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        C0.setText("C0");
        C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C0ActionPerformed(evt);
            }
        });

        D0.setText("D0");
        D0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D0ActionPerformed(evt);
            }
        });

        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setText("C1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(C0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(D0)
                    .addComponent(D1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A2)
                    .addComponent(B2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(B1)
                    .addComponent(C1)
                    .addComponent(D1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A0)
                    .addComponent(B0)
                    .addComponent(C0)
                    .addComponent(D0)))
        );

        elegirAsientos.setText("Elegir Asientos");
        elegirAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elegirAsientosActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Asientos a elegir :");

        movieschairs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        movieschairs.setText("vaya a  elegir pelicula ome");

        E0.setText("E0");
        E0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E0ActionPerformed(evt);
            }
        });

        F0.setText("F0");
        F0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F0ActionPerformed(evt);
            }
        });

        G0.setText("G0");
        G0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G0ActionPerformed(evt);
            }
        });

        H0.setText("H0");
        H0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H0ActionPerformed(evt);
            }
        });

        E1.setText("E1");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        F1.setText("F1");
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        G1.setText("G1");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        H1.setText("H1");
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        G2.setText("G2");
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        H2.setText("H2");
        H2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(E1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(E0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(F1)
                    .addComponent(F0))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(G2)
                        .addComponent(G1))
                    .addComponent(G0))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H0)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(H1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(H2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G2)
                    .addComponent(H2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E1)
                    .addComponent(F1)
                    .addComponent(G1)
                    .addComponent(H1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E0)
                    .addComponent(F0)
                    .addComponent(G0)
                    .addComponent(H0)))
        );

        jLabel1.setText("Asientos faltantes por elegir : ");

        chairsMissing.setText("No c todavía");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(frameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(elegirAsientos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(movieschairs, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chairsMissing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 228, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(frameTitle)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movieschairs, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chairsMissing, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(elegirAsientos)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void D0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D0ActionPerformed
       if (D0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!D0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		D0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_D0ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
       if (A2.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!A2.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		A2.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_A2ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
       if (A1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!A1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		A1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_A1ActionPerformed

    private void A0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A0ActionPerformed
       if (A0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!A0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		A0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_A0ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
       if (B0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!B0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		B0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_B0ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
       if (B1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!B1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		B1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       if (B2.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!B2.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		B2.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_B2ActionPerformed

    private void C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C0ActionPerformed
       if (C0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!C0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		C0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_C0ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
       if (C1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!C1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		C1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
       if (D1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!D1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		D1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_D1ActionPerformed

    private void E0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E0ActionPerformed
       if (E0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!E0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		E0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_E0ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
       if (E1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!E1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		E1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_E1ActionPerformed

    private void F0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F0ActionPerformed
       if (F0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!F0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		F0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_F0ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
       if (F1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!F1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		F1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_F1ActionPerformed

    private void G0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G0ActionPerformed
       if (G0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!G0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		G0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_G0ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
       if (G1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!G1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		G1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_G1ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
       if (G2.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!G2.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		G2.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_G2ActionPerformed

    private void H0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H0ActionPerformed
       if (H0.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!H0.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		H0.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_H0ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
       if (H1.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!H1.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		H1.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_H1ActionPerformed

    private void H2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H2ActionPerformed
       if (H2.isSelected() && nChairsSelected<movieEntradas)
		nChairsSelected++;
	else if (!H2.isSelected() && nChairsSelected<=movieEntradas)
		nChairsSelected--;
	else {
		H2.setSelected(false);
		JOptionPane.showMessageDialog(null,"Ya no puede escoger mas sillas", "Limite de Asientos alcanzado", JOptionPane.INFORMATION_MESSAGE);
	}
	System.out.println(nChairsSelected+" : "+movieEntradas);
    }//GEN-LAST:event_H2ActionPerformed

    private void elegirAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elegirAsientosActionPerformed

		chairs.add(A0.isSelected()); ChairsNames.add("A0");
		chairs.add(A1.isSelected()); ChairsNames.add("A1");
		chairs.add(A2.isSelected()); ChairsNames.add("A2");
		chairs.add(B0.isSelected()); ChairsNames.add("B0");
		chairs.add(B1.isSelected()); ChairsNames.add("B1");
		chairs.add(B2.isSelected()); ChairsNames.add("B2");
		chairs.add(C0.isSelected()); ChairsNames.add("C0");
		chairs.add(C1.isSelected()); ChairsNames.add("C1");
		chairs.add(D0.isSelected()); ChairsNames.add("D0");
		chairs.add(D1.isSelected()); ChairsNames.add("D1");
		chairs.add(E0.isSelected()); ChairsNames.add("E0");
		chairs.add(E1.isSelected()); ChairsNames.add("E1");
		chairs.add(F0.isSelected()); ChairsNames.add("F0");
		chairs.add(F1.isSelected()); ChairsNames.add("F1");
		chairs.add(G0.isSelected()); ChairsNames.add("G0");
		chairs.add(G1.isSelected()); ChairsNames.add("G1");
		chairs.add(G2.isSelected()); ChairsNames.add("G2");
		chairs.add(H0.isSelected()); ChairsNames.add("H0");
		chairs.add(H1.isSelected()); ChairsNames.add("H1");
		chairs.add(H2.isSelected()); ChairsNames.add("H2");
		
	for (int i=0; i<chairs.size(); i++){
		if (chairs.get(i))
			finalChairs.add(ChairsNames.get(i));
	}
	System.out.println(finalChairs);
	
	System.out.println(movieName);
	new InitView(finalChairs,  movieName).setVisible(true);
	this.setVisible(false);
    }//GEN-LAST:event_elegirAsientosActionPerformed

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
			java.util.logging.Logger.getLogger(ChairsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ChairsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ChairsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ChairsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ChairsFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox A0;
    private javax.swing.JCheckBox A1;
    private javax.swing.JCheckBox A2;
    private javax.swing.JCheckBox B0;
    private javax.swing.JCheckBox B1;
    private javax.swing.JCheckBox B2;
    private javax.swing.JCheckBox C0;
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox D0;
    private javax.swing.JCheckBox D1;
    private javax.swing.JCheckBox E0;
    private javax.swing.JCheckBox E1;
    private javax.swing.JCheckBox F0;
    private javax.swing.JCheckBox F1;
    private javax.swing.JCheckBox G0;
    private javax.swing.JCheckBox G1;
    private javax.swing.JCheckBox G2;
    private javax.swing.JCheckBox H0;
    private javax.swing.JCheckBox H1;
    private javax.swing.JCheckBox H2;
    private javax.swing.JLabel chairsMissing;
    private javax.swing.JButton elegirAsientos;
    private javax.swing.JLabel frameTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel movieschairs;
    // End of variables declaration//GEN-END:variables
}
