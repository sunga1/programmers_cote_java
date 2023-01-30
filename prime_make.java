package cote_week1;

public class prime_make {
    public static int isPrime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return 0;
        }
        return 1;
    }
    public static int solution(int[] nums) {
        int answer = 0;
        int add_n=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    add_n=nums[i]+nums[j]+nums[k];
                    if(isPrime(add_n)==1)
                        answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int s = solution(nums);
        System.out.println("s = " + s);
    }
}
