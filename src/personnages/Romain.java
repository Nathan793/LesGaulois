package personnages;

public class Romain extends Personnage {
	private Grade grade ;
	public Romain(String nom, int force ) {
		super(nom,force); 
	}

	@Override
	public String donnerAuteur() {
		return ("Le Romain");

	}
	public Grade getGrade() {
		return grade ;
	}

}
