public class Main {
    public static void main (String [] args){
       Printer printer = new Printer(50, true);
        System.out.println("Page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Page printed was " + pagesPrinted + " new total count printer: " + printer.getPagesPrinted());
    }
}
