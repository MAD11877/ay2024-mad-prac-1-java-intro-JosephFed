import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<int> numberList = new ArrayList<int>();
    System.out.println("Enter an integer");
    int num1 = in.nextInt();
    numberList.add(num1);
    for(i = num1; num1>0;i--){
      int num = in.nextInt();
      numberList.add(num);
    }
    for (int i = 0; i < numberList.length; i++){
      
    }
  }
}
