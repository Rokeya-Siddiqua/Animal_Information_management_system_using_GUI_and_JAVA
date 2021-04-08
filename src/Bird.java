public class Bird extends Animal implements GenerallyFound{
	private String color;
	private boolean canFly;
	
	public Bird(String scientificName, boolean isPet, String color, boolean canFly) {
		super(scientificName, isPet);
		this.color = color;
		this.canFly = canFly;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public String eat()
	{
		return "eat : seeds, nuts, or dried fruits" ;
	}
	public String eat(String n) {
		return "FavoriteFood : "+n ;
	}
	public String found() {
		return "Generally Found : in forest";
	}
	@Override
	public String toString() {
		return "Bird "+"\n"
		+ "color=" + color+"\n" 
		+ "canFly=" + canFly +"\n"
		+ "ScientificName=" + getScientificName()+"\n"
		+ "isPet=" + isPet() +"\n"
		+this.eat()+"\n"
		+this.eat("chips, millet, safflower, cracked corn, mealworms") +"\n"
		+this.found();
	}

}
