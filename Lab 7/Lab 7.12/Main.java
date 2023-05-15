package com.NamTQ;

public class Main {
    public static void main (String[] args){


    Bank bank = new Bank("Vietcombank");
    bank.addBranch("Ben Thanh");
    bank.addCustomer("Ben Thanh", "Thuy Tien", 14.50);
    bank.addCustomer("Ben Thanh", "Dam Vinh Hung", 29.69);
    bank.addCustomer("Ben Thanh", "Hoai Linh", 32.05);

    bank.addBranch("Ham Nghi");
    bank.addCustomer("Ham Nghi", "Den Vau", 5);
    bank.addCustomerTransaction("Ben Thanh","Thuy Tien", 12.23);
    bank.addCustomerTransaction("Ben Thanh", "Dam Vinh Hung", 10.15);
    bank.listCustomers("Ben Thanh", true);
    bank.listCustomers("Ham Nghi",true);
    }
}
