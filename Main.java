import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> Numbers = new ArrayList<Integer>();
        System.out.println("Input 6 numbers to add to the array Type Done To exit");
        int numbers = 0;
      do {
        numbers = scan.nextInt();
        // will add numbers
        Numbers.add(numbers);
      } while(scan.hasNextInt());
                // will sort
                Collections.sort(Numbers);                
                // first get the the value of last sorted element
                 int lastNumber = Numbers.getLast();
                 // get the index of the lastnumber
                 int last = Numbers.indexOf(lastNumber);
                 // then get the index - 1 to get the second largest? 
                 int SecondLargest = last - 1;
                 // adn then get the value of that
                 int value = Numbers.get(SecondLargest);
                 // sorted arraylist
                 System.out.println("Sorted: "+Numbers);
                 // the value
                 System.out.println("Second Largest Value: "+value);
         
            }
    }

