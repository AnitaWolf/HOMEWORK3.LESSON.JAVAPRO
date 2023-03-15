import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {

    /**
     * В классе IntegerListDemo создайте список целых чисел.
     * Продемонстрируйте как:
     * добавить в список элемент (в начало и в конец)
     * узнать длину списка
     * удалить элемент из списка (по индексу и без)
     * узнать пустой список или нет
     * обойти список и вывести на консоль каждый элемент.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10; i < 20; i++) { //добавляем элемент в начало списка
            list.add(0, i);
        }
        for (int i = 0; i <= 10; i++) { //добавляем элемент в конец списка
            list.add(i);
        }
        System.out.println("длина списка " + list.size()); //длина списка

        for (int i = 0; i < 10; i++) { //удаляем элемент из списка
            list.remove(i);
        }
        if (!list.isEmpty()) {
            System.out.println("List is not empty");  //проверка пустой  список или нет
        }

        for (Integer i : list) {
            System.out.print(i + " ");//выводим список
        }
        System.out.println();
        System.out.println("длина списка " + list.size());
    }


}
