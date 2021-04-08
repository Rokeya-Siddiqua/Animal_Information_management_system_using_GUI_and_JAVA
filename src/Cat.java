public class Cat extends Animal implements GenerallyFound{
	private int paws;
	private boolean hasTail;
	
	public Cat(String scientificName, boolean isPet, int paws, boolean hasTail) {
		super(scientificName, isPet);
		this.paws = paws;
		this.hasTail = hasTail;
	}
	public int getPaws() {
		return paws;
	}
	public void setPaws(int paws) {
		this.paws = paws;
	}
	public boolean isHasTail() {
		return hasTail;
	}
	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}
	@Override
	public String eat()
	{
		return "eat : meat,fish,egg " ;
	}
	public String eat(String n) {
		return "FavoriteFood : "+n ;
	}
	public String found() {
		return "Generally Found : in home";
	}
	@Override
	public String toString() {
		return "Cat "+"\n"
		+"paws=" + paws + "\n"
		+"hasTail=" + hasTail + "\n"
		+ "ScientificName=" + getScientificName()+ "\n"
		+ "isPet=" + isPet()+"\n"
		+this.eat() +"\n"
		+this.eat("milk") +"\n" 
		+this.found();
	}	
}
