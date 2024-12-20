public class ApplicationRunner {

    /* TODO Task 1: BRD-55 Итератор по двумерному массиву
     * Реализовать итератор по "зубчатому" массиву (массив массивов, в котором массивы-члены могут иметь разную длину).
     * Итератор должен реализовывать проход последовательно по каждому элементу этого массива. */


    /* TODO Task 2: BRD-56 Метод для преобразования массива в хэш-таблицу частот
     * Разработать метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
     * где K — значение из массива, а Integer — количество вхождений в массив. Сигнатура метода выглядит так:
     * <K> Map<K, Integer> arrayToMap(K[] ks); */

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
