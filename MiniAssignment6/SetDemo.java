import java.util.*;
public class SetDemo {
    public static void main(String args[])
    {
        Set<String> hs = new Set<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }
            public void clear() {

            }
        };
        hs.add("Welcome");
        hs.add("To");
        hs.add("Hashedin");
        hs.add("By");
        hs.add("Deloitte");
        System.out.println("The HashSet: " + hs);
        Object[] arr = hs.toArray();

        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
    }
}
