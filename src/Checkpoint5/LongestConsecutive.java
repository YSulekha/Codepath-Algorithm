package Checkpoint5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by aharyadi on 7/9/17.
 */
public class LongestConsecutive {

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(6);
        a.add(5);
        System.out.println(longestConsecutive(a));
    }

    public static int longestConsecutive(final List<Integer> a) {
        if(a.size() <=1){
            return a.size();
        }
        HashSet<Integer> conSet = new HashSet<>();
        for(int num:a){
            conSet.add(num);
        }
        int count = 1;
        for(int i = 0;i<a.size();i++){
            int n = a.get(i);
            if(!conSet.contains(n-1)){
                int curCount = 0;
                while(conSet.contains(n)){
                    curCount++;
                    n = n+1;
                }
                if(curCount > count){
                    count = curCount;
                }
            }
        }
        return count;
    }
}
