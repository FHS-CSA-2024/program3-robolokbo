//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program{
    public static void main(String[] args){
        
        //declare variables
        int length = 0;
        int width = 0;
        
        //creating my scanner and asking for user input
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter the length: ");
        length = numScanner.nextInt();
        
        System.out.println("Enter the width: ");
        width = numScanner.nextInt();
        
        //calculate area and perimeter
        int area = length * width;
        int perimeter = 2*length + 2*width;
        
        //print results
        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter); // Fixed this code on 9/8/24
    }
}



//Paste console output below:
/*
 * 
Enter the length: 
143
Enter the width: 
82
The length is 143
The width is 82
The area is 11726
The perimeter is 450

*/
