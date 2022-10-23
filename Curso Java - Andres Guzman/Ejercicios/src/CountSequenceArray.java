public class CountSequenceArray {

    public static void main(String[] args) {
        int myArray[] = {1,2,2,5,4,6,7,8,8,8};
        int number = 0;

        int count = 0;
        int longestSequence = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] == myArray[i - 1]) {
                count++;
            }
            else {
                count = 1;
            }
            if (count > longestSequence) {
                longestSequence = count;
                number = myArray[i];
            }
        }

        System.out.println("Longest: " + longestSequence);
        System.out.println("Number: " + number);
    }

}
