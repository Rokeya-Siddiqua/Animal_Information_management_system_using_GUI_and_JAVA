public abstract class Animal {
	private String ScientificName;
	private boolean isPet;
	
	public Animal(String scientificName, boolean isPet) {
		ScientificName = scientificName;
		this.isPet = isPet;
	}
	public String getScientificName() {
		return ScientificName;
	}
	public void setScientificName(String scientificName) {
		ScientificName = scientificName;
	}
	public boolean isPet() {
		return isPet;
	}
	public void setPet(boolean isPet) {
		this.isPet = isPet;
	}
	public abstract String eat();
	
	@Override
	public String toString() {
		return "Animal [ScientificName=" + ScientificName + ", isPet=" + isPet + "]";
	}
}
