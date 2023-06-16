package clg_pr_15_to_23;

import java.util.Enumeration;

public class pr_21 {
   public static double average(String[] values){
        int count=0;
        double sum = 0;

        for (String value : values){
            double number = Double.parseDouble(value);
            sum = sum + number;
            count++;
        }

        if(count == 0){
            return 0;
        }
        double ans = sum/count;
        return ans;

    }
    public static void main(String[] args) {
        String[] values = { "10.2", "5.87", "7.5", "6.8", "4.2" };

        double avg = average(values);
        System.out.println("Average:- " + avg);

    }
}
