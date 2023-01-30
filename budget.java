package cote_week1;

import java.util.ArrayList;
import java.util.Arrays;

public class budget {
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int count=0;
        for(int val:d){
            budget-=val;
            System.out.println("val = " + val);
            if(budget==0)
                return count+1;
            else if(budget<0)
                return count;
            count++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr[]={2,2,3,3};
        int budget=10;
        int s = solution(arr, budget);
        System.out.println("s = " + s);
    }
}
