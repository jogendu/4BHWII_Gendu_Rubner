import Pattern.Drucker;

public class Main {


        public static void main(String[] args) {


            Drucker UserAccess = Drucker.getDrucker();
            Drucker UserAccess2 = Drucker.getDrucker();

            UserAccess.Drucken();
            UserAccess2.Drucken();

            System.out.println(UserAccess.Drucken());

            System.out.println(UserAccess2.Drucken());



        }
    }

