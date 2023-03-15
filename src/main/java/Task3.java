import java.util.*;

public class Task3 {

    static List<Integer> list = new LinkedList<>();

    /**
     * создать List наполнить его 10М> элементами
     * При наполнении списка  сохраняем i- тый элемент в переменную temp
     * перебрать for-each loop
     * classic for и вызываем list.size() для каждой итерации
     * classic for, но list.size() определяем в переменную
     * classic for, list.size() определяем в переменную, перебираем с конца (i--)
     * используя Itertor
     * используя ListIterator
     * для всех случаев сделать замер времени
     * результат вывести в консоль
     */

    //создать List наполнить его 10М> элементами
    static class ListAdd {
        public static void main(String[] args) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000000; i++) {
                list.add(i);
            }
            long finish = System.currentTimeMillis();
            long result = finish - start;
            System.out.println(list.size());
            System.out.println(" result1: " + result + "ms");
        }

        // При наполнении списка  сохраняем i- тый элемент в переменную temp
        static class ListAdd1 {
            public static void main(String[] args) {
                long start = System.currentTimeMillis();
                for (int i = 0; i < 10000000; i++) {
                    int temp = list.get(i);
                    list.add(temp);
                }
                long finish = System.currentTimeMillis();
                long result = finish - start;
                System.out.println(list.size());
                System.out.println(" result2: " + result + "ms");
            }

            // перебрать for-each loop
            static class ListFor {
                public static void main(String[] args) {
                    long start = System.currentTimeMillis();
                    for (Integer i : list) {
                        System.out.println(i);
                    }
                    long finish = System.currentTimeMillis();
                    long result = finish - start;
                    System.out.println(list.size());
                    System.out.println(" result3: " + result + "ms");

                }
            }
            //classic for и вызываем list.size() для каждой итерации
            static class ListForI {
                public static void main(String[] args) {
                    long start = System.currentTimeMillis();
                    for (int i = 0; i < list.size(); i++) {
                        list.size();
                    }
                    long finish = System.currentTimeMillis();
                    long result = finish - start;
                    System.out.println(" result4: " + result + "ms");
                }
            }

            //classic for, но list.size() определяем в переменную,перебираем с конца (i--)

            static class ListForISize {
                public static void main(String[] args) {
                    long start = System.currentTimeMillis();
                    for (int i = list.size(); i > 0; i--) {
                        int size = list.size();
                        System.out.println(size);
                    }
                    long finish = System.currentTimeMillis();
                    long result = finish - start;
                    System.out.println(" result5: " + result + "ms");
                }
            }
        }

        //используя Iterator
        static class ListOfIterator {
            public static void main(String[] args) {
                long start = System.currentTimeMillis();
                Iterator<Integer> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                long finish = System.currentTimeMillis();
                long result = finish - start;
                System.out.println(" result6: " + result + "ms");
            }
        }

        // используя ListIterator
        static class ListOfListIterator {
            public static void main(String[] args) {
                long start = System.currentTimeMillis();
                ListIterator<Integer> listIt = list.listIterator();
                while (listIt.hasNext()) {
                    listIt.next();
                }
                long finish = System.currentTimeMillis();
                long result = finish - start;
                System.out.println(" result7: " + result + "ms");

            }
        }
    }
}

