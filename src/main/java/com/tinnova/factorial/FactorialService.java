package com.tinnova.factorial;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
    public String getResult(String input) {
        int intInput;
        //Invalid input handling
        try{
            intInput= Integer.parseInt(input);
        } catch (Exception e){
            return input + " is not a valid integer";
        }
        if (intInput<0){return "Input cannot be negative";}
        else {return input + "! = " + getFactorial(intInput);}
    }
    private int getFactorial(int input){
        if (input == 0){return 1;}
        else {
        return input * getFactorial(input-1);
        }
    }
}
