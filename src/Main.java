import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) {

       // showMenu();

        Patient patient = new Patient("Esdras","abeldiaz2307@gmail.com");
        System.out.println(patient);

        User user1 = new User("Abel Diaz","abel@abel.com") {
            @Override
            public void showDataUser() {
                System.out.println("Empleado del Hospital Mazatenango");
                System.out.println("Departamento: Ginecología");
            }
        };
        user1.showDataUser();

    }
}
