package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.BinaryOperator;

//Normal Method
/*
@FunctionalInterface
interface A
{
    int mult(int a, int b);
}
public class LambdaExpression
{
    public static void main( String[] args )
    {
        A ans = (a,b)->a*b;
        System.out.println(ans.mult(7,2));
    }
}
*/


//Using BinaryOperator Class
/*
public class LambdaExpression
{
    public static void main( String[] args )
    {
        BinaryOperator<Integer> b = (a,c) -> a*c;
        System.out.println(b.apply(7,2));
    }
}
*/

//Write a Java program to implement a lambda expression to check if a given string is empty.
/*@FunctionalInterface
interface CheckString
{
    boolean emptyString(String s);
}
public class LambdaExpression
{
    public static void main( String[] args )
    {
        CheckString checkString = (s) -> {
            if(s.length()!=0)
            {
                return false;
            }
            return true;
        };
        System.out.println(checkString.emptyString("Hello"));
    }
}*/

//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
/*
@FunctionalInterface
interface ConvertLowerUpper
{
    String convert(String s);
}
public class LambdaExpression
{
    public static void main( String[] args )
    {
        ConvertLowerUpper convertLowerUpper = (s) -> s.toUpperCase();
        System.out.println(convertLowerUpper.convert("hello"));
    }
}*/

//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
/*
@FunctionalInterface
interface FilterEven
{
    void filter(int[] a);
}
public class LambdaExpression
{
    public static void main( String[] args )
    {
        FilterEven filterEven = (a) -> {
            for(int i:a)
            {
                if(i%2==0)
                {
                    System.out.println(i);
                }
            }
        };
        filterEven.filter(new int[]{1,2,88,44,11,21});
    }
}
*/

//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

/*
@FunctionalInterface
interface SortString
{
    String sort(String s);
}

class LambdaExpression
{
    public static void main(String[] args) {
        SortString sortString = (s) -> {
            char[] ch = s.toLowerCase().toCharArray();
            Arrays.sort(ch);
            String temp = "";
            for(char c : ch)
                temp+=c;
            return temp;
        };

        System.out.println(sortString.sort("Hello"));
    }
}*/

//Write a Java program to implement a lambda expression to remove duplicates from a list of integers.

/*
@FunctionalInterface
interface RemoveDup
{
     HashSet<Integer> removeDuplicate(List<Integer> al);
}

class LambdaExpression
{
    public static void main(String[] args) {
        RemoveDup removeDup = (list) -> {
            return new HashSet<>(list);
        };
        System.out.println(removeDup.removeDuplicate(Arrays.asList(1,2,1,3,1,1,5)));
    }
}*/

//Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.

/*
@FunctionalInterface
interface Factorial {
    int calcFactorial(int n);
}

class LambdaExpression {
    public static void main(String[] args) {
        Factorial factorial = (n) -> {
            int temp = 1;
            if (n == 0 || n == 1) {
                return 1;
            } else {
                for (int i = n; i >= 1; i--) {
                    temp = temp * i;
                }
                return temp;
            }
        };

        System.out.println(factorial.calcFactorial(6));

    }
}*/

//Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
/*@FunctionalInterface
interface CalcSumMul {
    int calc(int [] a);
}

class LambdaExpression {
    public static void main(String[] args) {
       CalcSumMul calcSum = (a) -> {
           int sum = 0;
           for (int i : a)
               sum+=i;
           return sum;
       };
        CalcSumMul calcMul = (a) -> {
            int mul = 1;
            for (int i : a)
                mul*=i;
            return mul;
        };
        System.out.println(calcSum.calc(new int[]{1,2,3,4,5}));
        System.out.println(calcMul.calc(new int[]{1,2,3,4,5}));
    }
}*/

//Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.

/*
@FunctionalInterface
interface CheckWord {
    boolean isPresent(String s, String temp);
}

class LambdaExpression {
    public static void main(String[] args) {
        CheckWord checkWord = (s, temp) -> {
            boolean flag = false;
            String[] list = s.split(" ");
            for (String i : list) {
                if (i.equals(temp)) {
                    flag = true;
                    break;
                }
            }
            return flag;
        };

        System.out.println(checkWord.isPresent("Hello how are you", "Hello"));
    }
}*/

//Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.

/*
@FunctionalInterface
interface TestLength {
    List<String> testStringLength(List<String> stringList);
}

class LambdaExpression {
    public static void main(String[] args) {

        TestLength testMaxLength = (list) -> {
            List<String> result = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for (String i : list) {

                if (i.length() >= max) {
                    max = i.length();
                }
            }
            for (String i : list) {
                if (i.length() == max) {
                    result.add(i);
                }
            }
            return result;
        };

        TestLength testMinLength = (list) -> {
            List<String> result = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            for (String i : list) {

                if (i.length() <= min) {
                    min = i.length();
                }
            }
            for (String i : list) {
                if (i.length() == min) {
                    result.add(i);
                }
            }
            return result;
        };

        System.out.println(testMaxLength.testStringLength(Arrays.asList("You", "are", "very", "hit")));
        System.out.println(testMinLength.testStringLength(Arrays.asList("You", "are", "very", "hit")));
    }
}*/
