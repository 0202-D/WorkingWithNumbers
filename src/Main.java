import java.util.*;

/**
 * @author Dm.Petrov
 * DATE: 02.07.2022
 */
public class Main {
    public static void main(String[] args) {
        // Не уверен , что по условию задания можно менять вариант создания List, но если можно , то решение :
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(5);
        intList.add(16);
        intList.add(-1);
        intList.add(-2);
        intList.add(0);
        intList.add(32);
        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(8);
        intList.add(23);
        intList.add(4);
        intList.removeIf(el -> el <= 0 || el % 2 != 0);
        Collections.sort(intList);
        System.out.println(intList);
        //При таком создании получаем немодифицируемую коллекцию и придется создавать новые
        List<Integer> intList2 = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();
        for (Integer integer : intList2) {
            if(integer>0&&integer%2==0){
                result.add(integer);
            }
        }
        Collections.sort(result);
        intList2=result;
        System.out.println(intList2);
    }
}

