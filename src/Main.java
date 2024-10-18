import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> map1 = new HashMap<>();
        map1.put(5, "Rome");
        map1.put(8, "Moscow");
        map1.put(6, "NewYork");
        //map1.remove(6);
        System.out.println(map1);
//        System.out.println(map1.get(8));
//        map1.putIfAbsent(7,"dubai");
//        System.out.println(map1);
        for (Map.Entry<Integer,String> entry : map1.entrySet()){ // пройтись по коллекции фором
            Integer key = entry.getKey(); // переменные key  value методот entry.getKey выводит ключи иих значение
            String value = entry.getValue();
            System.out.printf("ключ:%d, значение %S \n",  key, value);
        }
        ArrayList<Integer> arr1 = new ArrayList<>(map1.keySet()); // вернет коллекцию ключей и вернет в арайлист 
        System.out.println("arr1 = " + arr1);

    }
}