//5. Задача. Создать класс Орешек с полем вес. Все орешки создаются с весом 12.5. Изменить вес ореха нельзя.
//Создать класс Дерево, у которого есть метод выраститьМассивОрехов. Параметр метода
//        это количество, результат - массив Орешков.
//Создать класс Белочка, у которой есть метод собирания орехов из массива, выращенного деревом.
//Белочка перебирает каждый орешек в массиве, говорит "ура, еще орех!" и суммирует вес всех найденных орехов.
//В итоге она гордо сообщает, какой общий вес она насобирала.
//
//Продемонстрировать работу системы с 1 объектом класса Белочка, 1 Деревом и массивом из 15 орехов.


import java.util.AbstractList;
import java.util.Arrays;

public class Exempl5 {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.massnut(3);
        Squirrel squirrel = new Squirrel();
        squirrel.sumnut(5, 12.5);
        System.out.println(Arrays.toString(tree.massnut(5)));

    }

    static class Nut {
        final double weight = 12.5;

        @Override
        public String toString() {
            return "ура, еще орех!" + weight;
        }
    }

    static class Tree {
        public Nut[] massnut(int n) {
            Nut[] arr = new Nut[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Nut();


            }
            //System.out.println(Arrays.toString(arr));
            return arr;
        }
    }

    static class Squirrel {
        double s = 0;

        public void sumnut(int n, double weight) {
            Nut[] arr = new Nut[n];
            for (int i = 0; i < arr.length; i++) {
                s = s + weight;
            }
            System.out.println(s);
            //System.out.println(Arrays.toString(arr));

        }


    }


}



