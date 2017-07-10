package Checkpoint3;

import java.util.ArrayList;

/**
 * Created by aharyadi on 7/9/17.
 */
public class NumRange {

    public static void main(String [] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(6);
        a.add(5);
        System.out.print(numRange(a,6,8));
    }

    public static int numRange(ArrayList<Integer> a, int b, int c) {
        int count = 0;
        for(int i = 0;i < a.size();i++){
            int sum=0;
            for(int j = i;j<a.size();j++){
                sum = sum + a.get(j);
                if(sum >=b && sum <=c){
                    count = count+1;
                }
                if(sum > c){
                    break;
                }
            }
        }
        return count;

    }
}
