class Solution {
    public int reverse(int x) {

       int rev = 0;
       int max = Integer.MAX_VALUE; 
       int min = Integer.MIN_VALUE; 

       while(x != 0){

        int lastDigit = x % 10;

        if(rev > max/10 || (rev == max/10  && lastDigit > 7)){
            return 0;  //positive
        }
        if(rev < min/10 || (rev == min/10  && lastDigit < -8)){
            return 0;   //negative
        }

        rev = rev * 10 + lastDigit;

        x = x/10;

       }
       
       return rev;

    }
}