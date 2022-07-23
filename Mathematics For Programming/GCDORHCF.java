import java.util.ArrayList;
import java.util.Collections;

public class GCDORHCF {
    public static void main(String[] args) {
        System.out.println(findHCF(100, 200));

    }

    public static int findHCF(int x, int y) {
        if (y % x == 0 || x % y == 0) {
            return Math.min(x, y);
        }
        ArrayList<Integer> list = findFactors(x);
        ArrayList<Integer> listTwo = findFactors(y);
        System.out.println(list);
        System.out.println(listTwo);
        Collections.sort(list, Collections.reverseOrder());
        Collections.sort(listTwo, Collections.reverseOrder());
        for (Integer i : list) {
            if (listTwo.contains(i) == false) {
                continue;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static int findLCM(int x, int y) {
       if(y % x == 0 || x % y == 0){
            return Math.max(x, y);
       }
       // if no common factors then multiply both and return;
       // 

    }

    public static ArrayList findFactors(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        if (x == 1) {
            list.add(1);
            return list;
        }
        int count = 2;
        while (x != 1 || x > 0) {
            if (x % count != 0) {
                count++;
                continue;
            }
            x = x / count;
            list.add(count);
            count++;
            if (count > x) {
                break;
            }
        }
        Collections.sort(list);
        return list;
    }
}