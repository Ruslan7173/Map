import java.util.HashMap;
import java.util.Map;
//4. Создать HashMap, где ключами будут имена, а значениями - возраст. Затем создайте новый словарь,
//где ключи и значения будут поменяны местами.

public class Exempl4 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vasya", 3);
        map.put("Kolya", 4);
        map.put("Petya", 5);
        HashMap<Integer, String> map1 = new HashMap<>();
        //System.out.println("map1 = " + map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            map1.put(value, key);


        }
        System.out.println(map1);


    }


}
