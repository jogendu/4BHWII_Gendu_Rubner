package Pattern;

public class Drucker {
        private volatile static Drucker instance;
        //Brother ist eine Instanz von der Klasse Singleton.Pattern.Drucker


        private Drucker(){
            // dass wir keine Instanz erzeugen können außerhalb dieser Klasse
        }

        public static Drucker getDrucker(){
            if (instance == null) {
                synchronized (Drucker.class) {
                    if (instance == null)
                        instance = new Drucker();
                }
            }
            return instance;
        }


        public static String Drucken(){

            String drucken = "ich bin die Instanz" + Drucker.getDrucker();
            return drucken;
        }


    }
