package com.kevinmichie;

public class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int finalValue = 0;
        for (int value = n; value > 0; value--){
            if(n%value == 0){
                finalValue+= value;
            }
        }
        return finalValue;
    }


}
