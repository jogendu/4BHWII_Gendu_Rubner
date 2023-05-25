public class Programm {
        public static void main(String[] args) {
            Printer printer = new ProxyPrinter();

            printer.print(0);
            printer.print(501);
            printer.print(3);

        }
}
