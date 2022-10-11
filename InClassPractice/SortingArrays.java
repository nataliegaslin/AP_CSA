public class SortingArrays {
    public static void main(String[] args){
        int[] numbers = {99,84,70,112,138,157,22,171,124,90,102,191,184,93,140,22,8,15,101,124,51,129,165,60,67,88,123,97,101,188,40,106,56,55,94,87,89,97,86,66,135,170,113,20,199,89,198,29,168,28};
        int currentHighest; // index of highest numbers so far
        // loop through the array
        for(int r = 0; r<numbers.length-1; r++) {
            currentHighest = r;
        //start at +1 because we don't need to compare a number to itself
            for(int j = r+1; j<numbers.length; j++) {
                if(numbers[currentHighest] < numbers[j]){
                    currentHighest = j;
                // j represents the index value of the array
                    }
            }
            int temp = numbers[r];
            numbers[r] = numbers[currentHighest];
            numbers[currentHighest] = temp;
        }

        for(int x : numbers){
            System.out.println(x);
        }
    }
}