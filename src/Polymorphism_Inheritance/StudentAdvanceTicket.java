/**
 * Created by Palko on 04/02/2016.
 */

package Polymorphism_Inheritance;
public class StudentAdvanceTicket extends AdvanceTicket {


    private int price;

    public StudentAdvanceTicket(int number){
        super(number);
    }

    public int getPrice(){

       if(getRandomBoolean()==true){
           return super.getPrice()/2;
       }
        else{
           return super.getPrice()/2;
       }
    }

    public String toString(){

        return "The ticket number"+this.number +" " + "****ID required***";
    }
}
