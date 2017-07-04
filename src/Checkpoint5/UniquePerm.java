package Checkpoint5;

import java.util.ArrayList;

/**
 * Created by salse on 7/4/17.
 */
public class UniquePerm {

    public static void main(String [] args){
        UniquePerm p = new UniquePerm();
        ArrayList<Integer> k = new ArrayList<Integer>();
        k.add(1);
        k.add(2);
        k.add(3);
        ArrayList<ArrayList<Integer>> res = p.permute(k);
        for(ArrayList<Integer> a:res){
            for(int i=0;i<a.size();i++){
                System.out.print(a.get(i)+" ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        permuteReccur(a,0,res);
        return res;
    }
    public void permuteReccur(ArrayList<Integer> a, int start, ArrayList<ArrayList<Integer>> res){
        if(start >= a.size()){
            ArrayList<Integer> r = new ArrayList<Integer>();
            r.addAll(a);
            res.add(r);
        }

        for(int i=start;i < a.size();i++){
            if(containsDup(a,start,i)){
                swapElem(a,i,start);
                permuteReccur(a,start+1,res);
                swapElem(a,i,start);
            }
        }
    }

    public boolean containsDup(ArrayList<Integer> a, int start,int end){
        for(int i = start;i<=end-1;i++){
            if(a.get(i) == a.get(end)){
                return false;
            }
        }
        return true;
    }

    public void swapElem(ArrayList<Integer> a, int start, int end){
        int temp = a.get(start);
        a.set(start,a.get(end));
        a.set(end,temp);
    }
}
