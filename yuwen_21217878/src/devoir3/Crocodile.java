package devoir3;

public class Crocodile extends Reptile implements Domesticable {

	public Crocodile(String type, int pattes) {
		super(type, pattes);
		// TODO Auto-generated constructor stub
	
	}
	public void move(){
		super.move();
		System.out.println("crocodile peut marcher et nager");
	}
	@Override
	public void domestiquer(String nom) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return null;
	}
}
