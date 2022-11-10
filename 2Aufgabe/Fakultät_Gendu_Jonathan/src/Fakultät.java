public class Fakultät {

    //Statt Fakultät Summenfunktion
    public static void main(String[] args) {
        System.out.println(FakultätRe(3));
        System.out.println(FakultätIn(3));
    }

    public static int FakultätRe(int Zahl){
        if (Zahl <= 1){
            return 1;
        }
        else{
            return Zahl+FakultätRe(Zahl-1);
        }
    }

    public static int FakultätIn(int Zahl){
        int puffer = 0;
        if (Zahl <=1){
            return 1;
        }
        else {

            for (int i = 1; i <= Zahl; i++) {
                puffer = puffer + i;
            }
        }
        return puffer;
    }
}
