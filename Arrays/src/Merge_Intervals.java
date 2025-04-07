import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {


        public int[][] merge(int[][] intervals) {
            int n = intervals.length;

            // Sort by starting times
            Arrays.sort(intervals, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return a[0] - b[0];
                }
            });

            List<int[]> merged = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                // If merged is empty or no overlap
                if (merged.isEmpty() || intervals[i][0] > merged.get(merged.size() - 1)[1]) {
                    merged.add(new int[]{intervals[i][0], intervals[i][1]});
                } else {
                    // Merge the intervals
                    merged.get(merged.size() - 1)[1] =
                            Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
                }
            }

            // Convert List<int[]> to int[][]
            return merged.toArray(new int[merged.size()][]);
        }
    }


