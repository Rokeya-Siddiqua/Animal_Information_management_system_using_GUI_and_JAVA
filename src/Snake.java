public class Snake extends Animal implements GenerallyFound{
	private String SnakeClass;
	private boolean isPoisonous;
	
	public Snake(String scientificName, boolean isPet, String class1, boolean isPoisonous) {
		super(scientificName, isPet);
		SnakeClass = class1;
		this.isPoisonous = isPoisonous;
	}
	public String getSnakeClass() {
		return SnakeClass;
	}
	public void setSnakeClass(String snakeClass) {
		SnakeClass = snakeClass;
	}
	public boolean isPoisonous() {
		return isPoisonous;
	}
	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}
	public String eat()
	{
		return "eat : insects, rodents or birds";
	}
	public String eat(String n) {
		return "FavoriteFood : "+n ;
	}
	public String found() {
		return "Generally Found : in water";
	}
	@Override
	public String toString() {
		return "Snake "+"\n"
		+ "Class=" + SnakeClass +"\n"
		+ "isPoisonous=" + isPoisonous +"\n"
		+ "ScientificName=" + getScientificName() +"\n"
		+ "isPet=" + isPet() +"\n"
		+this.eat() +"\n"
		+this.eat("pupae, or eggs, of ants and centipedes") +"\n"
		+this.found();
	}
	
}//
