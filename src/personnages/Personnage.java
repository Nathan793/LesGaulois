package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;
	protected String Auteur;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	//public int getForce() {
		//return force ;
	//}
	
	protected abstract String donnerAuteur();

	public void parler(String texte) {
		System.out.println(donnerAuteur() + nom + "  : « " + texte + " ».");
	}

	public void frapper(Romain romain) {
		System.out.println(donnerAuteur() + " " + nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public void recevoirCoup(int forceCoup) {
		force = force - forceCoup;

		if (force < 1) {
			force = 0;
			parler("J'abandonne... ");

		} else {
			parler("Aïe !");
		}

	}

}
