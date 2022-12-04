import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Удаление чётных чисел из списка
public class Task_2_evenDel {
    public static void main(String[] args) {
        List <Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);        
        List <Integer> result = listInt.stream().reduce(0, (a, b) -> a + b)%2 == 0 ? 
                filter(listInt, p->p%2==0) : filter(listInt, p->p%2!=0);
        System.out.println("Исходный список: " + listInt);
        System.out.println("Список без чётных чисел: " + result);        
    }

    private static List <Integer> filter(List <Integer> listInt, Predicate <Integer> predicate) {
        return listInt.stream().filter(predicate).collect(Collectors.toList());
    }
}