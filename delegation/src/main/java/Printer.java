public class Printer {
    // the "delegator"

    RealPrinter printer = new RealPrinter();

    // use the delegate
    void print() {
        printer.print(); // delegation
    }
}
