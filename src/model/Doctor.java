package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {


    private String speciality;
    public Doctor(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital Mazatenango\n");
        System.out.println("Departamento de Embarazo\n");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Add cites in class AvailableAppointment using ArrayList
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>(); //ArrayList == object
    public void addAvailableAppointment(Date date, String time){ //Method for add parameters in class AvailableAppointment
        availableAppointments.add(new AvailableAppointment(date, time)); //Using ArrayList with method constructor.
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){ //return cites
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: "+speciality+"\n Available "+ availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getName() {
            return time;
        }

        public void setName(String name) {
            this.time = name;
        }

        @Override
        public String toString() {
            return super.toString()+"Available: Appointments \n Date: "+date+"\n Time: "+time;
        }
    }

}
