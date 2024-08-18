public class DogProblem{ // create a class named DogProblem
    public static Mydog[] largerThanFourNeighbors(Mydog[] dogs){ //give an array of type "Mydog[]", and return an array of type "Mydog[]"
        //find the dogs that are larger than four of their neighbors
        //make function that reads beautiful -> create a function that can be used here
        Mydog[] returnDogs = new Mydog[dogs.length]; // create returnDogs used to store the return value
        int cnt = 0; /**used in "returnDogs[cnt]" */ 
        for (int i = 0; i < dogs.length; i += 1){ // 遍历
            if (isBiggestOfFour(dogs, i)){ // use function that is pre-defined, make the code more readable
                returnDogs[cnt] = dogs[i];
                cnt += 1;
            }
        }
        return returnDogs;
    }

    /**the isBiggestOfFour function */
    /**is the same every time difine a Mydog type value -> static */
    public static boolean isBiggestOfFour(Mydog[] dogs, int i){
        boolean isBiggest = true;
        for (int j = -2; j <= 2; j += 1){
            if (j == 0){
                continue;
            }
            int compareIndex = i + j;
            if (validIndex(dogs, compareIndex) && dogs[compareIndex].weightInPounds >= dogs[i].weightInPounds){
                isBiggest = false;
            }
        }
        return isBiggest;
    }

    /**create a function to judge whether the index is valid */
    /**used by function "isBiggestOfFour" */
    public static boolean validIndex(Mydog[] dogs, int i){
        if (i < 0 || i >= dogs.length){
            return false;
        }
        return true;
    }

    public static void main(String[] args){ 
        Mydog[] dogs = new Mydog[10];
        dogs[0] = new Mydog(15);
        dogs[1] = new Mydog(20);
        dogs[2] = new Mydog(15);
        dogs[3] = new Mydog(10);
        dogs[4] = new Mydog(5);
        dogs[5] = new Mydog(10);
        dogs[6] = new Mydog(15);
        dogs[7] = new Mydog(22);
        dogs[8] = new Mydog(15);
        dogs[9] = new Mydog(20);
        Mydog[] returnDogs = largerThanFourNeighbors(dogs);
        for (int i = 0; i < returnDogs.length; i += 1){
            if (returnDogs[i] != null){
                System.out.println(returnDogs[i].weightInPounds + " ");
            }
        }
        System.out.println();
    }

}