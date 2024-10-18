import java.util.HashMap;
import java.util.Map;
// Упр. Считать слова из файла, создать словарь, где ключи - это само слово, а значение - сколько раз оно встречается.
public class Count {
    public static void main(String[] args) {
        String [] arr = {"apple", "pear", "banan", "apple", "pear", "pear" };
        Map<String, Integer> map1 = new HashMap<>();                  // /пустая мапа положить фрукт и сколько он раз повторряется
        for ( int i = 0; i<arr.length; i++){
            if (map1.containsKey(arr[i])){
                map1.put(arr[i], map1.get(arr[i])+1);


            }   else {map1.put(arr[i], 1);

            }
        }
        System.out.println(map1);

    }
}
