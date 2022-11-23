package devoir4;

import java.util.*;
import java.util.GregorianCalendar;

public class Calendar2 extends GregorianCalendar {
	
	private boolean cours;
	
	private static final long serialVersionUID = 1L;
	public Calendar2() {
		Date date = new Date();
		this.setTime(date);	
	}
	
	/** affiche la date et l’heure de la création de l’objet */
	public void creation() {
		if (this.get(Calendar.HOUR_OF_DAY)>9 && this.get(Calendar.HOUR_OF_DAY)<12){
		cours = true;
		} else if (this.get(Calendar.HOUR_OF_DAY)==9 && this.get(Calendar.MINUTE)<30){
			cours = true;
			} 
		  else{
			cours = false;
		}
		
		
		System.out.println("TIME: " + this.getTime());
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		System.out.println("actueltime: " + calendar.getTime());
	}
	
	/** affiche le nombre de secondes depuis la création de l’objet */
	public void duree() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		long nbSeconde = (calendar.getTimeInMillis()- this.getTimeInMillis()) / 1000;
		System.out.println("nbSeconde " + nbSeconde);
		
	}		

}
