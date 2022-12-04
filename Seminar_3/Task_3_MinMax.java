import java.util.ArrayList;

// Нахождение MinMax
public class Task_3_MinMax {
    public static void main(String[] args) {

ArrayList<Integer> list = new ArrayList<Integer>();
list.add(100);
list.add(-1);
list.add(10);
list.add(101);
list.add(7);


int min = list.get(0);
int max = list.get(0);

for (Integer i: list) {
    if(i < min) 
        min = i;
    if(i > max) 
        max = i;    
}

System.out.println("Исходый список: " + list);
System.out.println("Минимальное число: " + min);
System.out.println("Максимальное число: " + max);
    }
}
