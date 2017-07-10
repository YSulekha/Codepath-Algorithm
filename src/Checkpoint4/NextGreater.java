package Checkpoint4;

import java.util.ArrayList;

/**
 * Created by aharyadi on 7/9/17.
 */
public class NextGreater {

    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(6);
        a.add(5);
        ArrayList<Integer> res = nextGreater(a);
        for(int n:res){
            System.out.println(n+" ");
        }
    }
    public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i = 0;i < a.size();i++){
            res.add(i,-1);
            for(int j = i+1;j < a.size();j++){
                int num = a.get(j);
                if(num > a.get(i)){
                    res.set(i,num);
                    break;
                }
            }
        }
        return res;
    }
}
