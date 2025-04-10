public class TwoD_search {
    public boolean searchMatrix(int[][] nums, int target) {
        if (nums == null || nums.length == 0 || nums[0].length == 0) {
            return false;
        }
        int start=0;
        int end=nums.length-1;

        int n=nums[0].length;


        while(start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid][n-1]==target){
                return true;
            }
            if(nums[mid][n-1]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        int row=start;

        if (row >= nums.length) return false;
        int startb=0;
        int endb=n-1;

        while(startb<=endb){
            int midb =startb+(endb-startb)/2;

            if(nums[row][midb]==target){
                return true;
            }
            else if(nums[row][midb]>target){
                endb=midb-1;
            }
            else{

                startb=midb+1;
            }

        }

        return false;

    }
}
