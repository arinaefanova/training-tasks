import java.util.HashMap;
import java.util.Map;

public class Methods {

    public static <K> Map<K, Integer> arrayToMap (K[] ks) {
        if (ks == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        Map<K, Integer> result = new HashMap<>();

        for (K k : ks) {
            if (k == null) {
                throw new IllegalArgumentException("Array elements cannot be null");
            }
            result.merge(k, 1, Integer::sum);
        }

        return result;
    }
}
