package cote_week1;

import java.util.LinkedList;
import java.util.Queue;

public class dart_calc {
    public static double solution(String dartResult) {
        double answer = 0;
        String dart_int = dartResult.replaceAll("[^0-9]", " ");
        dart_int=dart_int.replaceAll("\\s+"," ");
        //System.out.println("dart_int = " + dart_int);
        String int_arr[]=dart_int.split(" ");
        int arr[]=new int[int_arr.length];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i< int_arr.length;i++){
            queue.add(Integer.parseInt(int_arr[i]));
        }
        String dart_opt=dartResult.replaceAll("[0-9]","");
        //System.out.println("dart_opt = " + dart_opt);
        double pre_val=0;
        double now_val=0;
        int sdt=0;
        char p;
        for(int i=0;i<dart_opt.length();i++) {
            p = dart_opt.charAt(i);
            if (p == '*') {
                answer -= pre_val;
                answer -= now_val;
                answer += (pre_val * 2);
                answer += (now_val * 2);
                now_val = (now_val * 2);
            } else if (p == '#') {
                answer -= (now_val * 2);
                now_val = (-now_val);
            } else {
                switch (p) {
                    case 'S':
                        sdt = 1;
                        break;
                    case 'D':
                        sdt = 2;
                        break;
                    case 'T':
                        sdt = 3;
                        break;
                }
                if (now_val != 0)
                    pre_val = now_val;
                now_val = Math.pow(queue.poll(), sdt);
                System.out.println("now_val = " + now_val);
                answer += now_val;
            }
        }
        return answer;
    }
}
