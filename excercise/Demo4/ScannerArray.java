package Demo4;
import java.util.*;
public class ScannerArray {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        System.out.println("Enter the input");
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> l = new ArrayList<Integer>();
        while(in.hasNextInt()){
            l.add(in.nextInt());
        }
        for(int i = 0;i<l.size();i++){
            sum = sum + l.get(i);
        }
        avg = sum/(l.size());
        System.out.println("Average: "+avg);
    }
}