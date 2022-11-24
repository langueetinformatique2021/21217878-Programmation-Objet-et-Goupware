package devoir4;

public class Cercle extends FigureGeometric implements Comparable<Cercle> {
	private double rayon;

	public Cercle(String co,double r) {
		super(co);
		this.rayon =r;
		// TODO Auto-generated constructor stub
	}
	public double getRayon() {
		return rayon;
	}

	@Override
	public int compareTo(Cercle o) {
		// TODO Auto-generated method stub
		return (int)(this.getRayon()-o.getRayon());
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return Math.PI*2*this.rayon;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI*this.rayon*this.rayon;
	}
	public void compare(Cercle o) {
		String a,b;
		if (this.compareTo(o)>0) {
			a = "\n the first cercle is bigger than the second one";
			}else if(this.compareTo(o)==0) {
				a = "\n the first cercle has the same size as the seconde one";
			}else { a="\n the first cercle is smaller than the second one";
					
			}
		if((this.getColor()).equals(o.getColor())) {
			b="\n they have the same color";
		}else { b="\n they don't have the same color";}
	
		System.out.println(a);
		System.out.println(b);
	}
	public void afficher() {
		System.out.println("rayon:"+this.getRayon());
		System.out.println("perimetre:"+this.perimetre());
		System.out.println("surface:"+this.surface());
		
				
		
	}

}
