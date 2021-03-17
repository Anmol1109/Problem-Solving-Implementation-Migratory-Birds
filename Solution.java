import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            types[arr_i] = in.nextInt();
        }
        int[] frequencies = new int[6];
        for (int i = 0; i < types.length; i++) {
            frequencies[types[i]] += 1; 
        }
        int mostCommon = 0;
        for (int i = 1; i < frequencies.length; i++) { 
            if (frequencies[mostCommon] < frequencies[i]) {
                mostCommon = i; 
            }
        }
        System.out.println(mostCommon);
    }
}
