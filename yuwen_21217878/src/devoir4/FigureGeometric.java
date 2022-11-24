package devoir4;

public abstract class FigureGeometric {
	protected String color = "red";
	
	public FigureGeometric (String co) {
		color = co;
	
	}
	public String getColor() {
		return this.color;
	}
	/**
	 * calcul de la surface et du perimetre d'une figure geometrique
	 * @return
	 */
	public abstract double perimetre();
	public abstract double surface();

}
