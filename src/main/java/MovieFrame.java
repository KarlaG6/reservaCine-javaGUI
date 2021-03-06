/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author karla
 */
public class MovieFrame extends javax.swing.JFrame {
	
	int movieIndex = 0, movieEntradas = 0; String movieName = "", movieFunc = "", movieSala = "";

	ImageIcon currentImg; String currentDesc;
	ImageIcon interstellarImg = new ImageIcon("images/interstellar2.jpg");
	ImageIcon matrixImg = new ImageIcon("images/matrix2.jpg");
	ImageIcon rpoImg = new ImageIcon("images/readyplayerone.jpg");
	ImageIcon tndImg = new ImageIcon("images/theneondemon2.jpg");
	Movie selectedMovie = new Movie();
//	String movies[] = {"-- selecione una --", "matrix", "ready player one", "interstellar", "the neon demon"};
	
	Movie none, matrix, interstellar, readyplayerone, theneondemon ;	
	Movie myMovies[] = {none, matrix,interstellar, readyplayerone, theneondemon};
	
	String interstellarDesc = "<html>A mediados del siglo XXI, la destrucción de las cosechas en la Tierra"+
			" ha hecho que la agricultura sea cada vez más difícil y se vea amenazada la supervivencia"+
			"de la humanidad. Joseph Cooper, viudo, exingeniero y piloto de la NASA, dirige una granja "+
			"con su suegro Donald, su hijo Tom y su hija Murphy, quien cree que su habitación está "+
			"embrujada por un poltergeist.</html>",
	matrixDesc = "<html>Thomas A. Anderson (Keanu Reeves) es programador informático de día y"+
			" un hacker llamado Neo de noche. Lleva toda su vida intuyendo que hay algo más,"+
			" que hay algo que falla y esa duda se ve reafirmada con un mensaje"+
			"recibido en su ordenador: «Matrix te posee».</html>", 
	rpoDesc = "<html>La historia sigue los pasos del joven Wade Owen Watts, "+
			"un jugador de videojuegos del año 2045 que, como el resto de la humanidad,"+
			"prefiere el metauniverso de realidad virtual OASIS al cada vez más sombrío mundo real.</html>", 
	tndDesc = "<html>Jesse, una aspirante a modelo, se muda a Los Ángeles, donde es reclutada "+
		"por un magnate de la moda (Alessandro Nivola) como su musa."+
		" Al entrar en la industria del modelado en la ciudad,"+
		"se encuentra con que su vitalidad y juventud son devorados por un grupo de mujeres"+
		"obsesionadas con la belleza, las cuales van a utilizar cualquier medio para conseguir lo que tiene.</html>";
	

	 /**
	 * Creates new form Movie
	 */
	public MovieFrame() {
		initComponents();
		
	}
	void fillAtributes() {
		matrix.setMovieIndex(1); 
		matrix.setName("Matrix");
		matrix.setImg(matrixImg);
		matrix.setDescription("<html>Thomas A. Anderson (Keanu Reeves) es programador informático de día y"+
			" un hacker llamado Neo de noche. Lleva toda su vida intuyendo que hay algo más,"+
			" que hay algo que falla y esa duda se ve reafirmada con un mensaje"+
			"recibido en su ordenador: «Matrix te posee».</html>");
		
		interstellar.setMovieIndex(3);
		interstellar.setName("Interstellar");
		interstellar.setImg(interstellarImg);
		interstellar.setDescription("<html>A mediados del siglo XXI, la destrucción de las cosechas en la Tierra"+
			" ha hecho que la agricultura sea cada vez más difícil y se vea amenazada la supervivencia"+
			"de la humanidad. Joseph Cooper, viudo, exingeniero y piloto de la NASA, dirige una granja "+
			"con su suegro Donald, su hijo Tom y su hija Murphy, quien cree que su habitación está "+
			"embrujada por un poltergeist.</html>");
		
		readyplayerone.setMovieIndex(2);
		readyplayerone.setName("Ready player one");
		readyplayerone.setImg(rpoImg);
		readyplayerone.setDescription("<html>La historia sigue los pasos del joven Wade Owen Watts, "+
			"un jugador de videojuegos del año 2045 que, como el resto de la humanidad,"+
			"prefiere el metauniverso de realidad virtual OASIS al cada vez más sombrío mundo real.</html>");
		
		theneondemon.setMovieIndex(4);
		theneondemon.setName("the neon demon");
		theneondemon.setImg(tndImg);
		theneondemon.setDescription("<html>Jesse, una aspirante a modelo, se muda a Los Ángeles, donde es reclutada "+
		"por un magnate de la moda (Alessandro Nivola) como su musa."+
		" Al entrar en la industria del modelado en la ciudad,"+
		"se encuentra con que su vitalidad y juventud son devorados por un grupo de mujeres"+
		"obsesionadas con la belleza, las cuales van a utilizar cualquier medio para conseguir lo que tiene.</html>");
		
		
	}
	
	

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        funcGroup = new javax.swing.ButtonGroup();
        salaGroup = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        cbmovies = new javax.swing.JComboBox<>();
        pelisTitle = new javax.swing.JLabel();
        labelPic = new javax.swing.JLabel();
        subirPeli = new javax.swing.JButton();
        descTitle = new javax.swing.JLabel();
        showdesc = new javax.swing.JLabel();
        funcTitle = new javax.swing.JLabel();
        cbFuncsPan = new javax.swing.JPanel();
        rbFunc2 = new javax.swing.JRadioButton();
        rbFunc1 = new javax.swing.JRadioButton();
        salaTitle = new javax.swing.JLabel();
        rbdosd = new javax.swing.JRadioButton();
        rbtresd = new javax.swing.JRadioButton();
        rbvip = new javax.swing.JRadioButton();
        entradTitle = new javax.swing.JLabel();
        numEntraSp = new javax.swing.JSpinner();
        seeRating = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(830, 700));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Eligiendo Pelicula");

        cbmovies.setBackground(new java.awt.Color(102, 102, 102));
        cbmovies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- selecione una --", "matrix", "ready player one", "interstellar", "the neon demon" }));
        cbmovies.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbmoviesItemStateChanged(evt);
            }
        });
        cbmovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmoviesActionPerformed(evt);
            }
        });

        pelisTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pelisTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pelisTitle.setText("Peliculas");

        labelPic.setForeground(new java.awt.Color(255, 255, 255));

        subirPeli.setText("Submit");
        subirPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subirPeliActionPerformed(evt);
            }
        });

        descTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descTitle.setText("Descripcion");

        showdesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showdesc.setText("Eliga un pelicula");
        showdesc.setAutoscrolls(true);
        showdesc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showdesc.setMaximumSize(new java.awt.Dimension(223, 13));
        showdesc.setMinimumSize(new java.awt.Dimension(223, 13));

        funcTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        funcTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        funcTitle.setText("Funciones");

        funcGroup.add(rbFunc2);
        rbFunc2.setText("5:013 - 7:05 p.m");
        rbFunc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFunc2ActionPerformed(evt);
            }
        });

        funcGroup.add(rbFunc1);
        rbFunc1.setText("8:15 - 10:03 a.m");
        rbFunc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFunc1ActionPerformed(evt);
            }
        });

        salaTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaTitle.setText("Sala");

        salaGroup.add(rbdosd);
        rbdosd.setText("2D");
        rbdosd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdosdActionPerformed(evt);
            }
        });

        salaGroup.add(rbtresd);
        rbtresd.setText("3D");
        rbtresd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtresdActionPerformed(evt);
            }
        });

        salaGroup.add(rbvip);
        rbvip.setText("V.I.P");

        entradTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        entradTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entradTitle.setText("Entradas");

        numEntraSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 72, 1));
        numEntraSp.setAutoscrolls(true);
        numEntraSp.setFocusable(false);
        numEntraSp.setInheritsPopupMenu(true);
        numEntraSp.setName(""); // NOI18N
        numEntraSp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                numEntraSpStateChanged(evt);
            }
        });

        javax.swing.GroupLayout cbFuncsPanLayout = new javax.swing.GroupLayout(cbFuncsPan);
        cbFuncsPan.setLayout(cbFuncsPanLayout);
        cbFuncsPanLayout.setHorizontalGroup(
            cbFuncsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cbFuncsPanLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(rbFunc1)
                .addGap(33, 33, 33)
                .addComponent(rbFunc2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cbFuncsPanLayout.createSequentialGroup()
                .addComponent(salaTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(cbFuncsPanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(rbdosd)
                .addGap(18, 18, 18)
                .addComponent(rbtresd)
                .addGap(18, 18, 18)
                .addComponent(rbvip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numEntraSp, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        cbFuncsPanLayout.setVerticalGroup(
            cbFuncsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cbFuncsPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cbFuncsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFunc1)
                    .addComponent(rbFunc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cbFuncsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entradTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cbFuncsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbvip)
                    .addComponent(numEntraSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtresd)
                    .addComponent(rbdosd))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        seeRating.setText("Ver Rating");
        seeRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeRatingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pelisTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbmovies, javax.swing.GroupLayout.Alignment.TRAILING, 0, 229, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subirPeli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showdesc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbFuncsPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(funcTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seeRating, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addComponent(title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pelisTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbmovies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showdesc, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(funcTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbFuncsPan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(seeRating)
                        .addGap(30, 30, 30)
                        .addComponent(subirPeli)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subirPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subirPeliActionPerformed

	movieName = cbmovies.getSelectedItem().toString();

//	JOptionPane.showMessageDialog(rootPane, "La pelicula seleccionada es: "+movieName);
	boolean listo;
	
//	movieFunc = funcGroup.getSelection().getSelectedObjects().toString();

	if ( rbFunc1.isSelected()) {
		movieFunc = rbFunc1.getText();
	}else if ( rbFunc2.isSelected()) {
		movieFunc = rbFunc2.getText();
	}
	
	if ( rbdosd.isSelected() )
		movieSala = rbdosd.getText();
	else if (rbtresd.isSelected())
		movieSala = rbtresd.getText();
	else if (rbvip.isSelected())
		movieSala = rbvip.getText();

	movieEntradas = Integer.parseInt(numEntraSp.getValue().toString());
	
	listo = !(movieEntradas == 0 || movieName.contentEquals("-- selecione una --") || movieFunc.contentEquals("") || movieSala.contentEquals(""));

	if ( listo ){
		JOptionPane.showMessageDialog(null,"Usted escogió:\n"+"Pelicula: "+movieName, "Tickets Reservados", HEIGHT, currentImg);
//		InitView Inicio = new InitView(listo);
//		Inicio.setVisible(true);
//		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
//		this.dispose();
		new InitView(movieName, movieFunc, movieSala, movieEntradas, currentImg, listo).setVisible(true);
		this.setVisible(false);
	}else
		JOptionPane.showMessageDialog(null,"Todos los campos son obligatorios", "Tickets No Reservados", JOptionPane.ERROR_MESSAGE);
	
	
	
	System.out.println("Listo: "+listo);
    }//GEN-LAST:event_subirPeliActionPerformed

    private void cbmoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmoviesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmoviesActionPerformed

    private void cbmoviesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbmoviesItemStateChanged
      
	int movie = cbmovies.getSelectedIndex();
	
//	selectedMovie.setMovieIndex(cbmovies.getSelectedIndex()); 
//	ImageIcon currentImg = myMovies[selectedMovie.movieIndex].getImg();
	switch( movie ){
		case 1:
			currentImg = matrixImg;
			currentDesc = matrixDesc;
			break;
		case 2:
			currentImg = rpoImg;
			currentDesc = rpoDesc;
			break;
		case 3:
			currentImg = interstellarImg;
			currentDesc = interstellarDesc;
			break;
		case 4:
			currentImg = tndImg;
			currentDesc = tndDesc;
			break;
		default:
			currentImg = null;
			break;
	}
	
	labelPic.setIcon(currentImg);
	showdesc.setText(currentDesc);
    }//GEN-LAST:event_cbmoviesItemStateChanged

    private void rbFunc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFunc1ActionPerformed
       if (rbFunc1.isSelected() == true)
		rbFunc1.setFont(new Font ("Arial", 1,14));
	else
		rbFunc1.setFont(new Font ("Tahoma", 0,12));
    }//GEN-LAST:event_rbFunc1ActionPerformed

    private void rbFunc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFunc2ActionPerformed
       if (rbFunc2.isSelected() == true)
		rbFunc2.setFont(new Font ("Arial", 1,14));
	else
		rbFunc2.setFont(new Font ("Tahoma", 0,12));
    }//GEN-LAST:event_rbFunc2ActionPerformed

    private void rbdosdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdosdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdosdActionPerformed

    private void rbtresdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtresdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtresdActionPerformed

    private void numEntraSpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_numEntraSpStateChanged
//       int mynum = Integer.parseInt(numEntraSp.getValue().toString());
    }//GEN-LAST:event_numEntraSpStateChanged

    private void seeRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeRatingActionPerformed
       new favsFrame().setVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_seeRatingActionPerformed

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
			java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MovieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MovieFrame().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cbFuncsPan;
    private javax.swing.JComboBox<String> cbmovies;
    private javax.swing.JLabel descTitle;
    private javax.swing.JLabel entradTitle;
    private javax.swing.ButtonGroup funcGroup;
    private javax.swing.JLabel funcTitle;
    private javax.swing.JLabel labelPic;
    private javax.swing.JSpinner numEntraSp;
    private javax.swing.JLabel pelisTitle;
    private javax.swing.JRadioButton rbFunc1;
    private javax.swing.JRadioButton rbFunc2;
    private javax.swing.JRadioButton rbdosd;
    private javax.swing.JRadioButton rbtresd;
    private javax.swing.JRadioButton rbvip;
    private javax.swing.ButtonGroup salaGroup;
    private javax.swing.JLabel salaTitle;
    private javax.swing.JButton seeRating;
    private javax.swing.JLabel showdesc;
    private javax.swing.JButton subirPeli;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
