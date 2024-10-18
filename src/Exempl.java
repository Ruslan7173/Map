import java.util.ArrayList;
import java.util.HashMap;


//Упр. Создать массив слов. Сделать из него map, где слова
//        будут ключами, а их длины - значениями.
//Потом сделать то же самое из ArrayList.
public class Exempl {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        //String [] mass ={"Пашок", c, "Ваня"};
        ArrayList <String> arr = new ArrayList<>();
        arr.add("Павлик");
        arr.add("Света");
        arr.add("Ваня");

        for ( int x =0; x < arr.size(); x++){
            map1.put(arr.get(x), arr.get(x).length()); //добавление в словарь, ч\з get

        }
        System.out.print(map1);






        }
    }

