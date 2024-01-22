//runtime : 1ms
//memory : 42.52mb

//my initial approach

import java.util.*;
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        int sum = x;
        for(int i =0;i<operations.length;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                sum += 1;
            }else{
                sum -= 1;
            }
        }
        return sum;
    }
}

//optimised approach
//beats 100% users
//runtime : 0ms
//memory : 42.56mb

import java.util.*;
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String i : operations) x+= (44 - i.charAt(1));
        return x;
    }
}
