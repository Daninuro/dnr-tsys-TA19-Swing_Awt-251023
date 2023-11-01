package Act2;

import java.util.ArrayList;

public class Peliculas {
	
	ArrayList<String> peliculas = new ArrayList<String>();
	
	public Peliculas() {}
	
	public void insertaPelicula(String peli) {
		peliculas.add(peli);
	}

	public ArrayList<String> getPeliculas() {
		return peliculas;
	}
}