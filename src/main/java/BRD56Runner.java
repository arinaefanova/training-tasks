public class BRD56Runner {

    /* TODO Task 2: BRD-56 Метод для преобразования массива в хэш-таблицу частот
     * Разработать метод, который получает на вход массив элементов типа К (Generic) и возвращает Map<K, Integer>,
     * где K — значение из массива, а Integer — количество вхождений в массив. Сигнатура метода выглядит так:
     * <K> Map<K, Integer> arrayToMap(K[] ks); */

    public static void main(String[] args) {
        String[] stringArray = new String[]{"Blue", "Red", "Green", "Yellow", "Red", "White", "Red", "Blue"};

        System.out.println(Methods.arrayToMap(stringArray));
    }
}
