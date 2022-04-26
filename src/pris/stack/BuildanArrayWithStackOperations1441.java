package pris.stack;

import java.util.ArrayList;
import java.util.List;

public class BuildanArrayWithStackOperations1441 {
    public List<String> buildArray(int[] target, int n) {
        int i = 1;
        int j = 0;
        List<String> re = new ArrayList<>();
        while (j<target.length) {
            if (target[j] == i) {
                re.add("Push");
                j++;
            } else if (target[j] > i) {
                re.add("Push");
                re.add("Pop");
            }
            i++;
        }
        return re;
    }
}
