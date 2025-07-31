
// this code is O(1) time complexity;
//     for (int i=0;i<nums.length;i++){
//         if(nums[i]==target){
//             return i;
//         }
//     }
//     return -1;
// }
// code for O(log n) time complexity;
class Solution {
    public int search(int[] A, int tar) {

        int st = 0;
        int end = A.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (A[mid] == tar) {
                return mid;
            }
            if (A[st] <= A[mid]) {
                if (A[st] <= tar && tar <= A[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (A[mid] <= tar && tar <= A[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }

}
