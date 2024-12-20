import java.util.Iterator;

public class IteratorForIrregularArray<E> implements Iterator<E> {

    private final E[][] array;
    private int externalIndex = 0;
    private int internalIndex = 0;

    public IteratorForIrregularArray(E[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        while (externalIndex < array.length) {
            if (internalIndex < array[externalIndex].length){
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
        return array[externalIndex][internalIndex++];
    }
}
