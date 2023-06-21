@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
interface MathOperatio {
    
}
public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        //add with functional interface
        MathOperation addition = (a,b) -> a+b;
        int result = addition.operation(3,6);
        System.out.println("sum: "+result);
        //1. divide method
        double divide = cal.divide(5, 0);
        System.out.println("divide: "+divide);
        //2. first char method
        char firstchar = cal.firstChar("");
        System.out.println("first char: "+firstchar);
        //3. even number method
        String evennum = cal.evennum(5.5f);
        System.out.println("even number: " + evennum);
        //4. sum short method
        short sumShort = cal.sumshort( (short)0, (short)1);
        System.out.println("sum short: " +sumShort);
        //5. factorial method
        double factor = cal.factorial(171);
        System.out.println("factorial: "+factor);
        //6. average method
        double average = cal.averageSum(1, 2, 3, 0);
        System.out.println("average: " + average);
        //7. max of number method 
        int max2num = cal.max2num(3, 3);
        System.out.println("max of 2 number: " + max2num);
        //8. find hypotenuse method
        double hypotenuse = cal.hypotenuse(3, 4);
        System.out.println("hypotenuse: "+ hypotenuse);
        //9. last char method
        char lastChar = cal.lastChar("david truong");
        System.out.println("last char: "+ lastChar);
        //10. pyramid method
        Calculator.pyramid(20);
    }
}
