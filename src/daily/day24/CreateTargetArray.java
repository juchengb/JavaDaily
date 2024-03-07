package daily.day24;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }     
        for(int i=0;i<nums.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }

}
