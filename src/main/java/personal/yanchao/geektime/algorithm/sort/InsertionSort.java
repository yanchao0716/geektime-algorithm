package personal.yanchao.geektime.algorithm.sort;

/**
 * zhuyanchao  2020-04-19
 */
public class InsertionSort {

    /**
     * 插入排序
     * 最好时间复杂度 O(n): 数组有序，每次不用交换位置直接插入
     * 最坏时间复杂度 O(n2): 倒序，每次都要比较交换
     * 平均时间复杂度 O(n2)
     * 空间复杂度 O(1)
     * 稳定排序，元素大小相同插入在后边
     * @param nums
     */
    public void sort(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = value;
        }
    }

}
