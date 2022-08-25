package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Patient;

public class UIMenu {

    public static final String[] MONTHS = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment\n");
                    for (int i = 0; i < 12; i++) {
                        System.out.println(i+1 +". "+ MONTHS[i]+"\n");
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez","alejandro@gmail.com"));
        doctors.add(new Doctor("Karen Sosa","karensosa@gmail.com"));
        doctors.add(new Doctor("Esdras Sapon","esdrasspd2004@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahi Salgado","anahi@gmail.com"));
        patients.add(new Patient("Roberto Rodriguez","roberto@gmail.com"));
        patients.add(new Patient("Carlos Sanchez","carlos@gmail.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: [example@gmail.com] ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){

            }
            if(userType == 2){

            }

        }while(!emailCorrect);
    }

}
