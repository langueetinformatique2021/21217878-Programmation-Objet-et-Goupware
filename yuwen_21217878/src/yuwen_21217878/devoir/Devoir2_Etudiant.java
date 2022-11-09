package yuwen_21217878.devoir;


public class Devoir2_Etudiant {
    private String name;
    private String sex;
    private int annee;
    private double note;

    public Devoir2_Etudiant(String name, String sex, int annee, double note) {
        this.name = name;
        this.sex = sex;
        this.annee = annee;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public double getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    
    public String toString() {
        return "etudiants msg:" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + annee +
                '.'+
                ", age=" + note+
                '.';

    }

	public void getDevoir2_Etudiant() {
		// TODO Auto-generated method stub
		
	}


	}





