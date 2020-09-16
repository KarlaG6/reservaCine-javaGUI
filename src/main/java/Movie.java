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
	
	
}
