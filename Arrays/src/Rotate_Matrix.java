public class Rotate_Matrix {
    public void rotate(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                swap(nums,i,j);
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length/2;j++){
                rowsSwap(nums,i,j);
            }
        }
    }
    private void swap(int[][] nums, int i, int j) {
        int temp = nums[i][j];
        nums[i][j] = nums[j][i];
        nums[j][i] = temp;
    }

    private void rowsSwap(int[][] nums, int i, int j) {
        int temp = nums[i][j];
        nums[i][j] = nums[i][nums.length-j-1];
        nums[i][nums.length-j-1] = temp;
    }
}
