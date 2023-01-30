package cote_week1;
import java.util.*;
import java.lang.Integer;
public class secret_map {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer=new String[n];
        for(int i=0;i<n;i++)
            answer[i]="";
        String[] arr1_str=new String[n];
        //String[] arr2_str=new String[n];
        for(int i=0;i<n;i++){
            System.out.println("arr1[i] = " + arr1[i]);
            System.out.println("arr2[i] = " + arr2[i]);
            arr1_str[i]=Integer.toBinaryString(arr1[i]|arr2[i]);
            System.out.println("arr1_str[i] = " + arr1_str[i]);
        }
       for(int i=0;i<n;i++){
           if(arr1_str[i].length()<n){
               for(int j=0;j<n-arr1_str[i].length();j++)
                   answer[i]+=" ";
           }
           for(int j=0;j<arr1_str[i].length();j++){
               if(arr1_str[i].charAt(j)=='0')
                   answer[i]+=" ";
               else
                   answer[i]+="#";
           }
           answer[i]=answer[i].replaceAll("\\s+"," ");
       }
        return answer;
    }

    public static void main(String[] args) {
        int n=6;
        int[]arr={46, 33, 33 ,22, 31, 50};
        int[]arr2={27 ,56, 19, 14, 14, 10};
        String str[]=solution(n,arr,arr2);
        for(String s:str)
            System.out.println("s = " + s);
    }
}
