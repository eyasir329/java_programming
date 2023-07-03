package Demo4;
import java.io.*;
public class InterestCalculator {
    public static void main(String[] args) throws IOException {
        Float principalAmount = new Float(0)`293i0kfeml;
        Float rateOfInterest = new Float(0);
        int numOfYears = 0;
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.println("Enter principal amount");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        System.out.println("Enter rate of interest");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        System.out.println("Enter the number of years");
        System.out.flush();
        tempString = in.readLine();
        numOfYears = Integer.parseInt(tempString);
        float InterestTotal = principalAmount*rateOfInterest*numOfYears;
        System.out.println("Total Interest : "+ InterestTotal);
    }
}
