public class Dog extends Animal implements GenerallyFound {
	private double Weight;
	private String Species;
	
	public Dog(String scientificName, boolean isPet, double weight, String species) {
		super(scientificName, isPet);
		Weight = weight;
		Species = species;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	public String eat()
	{
		return "eat : chicken, beef, lamb, fish" ;
	}
	public String eat(String n) {
		return "FavoriteFood : "+n ;
	}
	public String found() {
		return "Generally Found : in cold area" ;
	}
	@Override
	public String toString() {
		return "Dog "+"\n"
		+ "Weight=" + Weight +"\n"
		+ "Species=" + Species +"\n"
		+ "ScientificName=" + getScientificName()+"\n"
		+ "isPet=" + isPet()+"\n"
		+this.eat()+"\n"
		+this.eat("bone") +"\n"
		+this.found() ;
	}
	
}
