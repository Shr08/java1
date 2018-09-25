package com.company;
enum House {
    Bedroom1(20),Bedroom2(22),Bedroom3(24),Bedroom4(26);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class ex9 {
    public static void main(String args[]){
        System.out.println("All House Prices");
        for (House h : House.values()) System.out.println(
                h + " costs " + h.getPrice() + " thousand dollars.");
    }
}