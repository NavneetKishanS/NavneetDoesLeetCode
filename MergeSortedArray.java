// memory: 41.67MB
// runtime: 0 ms
// beats 100%

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArr = new int[m + n];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                mergedArr[k] = nums1[i];
                i++;
            } else {
                mergedArr[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from nums1 if any
        while (i < m) {
            mergedArr[k] = nums1[i];
            i++;
            k++;
        }

        // Copy remaining elements from nums2 if any
        while (j < n) {
            mergedArr[k] = nums2[j];
            j++;
            k++;
        }
        
        // Copy mergedArr back to nums1
        for (int x = 0; x < mergedArr.length; x++) {
            nums1[x] = mergedArr[x];
        }
    }
}
