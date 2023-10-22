package org.example;

public class Main {
    public static void main(String[] args) {

    }
    public static void doHW11(String[] args){
        if (args.length == 3) {
            try {
                int x = Integer.parseInt(args[0]);
                int y = Integer.parseInt(args[1]);
                switch (args[2]) {
                    case "sum" -> System.out.println(x + y);
                    case "reduce" -> System.out.println(x - y);
                    case "multiply" -> System.out.println(x * y);
                    case "divide" -> System.out.println((double) x / y);
                    default ->
                            System.out.println("3 argument is incorrect, correct are: sum, reduce, multiply, divide");
                }
            } catch (NumberFormatException e) {
                System.out.println("1 and 2 argument must be a number");
            }
        } else {
            System.out.println("wrong amount or order of arguments, for example: 1 2 sum");
        }
    }
}