package org.practice.java8;


/*
public class FunctionPractice
{
    public static void main(String[] args)
    {
        Function<Integer,Integer>  square = x->x*x;
        System.out.println(square.apply(2));
    }
}
*/

/*public class FunctionPractice {
    public static void main(String[] args) {
        Function<List<Integer>, List<Integer>> square = x -> {
            for (int i = 0; i < x.size(); i++) {
                x.set(i, x.get(i) * x.get(i));
            }
            return x;
        };
        System.out.println(square.apply(Arrays.asList(1, 2, 3, 4, 5)));
    }
}*/

/*public class FunctionPractice {
    public static void main(String[] args) {
        Function<List<Integer>, List<Integer>> square = x -> {
            for (int i = 0; i < x.size(); i++) {
                x.set(i, x.get(i) * x.get(i));
            }
            return x;
        };
        System.out.println(square.apply(Arrays.asList(1, 2, 3, 4, 5)));
    }
}*/

/*
public class FunctionPractice {

   static boolean isPrime(int num)
   {
       for(int i = 2;i<=Math.sqrt(num);i++)
       {
           if (num%i == 0)
           {
               return false;
           }
       }
       return true;
   }
    public static void main(String[] args) {
        Function<Integer, Integer> prime = x ->{
            int count = 0;
            int result = 0;
            for(int i=1;i<=Integer.MAX_VALUE;i++)
            {
                if(isPrime(i)){
                    if(count==x)
                    {
                        result = i;
                        break;
                    }
                    count++;
                }
            }
            return result;
        };
        System.out.println(prime.apply(45));
    }
}
*/

/*public class FunctionPractice
{
    public static void main(String[] args) {
        Function<String, Integer> strLength = x->x.length();
        Function<Integer, Integer> sq = x->x*x;
        Function<String,Integer> res = strLength.andThen(sq);
        System.out.println(res.apply("Hello"));
    }
}*/

/*
public class FunctionPractice {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        List<Integer> result = new ArrayList<>();
        Function<List<Integer>, List<Integer>> res = x -> {
            for (int i : x) if (isEven.test(i)) result.add(i);
            return result;
        };
        System.out.println(res.apply(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
    }
}*/