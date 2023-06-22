import java.util.*;

public class Main2206 {
    public static void main(String[] args) {
        // Scanner a = new Scanner(System.in);
        // int b = a.nextInt();
        // switch(b){
        //     case 1 -> ;
        // }
        //1
        ArrayList<Integer> ex1 = new ArrayList<>(List.of(1,2,3));
        sum(ex1);
        //2
        ArrayList<String> ex2 = new ArrayList<>(List.of("a","b","c"));
        createHashSetFromArrayList(ex2);
        //3
        LinkedList<String> ex3 = new LinkedList<>(List.of("aa","bb","cc"));
        reversed(ex3);
        //4
        ArrayList<Integer> ex4 = new ArrayList<>(List.of(2,3,4));
        ex4.add(9);
        ex4.add(7);
        maxNumber(ex4);
        //5
        HashMap<String, Integer> ex5 = new HashMap<>();
        ex5.put("david Truong", 500);
        ex5.put("peter Phu",600);
        ex5.put("John Cina", 700);
        infoStudent(ex5);
        //6
        ArrayList<String> ex6 = new ArrayList<>(List.of("David","Peter"));
        containsArrayList(ex6,"David");
        //7
        ArrayList<String> ex7 = new ArrayList<>(List.of("David","Peter","John","Alex"));
        arrange(ex7);
        //8
        ArrayList<Integer> ex8 = new ArrayList<>(List.of(3,6,9,8,7));
        sortASC(ex8);
        //9
        ArrayList<String> ex9 = new ArrayList<>(List.of("david", "johny", "peter"));
        addFromArrayListToHashSet(ex9);
        //10
        ArrayList<String> ex10 = new ArrayList<>(List.of("david", "Johny", "Michael", "Johny"));
        removeDuplicate(ex10);
        //11
        ArrayList<String> ex11 = new ArrayList<>(List.of("Copy1","Copy2", "Copy3"));
        ArrayList<String> newArray = new ArrayList<>();
        copyToNewArrayList(ex11,newArray);
        //12
        String ex12 = "david Truong oh no david";
        countAppearance(ex12);
        //13
        LinkedList<String> ex13 = new LinkedList<>(List.of("ab", "bab", "cab", "dab", "ab"));
        childAppearance(ex13,"ab");
        //14
        ArrayList<Integer> ex14 = new ArrayList<>(List.of(1));
        isEmptyArrayList(ex14);
        //15
        ArrayList<Object> ex15 = new ArrayList<>(List.of(2,3,4));
        insertChild(ex15,1,0);
    }
    //1.
    public static void sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
    //2.
    public static void createHashSetFromArrayList(ArrayList<String> values){
        Set<String> createHashSet = new HashSet<>(values);
        System.out.println(createHashSet);
    }
    //3.
    public static void reversed(LinkedList<String> strings){
        LinkedList<String> rv = new LinkedList<>();
        for (String str: strings){
            rv.addFirst(str);
        }
        System.out.println(rv);
    }
    //4.
    public static void maxNumber(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for(int number : numbers){
            if (number> max){
                max = number;
            }
        }
        System.out.println(max);
    }
    //5.
    public static void infoStudent(HashMap<String, Integer> infoStu){
        for (Map.Entry<String, Integer> entry: infoStu.entrySet()){
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println("Name: " + name);
            System.out.println("Score: "+score);
        }
    }
    //6.
    public static void containsArrayList(ArrayList<String> values, String containsValue){
        
            boolean contains = values.contains(containsValue);
            if (contains){
                System.out.println("ArrayList contain "+ containsValue);
            }else {
                System.out.println("ArrayList is not contain " +containsValue);
            }
    }
    //7.
    public static void arrange(ArrayList<String> values){
        String temp;
        ArrayList<String> arr = new ArrayList<>(values);
        for(int i = 0; i < values.size(); i++){
            for (int j = i+1; j< values.size(); j++){
                if(arr.get(i).compareTo(arr.get(j))>0){
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        System.out.println(arr);
    }
    //8
    public static void sortASC(ArrayList<Integer> values){
        TreeSet<Integer> arrs = new TreeSet<>(values);
        System.out.println(arrs);
    }
    //9
    public static void addFromArrayListToHashSet(ArrayList<String> values){
        HashSet<String> arr = new HashSet<>(values);
        System.out.println(arr);
    }
    //10
    public static void removeDuplicate(ArrayList<String> values){
        ArrayList<String> arr = new ArrayList<>();
        for (String value : values){
            if (!arr.contains(value)){
                arr.add(value);
            }
        }
        System.out.println(arr);
    }
    //11
    public static void copyToNewArrayList(ArrayList<String> arr1, ArrayList<String> arr2){
        arr2.addAll(arr1);
        System.out.println(arr2);
    }
    //12
    public static void countAppearance(String content){
        TreeMap<String, Integer> arrMap = new TreeMap<>();
        String[] strArray = content.split("\\s+");

        ArrayList<String> strArr = new ArrayList<>();

        ArrayList<Integer> countArr = new ArrayList<>();

        for (String s : strArray) {
            if (!strArr.contains(s)) {
                strArr.add(s);
            }
        }

        for(int i= 0; i < strArr.size(); i++){
            countArr.add(0);
        }

        for(int i =0;i<strArr.size();i++){
            for (String s : strArray) {
                if (strArr.get(i).equals(s)) {
                    countArr.set(i, countArr.get(i) + 1);
                }
            }
        }

        Iterator<String> word = strArr.iterator();
        Iterator<Integer> count = countArr.iterator();
        while (word.hasNext() && count.hasNext()){
            arrMap.put(word.next(), count.next());
        }

        System.out.println(arrMap);
    }
    //13
    public static void childAppearance(LinkedList<String> arr, String child){

        int count = 0;
        for (String ar : arr){
            if(ar.equals(child)){
                count+=1;
            }
        }
        System.out.println(child +" has " + count +" times");
    }
    //14
    public static void isEmptyArrayList(ArrayList<Integer> arr){
        if (arr.isEmpty()){
            System.out.println("Array is empty");
        }else {
            System.out.println("Array is not empty");
        }
    }
    //15
    public static void insertChild(ArrayList<Object> arr, Integer location, Object child){
        arr.add(location, child);
        System.out.println(arr);
    }
    //16
//    public static void
}
