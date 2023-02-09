package leetcode.editor.cn;//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
// Related Topics 数组 二分查找 分治 👍 6128 👎 0


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        List<Integer> temp = new ArrayList<>();

        if (!Objects.isNull(nums1)) {
            for (int i = 0; i < nums1.length; i++) {
                temp.add(nums1[i]);
            }
        }

        if (!Objects.isNull(nums2)) {

            for (int i = 0; i < nums2.length; i++) {
                temp.add(nums2[i]);
            }
        }


        Collections.sort(temp);
        int size = temp.size();
        if (size % 2 == 0) {
            int i = size / 2;
            return (double) (temp.get(i) + temp.get(i - 1)) / 2;
        } else {
            return (double) temp.get((int) Math.floor(size / 2));
        }

    }


    public static void main(String[] args) {
        int[] n1 = {1, 2,8};
        int[] n2 = {3,4};
        double medianSortedArrays = findMedianSortedArrays(n1, n2);

        System.out.println(5/2);
        System.out.println(medianSortedArrays);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
