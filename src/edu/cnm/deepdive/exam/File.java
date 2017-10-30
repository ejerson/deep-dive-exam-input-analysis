package edu.cnm.deepdive.exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * This is a class that implements a method to parse an array of an array of integers and
 * returns the largest product of 4 adjacent integers.
 *
 *
 */
public class File {

  /** References a .txt file to input a string of integers.*/
  private static final String FILENAME = "largest-product-data.txt";

  /**
   * Creates a stream that results in an array of strings.
   *
   * @param filename retrieves a data.txt file with a matrix of numbers
   * @return Returns an array of integers
   * @throws IOException Throws an IOException
   */
  public static String[] getLines(String filename)
      throws IOException {


    try (
        FileInputStream inStream = new FileInputStream(filename);
        InputStreamReader reader = new InputStreamReader(inStream);
        BufferedReader buffer = new BufferedReader(reader)
    ) {
      List<String> lines = new LinkedList<>();
      for (String line = buffer.readLine();
          line != null;
          line = buffer.readLine()) {
        line = line.trim();
        if (!line.isEmpty()) {
          lines.add(line);
        }
      }
      return lines.toArray(new String[0]);
    }
  }

  /**
   *
   * Creates matrix using the data received from the getLines method.
   *
   * @param lines String of numbers
   * @param delimiter Splits the string of numbers into separate lines
   * @return Returns a matrix of integers
   *
   * @ver 1.0
   */
  public static int[][] getMatrix(String[] lines, String delimiter) {

    int[][] data = new int[lines.length][];
    for(int i = 0; i < lines.length; i++) {

      String[] parts = lines[i].split(delimiter);
      int[] row = new int[parts.length];
      for (int j = 0; j < parts.length; j++) {
        row[j] = Integer.parseInt(parts[j]);
      }
      data[i] = row;
    }
    return data;
  }

  /**
   *
   * Checks the matrix of numbers and returns the largest product of four adjacent numbers.
   *
   * Could not get to work.
   *
   * @param args Given a string of numbers, take 4 adjacent numbers, get product of said numbers
   * @throws IOException Throws IOException
   */
  public static void main(String[] args)
      throws IOException {



    for (int[] row : getMatrix(getLines(FILENAME), "\\s+")) {



      String grid = Arrays.toString(row);

      System.out.println(grid);

        int product = 0;
        int largest = 0;

        // check right
        for (int i = 0; i < 20; i++) {
          for (int j = 0; j < 17; j++) {
//            product = grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3];
            if (product > largest) {
              largest = product;
            }
          }
        }

      // check down
      for (int i = 0; i < 17; i++) {
        for (int j = 0; j < 20; j++) {
//          product = grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j];
          if (product > largest) {
            largest = product;
          }
        }
      }

      // check diagonal right down
      for (int i = 0; i < 17; i++) {
        for (int j = 0; j < 17; j++) {
//          product = grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3];
          if (product > largest) {
            largest = product;
          }
        }
      }

      // check diagonal right up
      for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 17; j++) {
//          product = grid[i][j] * grid[i + 1][j - 1] * grid[i+ 2][j - 1] * grid[i + 3][j -3];
          if (product > largest) {
            largest = product;
          }
        }
      }

      System.out.println(product);

    }
  }

}
