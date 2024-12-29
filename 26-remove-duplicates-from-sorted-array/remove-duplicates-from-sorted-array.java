class Solution {
    public int removeDuplicates(int[] nums) {

        int ReplacementPointer =1; 
        
        for(int ScanningPointer=1; ScanningPointer<nums.length; ScanningPointer++){
            if(nums[ScanningPointer-1]!=nums[ScanningPointer]){
                    nums[ReplacementPointer] = nums[ScanningPointer];
                ReplacementPointer+=1;        
            }
            
            
        }
        return ReplacementPointer;
    }
}