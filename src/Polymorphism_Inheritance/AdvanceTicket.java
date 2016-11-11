package Polymorphism_Inheritance;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Palko on 04/02/2016.
 */
public class AdvanceTicket extends Ticket {



    public AdvanceTicket(int number) {
        super(number);
    }

    private int priceBefore=30;
    private int priceAfter=40;

    public int getPrice() {
        if (getRandomBoolean() == true) {
           return priceBefore;
        } else {
            return priceAfter;
        }

    }

    public boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }


}