public class GPrinter implements Printer{

    @Override
    public void print(int amount) {
            System.out.println("A very big task for : " + amount + " pages\n");
        }

}
