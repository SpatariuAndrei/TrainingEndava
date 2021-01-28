import java.util.Scanner;

public class Curs1 {

//Ex1

public String  sum (){
    Scanner myInput = new Scanner(System.in);
    int a;
    int b;

    System.out.print( "Enter first integer: " );
    a = myInput.nextInt();
    System.out.print( "Enter second integer: " );
    b = myInput.nextInt();


    int sum =  a+b;

    return ("Suma este " + sum);

}
//EX 3
 public String divideResult(){

Scanner myInput = new Scanner(System.in);



    int a;
    int b;

    System.out.print( "Enter first integer: " );
    a = myInput.nextInt();
    System.out.print( "Enter second integer: " );
    b = myInput.nextInt();

    int remainder = a % b;
    int divide = a/b;

    String result = "Rezultatul impartirii este:  " + divide + "  Rest  " + remainder;

    return result;


}
//ex2
    public String printMaxNumber() {

        Scanner myInput = new Scanner(System.in);



        int a;
        int b;

        System.out.print( "Enter first integer: " );
        a = myInput.nextInt();
        System.out.print( "Enter second integer: " );
        b = myInput.nextInt();

        if (a>b) {
           return ("Maximul dintre a si b este: " + a);
        } else
            return ("Maximul dintre a si b este: " + b);

    }
//EX 4
public String printPositiveAndNegative(){


    Scanner myInput = new Scanner(System.in);



    int a;
    int b;

    System.out.print( "Enter first integer: " );
    a = myInput.nextInt();
    System.out.print( "Enter second integer: " );
    b = myInput.nextInt();


    if (a>=0 && b>=0){
       return (a +  " este numar pozitiv " + b + " este numar pozitiv");



    }

    else if (a>=0 && b<0){
        return (a +  " este numar pozitiv" + b + " este numar negativ");
    }
    else if (a<0 && b >= 0){
        return (a +  " este numar negativ " + b + " este numar pozitiv");
    }
    else  return (a +  " este numar negativ " + b + " este numar negativ");
}
//ex 5
    public int countPositiveAndNegative(){
        Scanner input= new Scanner(System.in);

        int negative=0;
        int positive =0;

        System.out.print("Enter an integer (Program ends if enter 0): ");
        int data = input.nextInt();

        while (data !=0) {

            System.out.print("Enter an integer (Program ends if enter 0): ");


            if (data < 0){
                negative++;
            }
            else if (data > 0){
                positive++;
            }
           data=input.nextInt();
        }
        System.out.println(positive + " positive numbers");
        System.out.println(negative + " negative numbers");
        return data;

    }
   // ex 5 do while
    public int countPositiveAndNegativeDoWhile(){
        Scanner input= new Scanner(System.in);

        int negative=0;
        int positive =0;

        System.out.print("Enter an integer (Program ends if enter 0): ");
        int data = input.nextInt();

        do {

            System.out.print("Enter an integer (Program ends if enter 0): ");


            if (data < 0){
                negative++;
            }
            else if (data > 0){
                positive++;
            }
            data=input.nextInt();
        }
        while (data !=0);

        System.out.println(positive + " positive numbers");

       System.out.println(negative + " negative numbers");

        return data;

    }

    public int countInputNumbers(){
        Scanner input= new Scanner(System.in);


        int count =0;

        System.out.print("Enter an integer (Program ends if enter 0): ");
        int data = input.nextInt();

        do {

            System.out.print("Enter an integer (Program ends if enter 0): ");


            if (data < 0){
                count++;
            }
            else if (data > 0){
                count++;
            }
            data=input.nextInt();
        }
        while (data !=0);

        System.out.println("Au fost introduse  " +  count + " valori");

        //  System.out.println(negative + " negative numbers");

        return data;
    }
    public int countInputNumbersWhileMethod(){
        Scanner input= new Scanner(System.in);


        int count =0;

        System.out.print("Enter an integer (Program ends if enter 0): ");
        int data = input.nextInt();

        while (data !=0){

            System.out.print("Enter an integer (Program ends if enter 0): ");


            if (data < 0){
                count++;
            }
            else if (data > 0){
                count++;
            }
            data=input.nextInt();
        }


        System.out.println("Au fost introduse  " +  count + " valori");

        //  System.out.println(negative + " negative numbers");

        return data;
    }
    //EX 6

    public int sumOfInputValues(){


        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer (Program ends if enter 0): ");

        int count ;
        int sum = 0;
        count = in.nextInt();

     while (count  != 0)    {

         sum = count + sum;
         count++;

         count = in.nextInt();
        }

return sum;
}

    }

















