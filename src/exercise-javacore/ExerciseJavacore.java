public class ExerciseJavacore {
    public static void main(String[] args) {
        int [] numbers = {3,9,4,7,2,6};
        ExerciseJavacore ahihi = new ExerciseJavacore();
        int result = ahihi.findFirstEvenNumber(numbers);
        System.out.println("F:" + result);
    }

    public int findFirstEvenNumber(int[] numbers){
        for(int num: numbers){
            if(num%2 == 0){
                return num;
            }
        }
        return -1; // return -1 if no even numbers is not found
    }
}