package javaadvanced;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {
        Lista<Integer> numbers = new Lista<>();
        numbers.add(1);
        numbers.add(2);

        int check = numbers.get(0);
        System.out.println(check);
    }


}

class Lista<T> {
        private List<T> list = new ArrayList<>();

        public void add(T element) {
            list.add(element);
        }

        public T get(int index) {
            return list.get(index);
        }
    }
