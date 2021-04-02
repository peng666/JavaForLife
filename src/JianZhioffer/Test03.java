package JianZhioffer;


import java.util.HashSet;
import java.util.Set;

/*
    剑指 Offer 03. 数组中重复的数字
        在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
        数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
        请找出数组中任意一个重复的数字。

    1. 直接定义一个boolean数组，空间复杂度高
 */
class Solution {
    public int findRepeatNumber(int[] nums) {
        int l = nums.length;
        boolean flag[] = new boolean[100000];
        for(int i=0; i<l; ++i){
            if(flag[nums[i]] == true){
                return nums[i];
            }
            flag[nums[i]]=true;
        }
        return -1;
    }
}

/*
    2. [leetcode官方] 遍历数组
    使用集合Set
    运行结果：时间更长，内存消耗更大
 */
class Solution2{
    public int findRepeatNumber(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        int res = -1;
        for (int num : nums) {
            if(!set.add(num)){
                res = num;
                break;
            }
        }
        return res;
    }
}
