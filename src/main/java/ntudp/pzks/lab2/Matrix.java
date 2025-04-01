package ntudp.pzks.lab2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Matrix {
    public static final int MAX_VAL = 10;
    public static final int MIN_VAL = -10;
    public static final int MAX_SIZE = 20;
    public static final int MIN_SIZE = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = getValidInt(scanner, "Enter the number of rows (1-20): ", MIN_SIZE, MAX_SIZE);
        int cols = getValidInt(scanner, "Enter the number of columns (1-20): ", MIN_SIZE, MAX_SIZE);

        int[][] matrix = new int[rows][cols];

        int choice = getValidInt(scanner, "Choose a method to create the matrix:\n" +
                "1 - Input manually\n2 - Fill with random numbers\nYour choice: ", 1, 2);

        if (choice == 1) {
            fillMatrixManually(scanner, matrix);
        } else {
            fillMatrixRandomly(matrix);
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        int min = findMinValue(matrix);
        int max = findMaxValue(matrix);
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        System.out.printf("Arithmetic mean: %.2f%n", calculateArithmeticMean(matrix));
        System.out.printf("Geometric mean: %.2f%n", calculateGeometricMean(matrix));

        scanner.close();
    }

    private static int getValidInt(Scanner scanner, String message, int min, int max) {
        int value;
        while (true) {
            System.out.print(message);
            try {
                value = scanner.nextInt();
                if (value >= min && value <= max) break;
                System.out.println("Error! Value must be between " + min + " and " + max + ".");
            } catch (InputMismatchException e) {
                System.out.println("Error! Please enter an integer.");
                scanner.next();
            }
        }
        return value;
    }

    private static void fillMatrixRandomly(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(MAX_VAL - MIN_VAL + 1) + MIN_VAL;
            }
        }
    }

    private static void fillMatrixManually(Scanner scanner, int[][] matrix) {
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getValidInt(scanner, String.format("Enter element [%d][%d]: ", i + 1, j + 1), MIN_VAL, MAX_VAL);
            }
        }
    }

    private static int findMinValue(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }

    private static int findMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }

    private static double calculateArithmeticMean(int[][] matrix) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    private static double calculateGeometricMean(int[][] matrix) {
        double product = 1.0;
        int count = 0;
        boolean containsNegative = false;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value == 0) return 0;
                if (value < 0) containsNegative = true;
                product *= Math.abs(value);
                count++;
            }
        }

        double result = Math.pow(product, 1.0 / count);
        return containsNegative ? -result : result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
