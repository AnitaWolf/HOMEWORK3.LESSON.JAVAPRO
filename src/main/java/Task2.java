import java.util.ArrayList;
import java.util.List;

public class Task2 {
    /** 2)
     Могут ли реализации интерфейса java.util.List хранить одинаковые
     элементы (дубликаты)? Напишите код программы, который демонстрирует
     ответ на этот вопрос*/

    //todo answer:
    /**Реализации java.util.List являются упорядоченными
     * структурами данных, разрешающими дубликаты.*/
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5));
        for (Integer i:list){
            System.out.print(i+" ");
        }
    }

}
