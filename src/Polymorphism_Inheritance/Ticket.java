/**
 * Created by Palko on 04/02/2016.
 */

package Polymorphism_Inheritance;
public abstract class Ticket {

    int number;

    public Ticket(int number) {

        this.number=number;
    }

    public abstract int getPrice();


    public String toString(){

        return "The ticket number"+this.number;
    }







}



