public class BWPrinter implements Printer{
    @Override
    public void print(int amount) {
        System.out.println("A decent task with " + amount + " pages [BLACK/WHITE]\n");
    }
}
