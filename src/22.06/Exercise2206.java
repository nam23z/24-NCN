import java.util.*;

public class Exercise2206 {
    public static void main(String[] args) {
        //1
        String str1 = "aabcc";
        String str2 = "aabbcc";
        dedupe(str1);
        dedupe(str2);
        //2
        List<Integer> ex2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13));
        classifyPrime(ex2);
        //3
        String ex3 = "aafabcadeaf";
        countAppearence(ex3);
    }

    //1
    public static void dedupe(String str) {
        List<String> result = new ArrayList<>();

        // Tạo HashMap để lưu trữ ký tự và số lần xuất hiện
        HashMap<String, Integer> charCount = new HashMap<>();

        // Đếm số lần xuất hiện của mỗi ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            String character = String.valueOf(str.charAt(i));
            charCount.put(character, charCount.getOrDefault(character, 0) +1);
        }

        // Lặp qua các ký tự và kiểm tra số lần xuất hiện
        for (String character : charCount.keySet()) {
            int count = charCount.get(character);
            // Nếu ký tự chỉ xuất hiện một lần, thêm vào danh sách kết quả
            if (count == 1) {
                result.add(character);
            }
        }
        System.out.println(result);
    }
    //2
    public static void classifyPrime(List<Integer> nums){
        HashMap<String, List<Integer>> classifyPrime = new HashMap<>();
        ArrayList<Integer> prime = new ArrayList<>();
        ArrayList<Integer> notprime = new ArrayList<>();
        for (int num: nums){
            boolean isPrime = true;
            if (num<2){
                isPrime = false;
            }else {
                for (int i=2; i<= Math.sqrt(num);i++){
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                prime.add(num);
            }else {
                notprime.add(num);
            }
        }
        classifyPrime.put("Prime", prime);
        classifyPrime.put("Not Prime", notprime);
        System.out.println(classifyPrime);
    }
    //3
    public static void countAppearence(String content){
        HashMap<String, Integer> wordCounter = new HashMap<>();
        String[] strArray = content.split("");

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
            wordCounter.put(word.next(), count.next());
        }
        System.out.println(wordCounter);
    }
    //4
}