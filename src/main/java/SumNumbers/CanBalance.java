package SumNumbers;

 class CanBalance {

      public boolean canBalance(int[] nums) {
        int i=0,j=nums.length-1;
        int suml=0,sumr=0;
        while(i<=j ){
            if((suml==sumr)){
                if(i==j) return false;
                suml+=nums[i];
                sumr+=nums[j];
                i++;
                j--;
            }
            else if(suml<sumr){
                suml+=nums[i];
                i++;
            }
            else if(suml>sumr) {
                sumr+=nums[j];
                j--;

            }

        }
         return (suml==sumr);
    }
}
