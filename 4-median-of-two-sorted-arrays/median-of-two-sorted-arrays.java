class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int[] array = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                array[k++] = nums1[i++];
            } else {
                array[k++] = nums2[j++];
            }
        }

        while (i < m) array[k++] = nums1[i++];
        while (j < n) array[k++] = nums2[j++];

        int total = m + n;

        if (total % 2 == 1) {
            return array[total / 2];
        } else {
            return (array[total/2 - 1] + array[total/2]) / 2.0;
        }
    }
}
