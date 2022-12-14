package model;

public class Patient extends User {


    private String birthday;
    private String blood;
    private double weight, height;

    public Patient(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente del Hospital Mazatenango");
        System.out.println("Emergencias");
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getWeight() {
        return weight + " Kg. ";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + " Mts. ";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: "+birthday+"\nWeight: "+getWeight()+"\nHeight: "+getHeight()+"\nBlood: "+blood;
    }
}
