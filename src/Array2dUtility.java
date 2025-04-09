
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][]array){
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                System.out.print(array[i][n]);
            }
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][]array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array[i].length; n++){
                sum += array[i][n];
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][]array){
        return (double) sum(array)/(array.length*array.length);
    }


    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][]array){
        int minimum = array[0][0];
        for (int n = 0; n < array.length; n++){
            for (int i = 0; i < array[n].length; i++){
                if (array[n][i] < minimum){
                    minimum = array[n][i];
                }
            }
        }
        return minimum;
    }


    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][]array){
        int maximum = array[0][0];
        for (int n = 0; n < array.length; n++){
            for (int i = 0; i < array[n].length; i++){
                if (array[n][i] > maximum){
                    maximum = array[n][i];
                }
            }
        }
        return maximum;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][]array){
        int evenCount = 0;
        for (int n = 0; n < array.length; n++){
            for (int i = 0; i < array[n].length; i++){
                if (array[n][i] % 2 == 0){
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced (int[][]array){
       int evenCount = 0;
        for (int[]n : array){
            for (int i : n){
                if (i%2 == 0){
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][]array){
        boolean positiveCheck = true;
        for (int n = 0; n < array.length; n++){
            for (int i = 0; i < array[n].length; i++){
                if (array[n][i] < 0){
                    positiveCheck = false;
                }
            }
        }
        return positiveCheck;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][]array){
        int[] arrayTwo = new int[array.length];
        int sum = 0;
        for (int n = 0; n < array.length; n++){
            for (int i = 0; i < array[n].length; i++){
                sum += array[n][i];
            }
            arrayTwo[n] = sum;
            sum = 0;
        }
        return arrayTwo;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][]array){
        int[] arraySum = new int[array[0].length];
        int colTotal = 0;
        for (int n = 0; n < array[0].length; n++){
            for (int i = 0; i < array.length; i++) {
                colTotal += array[i][n];
            }
            arraySum[n] = colTotal;
            colTotal = 0;
        }
        return arraySum;
    }

}
