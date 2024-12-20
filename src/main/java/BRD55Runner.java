public class BRD55Runner {

    /* TODO Task 1: BRD-55 Итератор по двумерному массиву
     * Реализовать итератор по "зубчатому" массиву (массив массивов, в котором массивы-члены могут иметь разную длину).
     * Итератор должен реализовывать проход последовательно по каждому элементу этого массива. */

    public static void main(String[] args) {
        Integer[][] integers = new Integer[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}, {9}};
        String[][] strings = new String[][]{{"meow", "Hi"}, {"stop", "wow"}, {"world"}};

        IteratorForIrregularArray<Integer> iteratorForIntegers = new IteratorForIrregularArray<>(integers);
        IteratorForIrregularArray<String> iteratorForStrings = new IteratorForIrregularArray<>(strings);

        while(iteratorForIntegers.hasNext()){
            System.out.println("element: " + iteratorForIntegers.next());
        }
        while(iteratorForStrings.hasNext()){
            System.out.println("element: " + iteratorForStrings.next());
        }
    }
}
