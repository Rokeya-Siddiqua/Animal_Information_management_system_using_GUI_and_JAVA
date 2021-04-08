public class Horse extends Animal implements GenerallyFound{
	private int age;
	private double speed;
	
	public Horse(String scientificName, boolean isPet, int age, double speed) {
		super(scientificName, isPet);
		this.age = age;
		this.speed = speed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String eat()
	{
		return "eat : grass,hay,fruits,vegetables" ;
	}
	public String eat(String n) {
		return "FavoriteFood : "+n ;
	}
	public String found() {
		return "Generally Found : in in wild area";
	}
	@Override
	public String toString() {
		return "Horse "+"\n"
		+ "age=" + age +"\n"
		+ "speed=" + speed +"\n"
		+ "ScientificName=" + getScientificName() +"\n"
		+ "isPet="+ isPet() +"\n"
		+ this.eat()+"\n"
		+this.eat("apple slices, carrots") +"\n"
		+this.found();
	}
}
