package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel < 0 || tonerLevel > 100){
            this.tonerLevel = -1;
        }else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount < 1 || tonerAmount > 100){
            return -1;
        }else {
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }else {
                return this.tonerLevel += tonerAmount;
            }
        }
    }

    public int printPages(int pagesToPrint){
        if(duplex){
            System.out.println("Printing in duplex mode");
            this.pagesPrinted += pagesToPrint / 2;
            return  pagesToPrint / 2;
        } else {
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
