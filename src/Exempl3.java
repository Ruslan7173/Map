import java.util.HashMap;

//Написать класс Телефонная книга (PhoneBook), который содержит поля: имя контакта, номер
//контакта, а также содержит поле HashMap, где ключом будет имя контакта, а значением - его
//телефонный номер. В классе реализовать методы для добавления нового контакта, поиска номера по имени,
//удаления контакта. Также создать статический метод класса для вывода всех контактов.
//        (конструтор класса можно оставить конструктором по-умолчанию (вызывается с пустыми скобками)).
public class Exempl3 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        PhoneBook pb = new PhoneBook();
        pb.vod("Kolya", 723456);
        pb.vod("Vasya", 223456);
        pb.vod("Dasha", 923456);

        //PhoneBook.viv();


        pb.viv1("Dasha"); //вызов на экземпляре
        pb.viv2("Dasha");
        PhoneBook.viv();// вызов на классе


    }
}

class PhoneBook {
    String name;
    Integer nomer;
    static HashMap<String, Integer> map1 = new HashMap<>();



    public void vod(String name, Integer nomer) {
        map1.put(name, nomer);



    }
    public static void viv (){
        System.out.println(map1);

    }
    public static  void viv1(String name){
        System.out.println(map1.get(name));
    }
    public static  void viv2(String name){
        System.out.println(map1.remove(name));
    }


} 
