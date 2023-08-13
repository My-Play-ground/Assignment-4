import java.util.HashSet;
import java.util.Set;

public class Question8 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
            for (int num : numA) {
                setA.add(num);
            }

            for (int num : numB) {
                setB.add(num);
            }

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        Set<Integer> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);

        System.out.println("1. numA: " + setA);
        System.out.println("2. numB: " + setB);
        System.out.println("3. Intersection: " + intersection);
        System.out.println("∪ Union: " + union);
        System.out.println("/ Difference: " + difference);
        System.out.println("14. Symmetric Difference: " + symmetricDifference);
        System.out.println("5. numA / numA △ numB: " + setA);
    }
}
