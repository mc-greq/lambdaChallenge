package com.projekty;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = () -> {
          String myString = "Lets split this up into an array";
          String[] parts = myString.split(" ");
          for(String part: parts){
              System.out.println(part);
          }
        };

        runnable.run();

        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 1){
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };

//        System.out.println(lambdaFunction.apply("1234567890"));

        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));

        Supplier<String> iLoveJava = () ->{
          return "I Love Java";
        };

        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);
    }

    private static String everySecondCharacter(Function<String, String> lambdaFunction, String argument){
        return lambdaFunction.apply(argument);
    }
}
