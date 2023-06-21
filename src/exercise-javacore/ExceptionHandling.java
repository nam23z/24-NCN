public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3};
            int result = divide(numbers, 0);
            System.out.println("Result: "+ result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException" + e.getMessage());
        } catch (Exception e){
            System.out.println("Generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Cleanup code goes here");
        }
    }

    public static int divide(int[] numbers, int divisor){
        int result = 0;
        try {
            result = numbers[2] / divisor;
        } catch (ArithmeticException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e){
            throw e;
        }
        return result;
    }
}
