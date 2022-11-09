package yuwen_21217878.devoir;


public class Devoir2_Etudiant {
    private String name;
    private String sex;
    private int age;
    private int note;

    public Devoir2_Etudiant(String name, String sex, int age, int note) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    
    public String toString() {
        return "etudiants msg:" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '.'+
                ", age=" + note+
                '.';

    }
}




