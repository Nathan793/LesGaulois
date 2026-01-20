package personnages;

public class Romain extends Personnage {

	@Override
	public String donnerAuteur() {
		return ("Le Romain");

	}

	public Romain(String nom, int force) {
		super(nom,force); 
	}

}
