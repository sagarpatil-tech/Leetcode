class Solution {
    public boolean detectCapitalUse(String word) {
        int countupper = 0;
        for(int i =0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                countupper++;
            }
        }
        if(countupper == word.length()){
            return true;
        }
        if(countupper == 1 && word.charAt(0) >= 'A'&& word.charAt(0) <= 'Z' ){
            return true;
        }
        if(countupper == 0){
            return true;
        }
        return false;
    }
}