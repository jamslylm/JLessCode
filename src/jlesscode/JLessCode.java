package jlesscode;

import java.util.*;

/**
 * JLessCode is a Java framework that helps us to write less code, gain more time
 * and improve better.
 *
 * JLessCode is written by Mine Jamsly-Love, a student at Universite INUKA acctually
 * in 2th grade of computer science, get inspiration from JQuery and motivate...
 *
 * @author Ing Jamsly-Love MINE
 */
public class JLessCode {

    /**
     * A Scanner instance...
     */
    public static Scanner s = new Scanner(System.in);

    /**
     * Basic default output Method...
     */
    public static void println() {
        System.out.println();
    }

    /**
     * Basic output Method with a string argument
     * without new line returned...
     *
     * @param s to print out
     */
    public static void print(String s) {
        System.out.print(s);
    }

    /**
     * Basic output Method with a string argument with
     * new line returned...
     *
     * @param s to print out
     */

    public static void println(String s) {
        System.out.println(s);
    }

    /**
     * Basic output Method with an integer argument with
     * new line returned...
     *
     * @param i to print out
     */
    public static void println(int i) {
        System.out.println(i);
    }

    /**
     * Basic output Method with a double argument with
     * new line returned...
     *
     * @param d to print out
     */
    public static void println(double d) {
        System.out.println(d);
    }

    /**
     * Basic output Method with a float argument with
     * new line returned...
     *
     * @param f to print out
     */
    public static void println(float f) {
        System.out.println(f);
    }

    /**
     * Basic output Method with a char argument with
     * new line returned...
     *
     * @param c to print out
     */
    public static void println(char c) {
        System.out.println(c);
    }

    /**
     * Basic output Method with a long argument with
     * new line returned...
     *
     * @param l to print out
     */
    public static void println(long l) {
        System.out.println(l);
    }

    /**
     * Basic output Method with a short argument with
     * new line returned...
     *
     * @param sh to print out
     */
    public static void println(short sh) {
        System.out.println(sh);
    }

    /**
     * Prints a boolean and then terminate the line.
     * This method behaves as though it invokes
     * print(boolean) and then println().
     * new line returned...
     *
     * @param b to print out
     */
    public static void println(boolean b) {
        System.out.println(b);
    }

    /**
     * Basic output Method with an Object argument with
     * new line returned...
     *
     * @param o to print out
     */
    public static void println(Object o) {
        System.out.println(o);
    }

    /**
     * Basic input method with an Integer argument ex :
     * int var;
     * var = scanInt();
     * or int var = scanInt();
     *
     * @return the scaned value
     */
    public static int scanInt() {
        int num = s.nextInt();
        return num;
    }

    /**
     * Basic input method with a double argument ex :
     * double var;
     * var = scanDouble();
     * or double var = scanDouble();
     *
     * @return return the user input
     */
    public static double scanDouble() {
        double num = s.nextDouble();
        return num;
    }

    /**
     * Basic input method with an float argument ex :
     * float var;
     * var = scanFloat();
     * or float var = scanFloat();
     *
     * @return the scaned value
     */
    public static float scanFloat() {
        float num = s.nextFloat();
        return num;
    }

    /**
     * Basic input method with a String argument ex :
     * String var;
     * var = scanStr();
     * or String var = scanStr();
     *
     * @return the scaned value
     */
    public static String scanStr() {
        String str = s.nextLine();
        return str;
    }

    /**
     * Basic input method with a char argument ex :
     * char var;
     * var = scanChar();
     * or char var = scanChar();
     *
     * @return the scanned value
     */
    public static char scanChar() {
        char cha = s.nextLine().charAt(0);
        return cha;
    }

    /**
     * Method to print an array
     * these methods allow us to print an array
     * ther are polymorphic we can place
     * any kind of data as argument e.g :
     * <p>
     * int[] arr = [1,2,3,4,5,6,7,8];
     * printArr(arr);  will print all the element of
     * this integer array, it's the same for all
     * the others
     *
     * @param arr to print out
     */
    public static void printArr(int[] arr) {
        for (int elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(String s, int[] arr) {
        println(s);
        for (int elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(int[][] arr) {
        for (int[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(String s, int[][] arr) {
        println(s);
        for (int[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }

    }

    public static void printArr(double[] arr) {
        for (double elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(String s, double[] arr) {
        println(s);
        for (double elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(double[][] arr) {
        for (double[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(String s, double[][] arr) {
        println(s);
        for (double[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(String[] arr) {
        for (String elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(String s, String[] arr) {
        println(s);
        for (String elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(String[][] arr) {
        for (String[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(String s, String[][] arr) {
        println(s);
        for (String[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(float[] arr) {
        for (float elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(String s, float[] arr) {
        println(s);
        for (float elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(float[][] arr) {
        for (float[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(String s, float[][] arr) {
        println(s);
        for (float[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(boolean[] arr) {
        for (boolean elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(String s, boolean[] arr) {
        println(s);
        for (boolean elmnt : arr) {
            println(elmnt);
        }
    }

    public static void printArr(boolean[][] arr) {
        for (boolean[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    public static void printArr(String s, boolean[][] arr) {
        println(s);
        for (boolean[] elmnt : arr) {
            println(Arrays.toString(elmnt));
        }
    }

    /**
     * Method to read an array(Vector)
     * these methods allow us to fill an array(Vector)
     * or Matrix, it's a polymorphic method it take one, two
     * or three parameters(Matrix). if you have a array to fill
     * you can only place its size in parameter or you can
     * indicate the user a string to say in what index it is in
     * the process Example :
     * int arr[];
     * arr = rIntVect(5);
     * or int length = 5;
     * arr = rIntVect(length);
     * or arr = rIntVect("Enter the element", length);
     * this will produce something like this :
     * Enter the element 1
     * 1
     * Enter the element 2
     * 4
     * ...
     * it's the same way for the others
     *
     * @param length for the loop
     * @return the arr
     */
    public static int[] rIntVect(int length) {
        int[] arr;
        arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int[] rIntVect(String sub, int length) {
        int[] arr;
        arr = new int[length];
        for (int i = 0; i < length; i++) {
            println(sub + " " + (i + 1));
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static String[] rStrVect(int length) {
        String[] arr;
        arr = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextLine();
        }
        return arr;
    }

    public static String[] rStrVect(String sub, int length) {
        String[] arr;
        arr = new String[length];
        for (int i = 0; i < length; i++) {
            println(sub + " " + (i + 1));
            arr[i] = s.nextLine();
        }
        return arr;
    }

    public static double[] rDblVect(int length) {
        double[] arr;
        arr = new double[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextDouble();
        }
        return arr;
    }

    public static double[] rDblVect(String sub, int length) {
        double[] arr;
        arr = new double[length];
        for (int i = 0; i < length; i++) {
            println(sub + " " + (i + 1));
            arr[i] = s.nextDouble();
        }
        return arr;
    }

    public static float[] rFltVect(int length) {
        float[] arr;
        arr = new float[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextFloat();
        }
        return arr;
    }

    public static float[] rFltVect(String sub, int length) {
        float[] arr;
        arr = new float[length];
        for (int i = 0; i < length; i++) {
            println(sub + " " + (i + 1));
            arr[i] = s.nextFloat();
        }
        return arr;
    }

    public static char[] rChrVect(int length) {
        char[] arr;
        arr = new char[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextLine().charAt(0);
        }
        return arr;
    }

    public static char[] rChrVect(String sub, int length) {
        char[] arr;
        arr = new char[length];
        for (int i = 0; i < length; i++) {
            println(sub + " " + (i + 1));
            arr[i] = s.nextLine().charAt(0);
        }
        return arr;
    }

    /**
     * Method to read a square Matrix
     * this method works the same way the
     * the read array method, the difference is
     * it take the row and the col as parameter and
     * optionally a string to indicate the user...
     * Example :
     * int[][] arr;
     * int row, col;
     * arr = rIntSqrMatrix(3);// Square Matrix
     * arr = rIntMatrix(3,4);// non-square Matrix
     *
     * @param length for the loop
     * @return the Matrix
     */
    public static int[][] rIntSqrMatrix(int length) {
        int[][] arr;
        arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static int[][] rIntSqrMatrix(String sub, int length) {
        int[][] arr;
        arr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static String[][] rStrSqrMatrix(int length) {
        String[][] arr;
        arr = new String[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = s.nextLine();
            }
        }
        return arr;
    }

    public static String[][] rStrSqrMatrix(String sub, int length) {
        String[][] arr;
        arr = new String[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextLine();
            }
        }
        return arr;
    }

    public static double[][] rDblSqrMatrix(int length) {
        double[][] arr;
        arr = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = s.nextDouble();
            }
        }
        return arr;
    }

    public static double[][] rDblSqrMatrix(String sub, int length) {
        double[][] arr;
        arr = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextDouble();
            }
        }
        return arr;
    }

    public static float[][] rFltSqrMatrix(int length) {
        float[][] arr;
        arr = new float[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = s.nextFloat();
            }
        }
        return arr;
    }

    public static float[][] rFltSqrMatrix(String sub, int length) {
        float[][] arr;
        arr = new float[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextFloat();
            }
        }
        return arr;
    }

    public static char[][] rChrSqrMatrix(int length) {
        char[][] arr;
        arr = new char[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j] = s.nextLine().charAt(0);
            }
        }
        return arr;
    }

    public static char[][] rChrSqrMatrix(String sub, int length) {
        char[][] arr;
        arr = new char[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextLine().charAt(0);
            }
        }
        return arr;
    }

    /**
     * Method to read a non-square Matrix
     *
     * @param col colum's Matrix
     * @param row Matrix row
     * @return the Matrix
     */
    public static int[][] rIntMatrix(int row, int col) {
        int[][] arr;
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static int[][] rIntMatrix(String sub, int row, int col) {
        int[][] arr;
        arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextInt();
            }
        }
        return arr;
    }

    public static double[][] rDblMatrix(int row, int col) {
        double[][] arr;
        arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextDouble();
            }
        }
        return arr;
    }

    public static double[][] rDblMatrix(String sub, int row, int col) {
        double[][] arr;
        arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextDouble();
            }
        }
        return arr;
    }

    public static float[][] rFltMatrix(int row, int col) {
        float[][] arr;
        arr = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextFloat();
            }
        }
        return arr;
    }

    public static float[][] rFltMatrix(String sub, int row, int col) {
        float[][] arr;
        arr = new float[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextFloat();
            }
        }
        return arr;
    }

    public static String[][] rStrMatrix(int row, int col) {
        String[][] arr;
        arr = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextLine();
            }
        }
        return arr;
    }

    public static String[][] rStrMatrix(String sub, int row, int col) {
        String[][] arr;
        arr = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
            }
        }
        return arr;
    }

    public static char[][] rChrMatrix(int row, int col) {
        char[][] arr;
        arr = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextLine().charAt(0);
            }
        }
        return arr;
    }

    public static char[][] rChrMatrix(String sub, int row, int col) {
        char[][] arr;
        arr = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                println(sub + " (" + (i + 1) + "," + (j + 1) + ")");
                arr[i][j] = s.nextLine().charAt(0);
            }
        }
        return arr;
    }

    /**
     * Allow us to print any ArrayList
     *
     * @param list to print
     */
    public static void printList(List<String> list) {
        println(list);
    }

    /**
     * Allow us to fill an ArrayList
     *
     * @param length in parameter
     * @return the arrList
     */
    public static ArrayList<String> rArrList(int length) {
        ArrayList<String> arrList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            arrList.add(s.nextLine());
        }
        return arrList;
    }

    public static LinkedList<Integer> rLinkList(int length) {
        LinkedList<Integer> arrList = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            arrList.add(s.nextInt());
        }
        return arrList;
    }

    public static HashMap<String, Integer> rHashMap(int length) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            hashMap.put(s.nextLine(), s.nextInt());
            s.nextLine();
        }
        return hashMap;
    }

}