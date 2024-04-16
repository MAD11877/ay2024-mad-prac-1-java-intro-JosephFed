import java.util.Scanner;
import java.util.ArrayList;

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
    ArrayList<Integer> numberList = new ArrayList<Integer>();
    int num1 = in.nextInt();
    for(int i = num1; i>0;i--){
      int num = in.nextInt();
      numberList.add(num);
    }
    int maxCount=0;
    int maxNum = 0;
    for (int i = 0; i < numberList.size(); i++){
      int count = 0;
      for(int j = 0; j < numberList.size(); j++){
        if (numberList.get(j) == numberList.get(i)){
          count++;
        }
      }
      if (count>maxCount){
        maxCount = count;
        maxNum = numberList.get(i);
      }
    }
    System.out.println(maxNum);
  }
}
