package personal.yanchao.geektime.algorithm.sort;

/**
 * zhuyanchao  2020-04-19
 */
public class SelectionSort {

    /**
     * 选择排序
     * 最好时间复杂度 O(n2)
     * 最坏时间复杂度 O(n2)
     * 平均时间复杂度 O(n2)
     * 空间复杂度 O(1)
     * 非稳定排序
     * @param nums
     */
    public void sort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int maxIdx = i;
            for(int j = 0; j < nums.length - i; j++){
                if(nums[maxIdx] < nums[j]){
                    maxIdx = j;
                }
            }
            int tmp = nums[i];
            nums[i] = nums[maxIdx];
            nums[maxIdx] = tmp;
        }
    }

}
