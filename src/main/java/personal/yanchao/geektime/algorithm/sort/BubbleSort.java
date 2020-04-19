package personal.yanchao.geektime.algorithm.sort;

/**
 * zhuyanchao  2020-04-19
 */
public class BubbleSort {

    /**
     * 最好时间复杂度 O(n):数组有序需要遍历一遍
     * 最差时间复杂度 O(n2):倒序
     * 平均时间复杂度 O(n2)
     * 空间复杂度 O(1)
     * 稳定排序：大小相同不做交换
     * @param nums
     */
    public void sort(int[] nums){
        if(nums.length <= 1){
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for(int j = i; i < nums.length - i - 1; j++){
                if(nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
    }

}
