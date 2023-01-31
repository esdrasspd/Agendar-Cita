package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {


    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>(); //ArrayList == object
    public Doctor(String name, String email){
        super(name, email);
    }



    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Add cites in class AvailableAppointment using ArrayList

    public void addAvailableAppointment(String date, String time){ //Method for add parameters in class AvailableAppointment

        availableAppointments.add(new Doctor.AvailableAppointment(date, time)); //Using ArrayList with method constructor.
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
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");//formatea fecha

        public AvailableAppointment(String date, String time) {

            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
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

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return super.toString()+"Available: Appointments \n Date: "+date+"\n Time: "+time;
        }
    }

}
