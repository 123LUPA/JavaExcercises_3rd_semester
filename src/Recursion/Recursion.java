
package Recursion;
/**
 * Created by Palko on 09/04/2016.
 */
public class Recursion {




    int index=0;
    int indexNum=1;
    int indexDup=0;
    int indexWriteQuere=0;
    int n=1;
    int indexMultiplyEvens=2;


    double numbers[] = new double[20];
    public void starString(int a) {   //CH12 EX01

        double value = Math.pow(2, a);

        if (value < 0) {
            throw new IllegalArgumentException();
        }
        else if(index==value){

            System.out.println("-"+Math.pow(2,a));

            }
        else{
            System.out.print("*");
            index++;
            starString(a);

        }
    }

    public void writeNums(int integer) { //CH12 EX02

        if (integer < 0) {
            throw new IllegalArgumentException();

        }


        else if(indexNum==integer){
            System.out.println(indexNum);
        }

         else {

            System.out.print(indexNum + ", ");
            indexNum++;

            writeNums(integer);



        }
    }


    ////CH12 EX03


        public void writeSequence(int number){

          if(number<0){
              throw new IllegalArgumentException();
          }
          else if(number==0){
              System.out.print("");
          }
            else{
                System.out.print(number + " ");
                writeSequence(number-1);
                System.out.print(number+" ");
            }


            }


        public void doubleDigit(int number) { //CH12 EX04

            String numberString = String.valueOf(number);
            int size = numberString.length();

            if (size == indexDup) {
                System.out.println(" =" + number);
            } else if (number == 0) {
                System.out.println(number);
            } else if (number < 0) {

                char dup = numberString.charAt(indexDup);

                System.out.print(dup + "" + dup);

                indexDup++;

                doubleDigit(number);

            } else {

                char dup = numberString.charAt(indexDup);

                System.out.print(dup + "" + dup);

                indexDup++;

                doubleDigit(number);


            }
        }

                //CH12 EX05
                public void writeBinary(int number){
                    int binary[] = new int[25];
                    int index = 0;
                    if(number>0){
                        binary[index++] = number%2;
                        number = number/2;
                        writeBinary(number);


                    }
                    for(int i = index-1;i >= 0;i--){
                        System.out.print(binary[i]);
                    }
                }


                //CH12 EX06
                public void writeSqueres(int number){



                    double value=Math.pow(n,2);

                    if(number==indexWriteQuere){
                        System.out.println();
                    }
                    else{
                        if(n%2==0) {
                            numbers[indexWriteQuere] = value;
                            indexWriteQuere++;
                            n++;
                            writeSqueres(number);


                        }

                        else{
                            numbers[0] = value;
                            indexWriteQuere++;
                            n++;
                            writeSqueres(number);


                        }



                    }
                }



    //CH12 EX07
    int indexChar=0;
    public void writeChar(int number){

        if(indexChar==number){
            System.out.println("");
        }
        else if(number<0){

            throw new IllegalArgumentException();

        }
        else if(number%2==0 &&indexChar==0 ){
            System.out.println("<**>");
            indexChar++;
            writeChar(number);
        }
        else{
            if(indexChar==0) {
                System.out.print("<*>");
                indexChar++;
                writeChar(number);
            }

        }


    }


    //CH12 EX08
    int multiplication=1;
    int followingNum=0;
        public void multiplyEvens(int number){ //CH12 EX09


            if(number<0){
                throw new IllegalArgumentException();
            }

            if(followingNum==number ){
                System.out.println(multiplication);

            }

            else {
                multiplication*=indexMultiplyEvens;
                indexMultiplyEvens+=2;
                followingNum++;

                multiplyEvens(number);
            }

        }

    //CH12 EX9

    float e =0;
    public void sumTo(float number){

        if(number<0) {
            throw new IllegalArgumentException();
        }
        if(number==0){
            System.out.println(e);

        }

        else{
            e+=1/number;
            sumTo(number-1);

        }

    }



    //CH12 EX10

    int indexRepeat=0;
    public void repeat(String s, Integer n){//CH12 EX10

        if(n==0){
            System.out.println("");
        }
        else if(indexRepeat==n){
            System.out.println("");
        }
        else {

            System.out.println(s);
            indexRepeat++;
            repeat(s, n);
        }
    }

    int result;
    public static int findFactorail(int num){

        if(num==0) {
            return 1;
        }
        else {
            int result = num * findFactorail(num - 1);
            return result;
        }
    }

    int fib(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else return( fib(n-1) + fib(n-2));
    }

}













