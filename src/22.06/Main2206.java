import java.util.*;

public class Main2206 {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
        System.out.println("1. Tạo một ArrayList chứa các số nguyên và tính tổng của tất cả các phần tử.\n" +
                "2. Viết một chương trình để tạo một HashSet từ một ArrayList.\n" +
                "3. Tạo một LinkedList chứa các chuỗi và đảo ngược thứ tự của các phần tử trong danh sách.\n" +
                "4. Viết một phương thức để tìm phần tử lớn nhất trong một ArrayList.\n" +
                "5. Tạo một HashMap chứa các tên và điểm số của sinh viên và in ra tất cả các mục.\n" +
                "6. Viết một phương thức để kiểm tra xem một ArrayList có chứa một giá trị cụ thể hay không.\n" +
                "7. Sắp xếp một ArrayList chứa các chuỗi theo thứ tự bảng chữ cái.\n" +
                "8. Tạo một TreeSet từ một ArrayList và in ra tất cả các phần tử theo thứ tự tăng dần.\n" +
                "9. Viết một chương trình để thêm tất cả các phần tử của một ArrayList vào một HashSet.\n" +
                "10. Xóa các phần tử trùng lặp từ một ArrayList.\n" +
                "11. Viết một phương thức để sao chép một ArrayList sang một ArrayList mới.\n" +
                "12. Tạo một TreeMap chứa các từ và tần suất xuất hiện của chúng trong một đoạn văn bản.\n" +
                "13. Tìm số lần xuất hiện của một phần tử cụ thể trong một LinkedList.\n" +
                "14. Kiểm tra xem một ArrayList có rỗng hay không.\n" +
                "15. Viết một phương thức để chèn một phần tử vào một ArrayList tại vị trí xác định.\n" +
                "16. Tạo một PriorityQueue từ một ArrayList và in ra tất cả các phần tử theo thứ tự ưu tiên.\n" +
                "17. Viết một chương trình để kiểm tra xem một ArrayList có chứa tất cả các phần tử của một danh sách khác hay không.\n" +
                "18. Sắp xếp một LinkedList chứa các số nguyên theo thứ tự giảm dần.\n" +
                "19. Tạo một HashSet từ một mảng và in ra tất cả các phần tử.\n" +
                "20. Viết một phương thức để lấy phần tử đầu tiên và phần tử cuối cùng của một ArrayList.");
         int b = a.nextInt();
         switch(b){
             case 1 -> {
                 ArrayList<Integer> ex1 = new ArrayList<>(List.of(1,2,3));
                 sum(ex1);
             }
             case 2-> {
                 ArrayList<String> ex2 = new ArrayList<>(List.of("a","b","c"));
                 createHashSetFromArrayList(ex2);
             }
             case 3-> {
                 LinkedList<String> ex3 = new LinkedList<>(List.of("aa","bb","cc"));
                 reversed(ex3);
             }
             case 4-> {
                 ArrayList<Integer> ex4 = new ArrayList<>(List.of(2,3,4));
                 ex4.add(9);
                 ex4.add(7);
                 maxNumber(ex4);
             }
             case 5-> {
                 HashMap<String, Integer> ex5 = new HashMap<>();
                 ex5.put("david Truong", 500);
                 ex5.put("peter Phu",600);
                 ex5.put("John Cina", 700);
                 infoStudent(ex5);
             }
             case 6-> {
                 ArrayList<String> ex6 = new ArrayList<>(List.of("David","Peter"));
                 containsArrayList(ex6,"David");
             }
             case 7-> {
                 ArrayList<String> ex7 = new ArrayList<>(List.of("David","Peter","John","Alex"));
                 arrange(ex7);
             }
             case 8-> {
                 ArrayList<Integer> ex8 = new ArrayList<>(List.of(3,6,9,8,7));
                 sortASC(ex8);
             }
             case 9-> {
                 ArrayList<String> ex9 = new ArrayList<>(List.of("david", "johny", "peter"));
                 addFromArrayListToHashSet(ex9);
             }
             case 10-> {
                 ArrayList<String> ex10 = new ArrayList<>(List.of("david", "Johny", "Michael", "Johny"));
                 removeDuplicate(ex10);
             }
             case 11-> {
                 ArrayList<String> ex11 = new ArrayList<>(List.of("Copy1","Copy2", "Copy3"));
                 copyToNewArrayList(ex11);
             }
             case 12-> {
                 String ex12 = "david Truong oh no david";
                 countAppearance(ex12);
             }
             case 13-> {
                 LinkedList<String> ex13 = new LinkedList<>(List.of("ab", "bab", "cab", "dab", "ab"));
                 childAppearance(ex13,"ab");
             }
             case 14-> {
                 ArrayList<Integer> ex14 = new ArrayList<>(List.of(1));
                 isEmptyArrayList(ex14);
             }
             case 15-> {
                 ArrayList<Object> ex15 = new ArrayList<>(List.of(2,3,4));
                 insertChild(ex15,1,0);
             }
             case 16-> {
                 System.out.println(":::");
             }
             case 17-> {
                 ArrayList<String> ex17 = new ArrayList<>(List.of("abc","xyz","123","456","789"));
                 ArrayList<String> ex17two = new ArrayList<>(List.of("123","456"));
                 containsArr(ex17,ex17two);
             }
             case 18-> {
                 LinkedList<Integer> ex18 = new LinkedList<>(List.of(1,3,5,7,9,-6,-14));
                 sortDESC(ex18);
             }
             case 19-> {
                 String[] ex19 = {"A","b","ab","xyz"};
                 createHashSetFromArray(ex19);
             }
             case 20-> {
                 System.out.println("///20////");
                 ArrayList<String> ex20 = new ArrayList<>(List.of("david","Truong","Michael"));
                 getFirstAndLastChildOfArrayList(ex20);
             }
         }
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
    public static void copyToNewArrayList(ArrayList<String> arr1){
        ArrayList<String> arr2 = (ArrayList<String>) arr1.clone();
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
//    public static void PriorityQueue(ArrayList<String> prior){
//
//    }
    //17
    public static void containsArr(ArrayList<String> arr, ArrayList<String> arr2){
        int count = 0;
        for (String ar2: arr2){
            if(arr.contains(ar2)){
                count+=1;
            }
        }
        if(count == arr2.size()){
            System.out.println("ArrayList 1 contains all ArrayList 2");
        }else {
            System.out.println("ArrayList 1 does not contains All ArrayList 2");
        }
    }
    //18
    public static void sortDESC(LinkedList<Integer> nums){
        nums.sort(((o1, o2) -> o2-o1));
        System.out.println(nums);
    }
    //19
    public static void createHashSetFromArray(String[] arr){
        Set<String> createHashset = new HashSet<>(Arrays.asList(arr));
        System.out.println(createHashset);
    }
    //20
    public static void getFirstAndLastChildOfArrayList(ArrayList<String> arr){
        System.out.println("Get First: "+ arr.get(0));
        int last = arr.size()-1;
        System.out.println("Get Last: " +arr.get(last));
    }
}
