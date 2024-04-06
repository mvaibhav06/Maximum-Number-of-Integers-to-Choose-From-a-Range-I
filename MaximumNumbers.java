import java.util.HashSet;
import java.util.Set;

public class MaximumNumbers {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> temp = new HashSet<>();

        for(int a: banned){
            temp.add(a);
        }
        long sum = 0;
        int out = 0;

        for(int i=1; i<=n; i++){
            if(!temp.contains(i) && sum+i<=maxSum){
                sum += i;
                out++;
            }
            if(sum+i > maxSum){
                break;
            }
        }
        return out;
    }
}
