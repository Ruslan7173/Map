import java.util.HashMap;
import java.util.Map;
//2. Создать два словаря(HashMap), где ключи - строки, значения - числа.
//    1) Просто объединить два словаря (можно например через метод putAll)
//    2) Объединить так, чтобы при совпадении ключей значения суммировались.

public class Exempl2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Vasya", 1);
        map1.put("Petya", 2);
        map1.put("Kolya", 3);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Dasha", 4);
        map2.put("Lena", 5);
        map2.put("Kolya", 6);
        //map1.putAll(map2);

        System.out.println("map1 = " + map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) { // вложенный итерфасе Мап. ентри  ключ-значение  удобнее идти циклом по мапе2 интри сет = отдает  он возвращает пару ключ =значение
            String key = entry.getKey();   //создаем доп. переменную кей и ключ методом геткей = получает выводим ключ из мап2
            Integer value = entry.getValue(); // созд.доп. переменная валю лежит значение методом гетвалю берем занчение для удобства выводим значение
            if (map1.containsKey(key)) { // (сравниваем мап1 и ключи из мап2) контейнс отдает тру,  если ключи совпадают то,
                map1.put(key, value + map1.get(key)); // в  этом случае мап 1 путом складываем кей и валю из мап2 т.к. идем мы по мап2,
                                                        // и прибаляем методом геткей т.е Коля 6 + Коля 3


            } else map1.put(key, value); // иначе добавляем в мпа1  значения мап2 кот прошлю фором


        }
        System.out.println(map1);

    }
}



