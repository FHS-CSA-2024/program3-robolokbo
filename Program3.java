//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program{
    public static void main(String[] args){
        
        //declare variables
        int length = 0;
        int width = 0;
        int area = 0 ;
        int perimeter = 0;
        
        //creating my scanner and asking for user input
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = numScanner.nextInt();
        
        System.out.println("Enter the width: ");
        width = numScanner.nextInt();
        
        //print results
        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        
        System.out.println("The area is " + length*width);
        System.out.println("The perimeter is " + 2*length + 2*width);
    }
}



//Paste console output below:
/*
 * 
Enter the length: 
6
Enter the width: 
9
The length is 6
The width is 9
The area is 54
The perimeter is 1218

*/
