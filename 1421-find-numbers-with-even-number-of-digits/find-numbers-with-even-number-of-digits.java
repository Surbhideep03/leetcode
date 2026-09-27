class Solution {
    public boolean countEvendigits(int num){
        int digitcount =0;
        while(num!=0){
            num=num/10;
            digitcount++;
        }
        return digitcount%2==0;
    }
    public int findNumbers(int[] nums) {
        int evencount =0;
        for(int i =0;i<nums.length;i++){
            if(countEvendigits(nums[i])){
                evencount++;
            }
        }
        return evencount;

       
    }
}