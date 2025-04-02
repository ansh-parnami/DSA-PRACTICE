import java.util.ArrayList;
import java.util.List;

public class Pascal_trangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> n = new ArrayList<>();
            n.add(1);
            for (int j = 0; j < i - 1; j++) {
                n.add(a.get(i - 1).get(j) + a.get(i - 1).get(j + 1));
            }
            if (i > 0) n.add(1);
            a.add(n);
        }
        return a;
    }
}

