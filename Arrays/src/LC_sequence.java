import java.util.*;
public class LC_sequence {
    public int longestConsecutive(int[] nums) {
        int max=0;


        HashSet<Integer> a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }

        for(int num : a){
            if (!a.contains(num - 1)){
                int localMax=1;
                boolean c=true;
                int d=num;
                while(c){


                    if(a.contains(d+1)){
                        d++;
                        localMax++;


                    }
                    else{
                        c=false;
                    }

                }
                max=Math.max(localMax,max);}
        }
        return max;
    }
}
