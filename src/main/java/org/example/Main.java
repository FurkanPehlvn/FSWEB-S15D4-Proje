package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {








    }

    public static boolean checkForPalindrome(String text){

        String cleanStr = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        LinkedList<Character> charList = new LinkedList<>();

        for(char c: cleanStr.toCharArray()){
            charList.add(c);
        }
        while(charList.size() > 1) {
            if(!charList.pollFirst().equals(charList.pollLast())) {
                return false;
            }
        }
        return true;
    }


public static String convertDecimalToBinary(int num){

        LinkedList<Integer> binaryList = new LinkedList<>();

        while(num > 0 ){

            int remainder = num % 2;
            binaryList.addFirst(remainder);
            num = num / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        for(int digit: binaryList) {
        binaryString.append(digit);
        }
    return binaryString.toString();
}




}