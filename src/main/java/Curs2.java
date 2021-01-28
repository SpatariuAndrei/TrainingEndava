import java.util.Arrays;
import java.util.Scanner;

public class Curs2 {


public String [] duplicateArray(){

    String[] my_array = {"Andrei", "Ionut", "Ionut", "IonuT", "iOnut", "iONUT", "oiu"};

        for (int i = 0; i < my_array.length-1; i++)
    {
        for (int j = i+1; j < my_array.length; j++)
        {
            if( (my_array[i].equals(my_array[j])) && (i != j) )
            {
                System.out.println("Duplicate Element is : "+my_array[j]);
            }
        }



}
        return my_array;
}

    public int[] reverseArray(){
        int[] my_array1 = {1,2,3,4,5,6,7,8};

        System.out.println("Original array : "+ Arrays.toString(my_array1));
        for(int i = 0; i < my_array1.length/2; i++)

        {
            int a = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = a;
        }
        System.out.println("Reverse array : "+Arrays.toString(my_array1));
        return my_array1;
    }
    public String readPopescu (){


        String n[]= new String[20];
        int i;
        String nume="Popescu";
        int count=0;
        Scanner myInput = new Scanner( System.in );
        System.out.println("Please enter how many names!");
        i = myInput.nextInt();
        int b=0;
        System.out.print("Introduceti numele: ");
        do {
        n[b] = myInput.next();
        b++;
        }while (b<i);
        for (int t=0;t<b;t++) {
        if (n[t].equals(nume)) {
        count++;


        }

        }return ("Numele "+nume+" s-a citit de "+count+" ori");



}}