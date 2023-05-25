public class ProxyPrinter implements Printer{
    private Printer printer;

    @Override
    public void print(int amount) {
        if (amount <= 0) {
            System.out.println("You cannot print less then one \n");
            return;
        } else if (amount >= 500) {
            System.out.println(amount + "are to big to print \n");
            return;
        } else if (amount < 50) {
            printer = new CPrinter();
        } else {
            printer = new BWPrinter();
        }

        printer.print(amount);
    }
}
