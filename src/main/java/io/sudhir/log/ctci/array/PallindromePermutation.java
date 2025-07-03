package io.sudhir.log.ctci.array;

public class PallindromePermutation {
    public boolean isGivenStringPermuationOfPallindrom(String str){
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
        for (char c: str.toCharArray()) {
            int characterCount = -1;
            if(Character.getNumericValue(c) >=0 && Character.getNumericValue(c) < 10) characterCount = Character.getNumericValue(c);
            else characterCount = getCharacterNumber(c);
            if (characterCount !=-1){
                table[characterCount]++;
                if (table[characterCount] %2 == 1) countOdd++;
                else countOdd--;
            }
        }
        return countOdd <=1;
    }

    private int getCharacterNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) return val-a;
        else return -1;
    }

}
