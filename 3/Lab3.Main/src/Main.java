import java.util.*;
import java.lang.*;
public class Main {
   public static void main(String[] args) {
       //Создаем массив чисел
       int[] array = {42, 17, 89, 5, 73, 28, 64, 11, 36, 50};
       //Сортируем этот массив
       RadiusSort.sort(array);
       //Выводим отсортированный массив чисел
       System.out.println(Arrays.toString(array));
   }
}