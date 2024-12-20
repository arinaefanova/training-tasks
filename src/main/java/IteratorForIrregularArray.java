import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorForIrregularArray<E> implements Iterator<E> {

    private final E[][] array;
    private int externalIndex = 0;
    private int internalIndex = 0;

    public IteratorForIrregularArray(E[][] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        while (externalIndex < array.length) {
            if (array[externalIndex] != null && internalIndex < array[externalIndex].length){
                return true;
            } else {
                externalIndex++;
                internalIndex = 0;
            }
        }
        return false;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the array");
        }
        return array[externalIndex][internalIndex++];
    }
}
