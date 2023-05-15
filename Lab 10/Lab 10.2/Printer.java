public class Printer {
    private int tonerLever;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLever, boolean duplex) {
        if (tonerLever<=100 && tonerLever>=0){
        this.tonerLever = tonerLever;}
        else {tonerLever = -1;}
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount<=100 && tonerLever>0){
            if (this.tonerLever + tonerAmount >100){
                return -1;
            }
            else {this.tonerLever +=tonerAmount;
                return this.tonerLever;}}
        else {
            return -1;
        }
//        return tonerLever;
    }
    public int printPages(int pages){
        int pageToPrint = pages;
        if(this.duplex){
            pageToPrint = pages/2 + pages%2;
            System.out.println("Duplex mode");
        }
        this.pagesPrinted += pageToPrint;
        return pageToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
