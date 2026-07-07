class Solution {
    public long sumAndMultiply(int n) {
        long sum =0; 
        long num =0;
        long place = 1;
        while(n>0){
            long digit = n % 10;
            if(digit != 0){
                sum+= digit;
                num = digit * place + num;
                place*=10;
            }
            n/=10;
        }
        return num*sum;
    }
}