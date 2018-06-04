
/**
 *  Write a java program to print the fibonacci series with and without recursion.
 *
 *  A series of numbers in which each number (Fibonacci number) is the sum of the two preceding numbers.
 *  The simplest is the series 1, 1, 2, 3, 5, 8, etc.
 */
class FibonacciSeries {
//--------------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Constructor---------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Private Methods-----------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Public Methods------------------------------------------------------------------------------------------------------//
    /**
     * Fibonacci Series in Java without recursion
     *
     * @param num length of the array.
     */
    static void fib_0(int num) {

        int[] array = new int[num];

        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {

            array[i] = array[i - 1] + array[i - 2];
        }

        for (int i: array) {

            System.out.print(i + " ");
        }
    }

    /**
     * Fibonacci Series in Java without recursion
     *
     * @param num length of the array.
     */
    static void fib_1(int num) {

        int n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < num; i++) {

            n3 = n1 + n2;

            System.out.print(n3 + " ");

            n1 = n2;
            n2 = n3;
        }
    }

    /**
     * Fibonacci Series in Java using recursion
     *
     * @param num The index of the Fibonacci number to return
     * @return A Fibonacci number in the Fibonacci Series
     */
    static int fib_3(int num) {

        if (num == 0) return  0;
        if (num < 2) return  1;

        num = fib_3(num - 1) + fib_3(num - 2);
        return num;
    }
//--------------------------------------------------------------------------------------------------------------------//

//Setters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

//Getters-------------------------------------------------------------------------------------------------------------//
    //None
//--------------------------------------------------------------------------------------------------------------------//

}//End of Class.
