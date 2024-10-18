////Упр. Считать слова из файла, создать словарь, где ключи - это само слово,
//// а значение - сколько раз оно встречается.
//
//import java.io.File;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
//public class Dictionary {
//    public static void main(String[] args) {
//        fileRead("notes.txt");
//
//
//    }
//
//    public static void fileRead(String file) {
//        ArrayList <String> arr  = new  ArrayList<>();
//        System.out.println(arr);
//        HashMap<Integer,String> map1 = new HashMap<>();
//        for ( int i=0; i<arr.size(); i ++ ){
//            map1.put(arr.get(i).length(),arr.get(i));
//
//            if (map1.containsKey(map1[i])){
//                map1.put(map1[i], map1.get(map1[i])+1);
//
//
//            }   else {map1.put(map1[i], 1);
//
//            }
//        }
//        System.out.println(map1);
//
//        }
//
//        try {
//
//            Scanner sc = new Scanner(new File(file));
//            while (sc.hasNext()) {
//
//                String str = sc.next();
//                System.out.println(str);
//
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//
//        }
//
//
//    }
//}
//
//
//
