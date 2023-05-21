package designpattern.delegation;

/**
 * ClassName: Main
 * Description:
 *
 * @Author: shenjiaqi
 * 编辑于：2023-05-21 下午2:24   @Version 1.0        描述
 */

class RealPrinter {
    // the "delegate"
    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
    // the "delegator"
    RealPrinter p = new RealPrinter(); // create the delegate

    void print() {
        p.print(); // delegation
    }
}

public class Main {
    // to the outside world it looks like Printer actually prints.
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}
