package Checkpoint2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by salse on 7/4/17.
 */
public class Prettyprint {

    public static void main(String [] args){
        Prettyprint p = new Prettyprint();
        ArrayList<ArrayList<Integer>> res = p.prettyPrintM(4);
        for(ArrayList<Integer> a:res){
            for(int i=0;i<a.size();i++){
                System.out.print(a.get(i)+" ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> prettyPrintM(int a) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        for(int i = a;i>0;i--){
            int j = a - i;
            Integer res[] = new Integer[(a*2)-1];
            for(int k=0;k<a;k++){
                if(j>0){
                    res[k] = a-k;
                    res[(a*2)-2-k] = a-k;
                    j = j-1;
                }
                else{
                    res[k] = i;
                    res[(a*2)-2-k] = i;
                }
            }
            ArrayList<Integer> r = new ArrayList<Integer>(Arrays.asList(res));
            result.add(r);
        }

        for(int z = result.size()-2;z >=0;z-- ){
            ArrayList<Integer> temp = result.get(z);
            result.add(temp);
        }
        return result;
    }
}
