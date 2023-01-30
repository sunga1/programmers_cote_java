package cote_week1;
import java.util.*;
public class level1_test {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long>arr=new ArrayList<>();
        while(n>10){
            arr.add(n%10);
            n/=10;
        }
        arr.add(n);
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr.size());
        for(int i=0;i<arr.size();i++){
            answer+=arr.get(i)*Math.pow(10,arr.size()-i-1);
        }
        System.out.println(answer);
        return answer;
    }
}
