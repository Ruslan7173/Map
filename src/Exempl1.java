import java.util.HashMap;
//Создать два массива, один со строками, другой - с числами. Создать HashMap, куда в цикле присвоить:
//числа - ключами, строки - значениями.

public class Exempl1 {
    public static void main(String[] args) {
        String [] strings = {"A", "B","C"};
        Integer [] integers = {1,2,3};
        HashMap <String,Integer> map = new HashMap<>();
        for (int i=0; i<strings.length;  i++){
            map.put(strings [i], integers[i]);


        }
        System.out.println("map = " + map);
    }
}
