import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class Lab1Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] id = {1234, 2234, 3234, 4234, 5234};
        int[] d = {12, 7, 6, 14, 22};
        
        int largestIndex = 0;
        int largest = Integer.MIN_VALUE;
        //System.out.println(largest);
        
        largestIndex = 0;
        for(int i = 0; i < d.length; i++){
            if(d[i] > d[largestIndex])
                largestIndex = i;
        }// end for
        
        System.out.println(id[largestIndex]);
        
        System.out.println("end of program");
    }
}
