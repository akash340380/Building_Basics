package org.example;

import java.util.function.Predicate;

/*
public class PredicatePractice
{
    public static void main(String[] args) {
        Predicate<Integer> isEven = x->x%2 == 0;
        System.out.println(isEven.test(6));

    }
}
*/
/*
public class PredicatePractice
{
    public static void main(String[] args) {
        Predicate<Integer> isEven = x->x*2 == 10;
        System.out.println(isEven.test(7));
    }
}
*/

/*public class PredicatePractice
{
    public static void main(String[] args) {
        Predicate<String> check = x->x.toLowerCase() == "akash";
        System.out.println(check.test("Akash"));
    }
}*/

/*public class PredicatePractice
{
    public static void main(String[] args) {
        Predicate<String> check = x->x.toLowerCase().equals("akash");
        Predicate<String> lastChar = x-> (x.charAt(x.length()-1))== 'h';
        Predicate<String> and = check.and(lastChar);
        System.out.println(and.test("Akash"));
    }
}*/

/*public class PredicatePractice
{
    public static void main(String[] args) {
        Predicate<String> check = x->x.toLowerCase().equals("akash");
        Predicate<String> evenLength = x-> x.length()%2==0;
        Predicate<String> or = check.or(evenLength);
        System.out.println(or.test("Akash"));
    }
}*/

/*
public class PredicatePractice
{
    public static void main(String[] args) {
        Predicate<String> check = x->x.toLowerCase().equals("akash");
        Predicate<String> not = check.negate();
        System.out.println(not.test("Akash"));
    }
}*/

/*
class PredicatePractice {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = Predicate.isEqual("Akash"); // Predicate.isEqual as isEqual is a
        // static method.
        System.out.println(stringPredicate.test("Akash"));
    }
}*/
