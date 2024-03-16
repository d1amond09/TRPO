import java.util.*;
import java.lang.*;
public class Main {
   public static void main(String[] args) {
       int[] array = {42, 17, 89, 5, 73, 28, 64, 11, 36, 50};
       RadiusSort.sort(array);
       System.out.println(Arrays.toString(array));
   }
}