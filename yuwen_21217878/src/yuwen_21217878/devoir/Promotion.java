package yuwen_21217878.devoir;

public class Promotion extends Devoir2_Etudiant {
	private int année;
	private double noote;
	

	
		// TODO Auto-generated constructor stub
	public Promotion(String name, String sex, int annee, double note) {
		super(name, sex, annee, note);
		année = annee;
		noote =note;
	
				
		// TODO Auto-generated constructor stub
	
	    }
	public void decision() {
		if (noote>=10) {
			System.out.println("Félicitation pour votre promotion en "+année+".");
			super.getDevoir2_Etudiant();
		
		}else {
			super.getDevoir2_Etudiant();
			System.out.println("Malheursement vous n'avez pas réussit à passer"+année+".");
		}
	

	}
	

}
