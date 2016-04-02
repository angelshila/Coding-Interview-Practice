/**
 * Created by Anushila on 3/1/16.
 */

import java.util.*;

public class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {


        return getSubsets(nums,0);

    }


    public List<List<Integer>> getSubsets(int[] nums, int index){
        List<List<Integer>> allSets;

        if(nums.length == index ){

            allSets = new ArrayList<>();
            allSets.add(new ArrayList<>());

        }

        else{
            allSets = getSubsets(nums,index+1);
            int item = nums[index];
            ArrayList<ArrayList<Integer>> moresubs = new ArrayList();
            for(List<Integer> subsets: allSets ){

                ArrayList<Integer> newSubs = new ArrayList<Integer>();
                newSubs.addAll(subsets);
                newSubs.add(item);
                moresubs.add(newSubs);

            }

            allSets.addAll(moresubs);


        }

        return allSets;
    }


}