import java.util.ArrayList;

public class CharSearch {

    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<Character>();
        arr.add('a');
        arr.add('b');
        arr.add('c');
        arr.add('d');
        arr.add('e');

        char res = 'c';

        CharSearch(arr,res);
    }
    public static int BinarySearch(ArrayList<Integer> arr, int first, int res){
        int last = arr.size();
        while (first <= last) {
            int mid = (first + last) / 2;
            if (res == arr.get(mid))
                return mid;
            else if (res > arr.get(mid))
                first = mid + 1;
            else
                last = mid - 1;
        }
        if (first > last){
            System.out.println("Element not found");
        }
        return 0;
    }

    public static ArrayList<Integer> CharToAscii (ArrayList<Character> arr){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (char c:arr) {
            res.add((int) c);
        }
        return res;
    }


    public static void CharSearch (ArrayList<Character> arr, char search){
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints = CharToAscii(arr);
        int ascii = (int) search;

        int resIndex = BinarySearch(ints, 0, ascii);

        System.out.println("Ihr Char befindet auf dem Index " + resIndex);
    }

}
