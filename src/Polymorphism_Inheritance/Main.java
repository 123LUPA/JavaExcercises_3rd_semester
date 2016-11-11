
package Polymorphism_Inheritance;

public class Main {

    public static void main(String[] args) {


        Ticket[] t = {new WalkupTicket(1), new AdvanceTicket(2), new StudentAdvanceTicket(3)};


        for (int i = 0; i < t.length; i++) {

            System.out.println(t[i].toString() + " " + "costs" + " " + t[i].getPrice());


        }


    }
}
