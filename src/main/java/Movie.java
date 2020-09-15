/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.ImageIcon;
/**
 *
 * @author karla
 */
public class Movie {
	int movieIndex = 0;
	String name = "";
	String description = "";
	int funcs[] = {1,2};
	ImageIcon img = new ImageIcon();

	public Movie(int movieIndex, String name, String description, int[] funcs, ImageIcon img) {
		this.movieIndex = movieIndex;
		this.name = name;
		this.description = description;
		this.funcs = funcs;
		this.img = img;
	}

	Movie() {
//		throw new UnsupportedOperationException("Not supported yet. Esta clase no"); //To change body of generated methods, choose Tools | Templates.
	}

	public int getMovieIndex() {
		return movieIndex;
	}

	public String getDescription() {
		return description;
	}

	public int[] getFuncs() {
		return funcs;
	}

	public ImageIcon getImg() {
		return img;
	}

	public String getName() {
		return name;
	}

	
	
	public void setMovieIndex(int movieIndex) {
		this.movieIndex = movieIndex;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public void setFuncs(int[] funcs) {
		this.funcs = funcs;
	}

	public void setImg(ImageIcon img) {
		this.img = img;
	}
	
	public boolean gotMovie(){
		boolean r = false;
		if (movieIndex == 0)
			r = true;
		return r;
	}
	
//	public void fillAtributes(){
//		Movie none, matrix, interstellar, readyplayerone, theneondemon ;	
//		matrix.setMovieIndex(1); 
//		matrix.setName("Matrix");
//		matrix.setImg(matrixImg);
//		matrix.setDescription("Thomas A. Anderson (Keanu Reeves) es programador informático de día y"+
//			" un hacker llamado Neo de noche. Lleva toda su vida intuyendo que hay algo más,"+
//			" que hay algo que falla y esa duda se ve reafirmada con un mensaje"+
//			"recibido en su ordenador: «Matrix te posee».");
//		
//		interstellar.setMovieIndex(3);
//		interstellar.setName("Interstellar");
//		interstellar.setImg(interstellarImg);
//		interstellar.setDescription("A mediados del siglo XXI, la destrucción de las cosechas en la Tierra"+
//			" ha hecho que la agricultura sea cada vez más difícil y se vea amenazada la supervivencia"+
//			"de la humanidad. Joseph Cooper, viudo, exingeniero y piloto de la NASA, dirige una granja "+
//			"con su suegro Donald, su hijo Tom y su hija Murphy, quien cree que su habitación está "+
//			"embrujada por un poltergeist.");
//		
//		readyplayerone.setMovieIndex(2);
//		readyplayerone.setName("Ready player one");
//		readyplayerone.setImg(rpoImg);
//		readyplayerone.setDescription("La historia sigue los pasos del joven Wade Owen Watts, "+
//			"un jugador de videojuegos del año 2045 que, como el resto de la humanidad,"+
//			"prefiere el metauniverso de realidad virtual OASIS al cada vez más sombrío mundo real.");
//		
//		theneondemon.setMovieIndex(4);
//		theneondemon.setName("the neon demon");
//		theneondemon.setImg(tndImg);
//		theneondemon.setDescription("Thomas A. Anderson (Keanu Reeves) es programador informático de día y"+
//			" un hacker llamado Neo de noche. Lleva toda su vida intuyendo que hay algo más,"+
//			" que hay algo que falla y esa duda se ve reafirmada con un mensaje"+
//			"recibido en su ordenador: «Matrix te posee».");
//		
//	}
	
}
