package vtb.baranovdv;

//Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
//public Set<String> removeEvenLength(Set<String> set);
//Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]

import java.util.ArrayList;

public class Main {
    public static void removeEvenLength(ArrayList<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            String word = stringList.get(i);
            if (word.length() % 2 == 0) {
                stringList.remove(word);
                i = i - 1;
                continue;
            }
        }

        for (int i = 0; i < stringList.size(); i++) {
            String word = stringList.get(i);
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("носки");
        stringList.add("футболка");
        stringList.add("майка");
        stringList.add("трусы");
        stringList.add("перчатки");
        removeEvenLength(stringList);
    }
}
