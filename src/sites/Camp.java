package sites;
import personnages.Gaulois;
public class Camp {
	protected String chef;
	private String[] romain = new String[80];
	
	
	public Camp(String chef) {
		this.chef=chef;
	}
	
	@Override
	public String donnerChef() {
		return (chef);
	}
	
	

}
