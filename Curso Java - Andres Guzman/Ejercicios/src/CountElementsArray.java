import java.util.*;

public class CountElementsArray {

    public static void main(String[] args)
    {
        int array[] = {1,2,1,3,3,1,2,1,5,1};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i= 1; i <= 5; i ++){
            frequencyMap.put(i, 0);
        }

        for (Integer s: array)
        {
            Integer count = frequencyMap.get(s);

            frequencyMap.put(s, count + 1);
        }

        for (Map.Entry<Integer, Integer> entry: frequencyMap.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (int i = 0; i<entry.getValue(); i ++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }


}
