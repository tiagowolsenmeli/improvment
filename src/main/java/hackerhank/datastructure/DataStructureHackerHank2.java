package hackerhank.datastructure;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DataStructureHackerHank2 {

  // https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true
  public static class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(final List<List<Integer>> arr) {
      // Write your code here
      int iMaxIterator = arr.size() -2;
      int jMaxIterator = arr.get(0).size() -2;

      for (int i = 0; i < iMaxIterator; i++) {
        for (int j = 0; j < jMaxIterator && j < iMaxIterator; j++) {
          sumHourgrass(createArrTemp(arr, i, j));
        }
      }
      return 0;
    }

    public static int sumHourgrass(final List<List<Integer>> arr){
      int sum = 0;
      for(int i =0; i < 3 ; i++) {
        for (int j = 0; j < 3; j++) {
          if(i!=1) {
            sum += arr.get(i).get(j);
          }else {
            if(j==1) {
              sum += arr.get(1).get(1);
              j++;
            }
          }
        }
      }
      return sum;
    }
    public static List<List<Integer>> createArrTemp(final List<List<Integer>> arr, final int i0, final int j0){

        List<List<Integer>> arrTemp = new ArrayList<>();
        for (int i = i0; i<= i0+2; i++) {
          List<Integer> line = new ArrayList<>();
          for (int j = j0; j<= j0+2; j++) {
            line.add(arr.get(i).get(j));
          }
            arrTemp.add(line);
        }
      return arrTemp;
    }

  }

  public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      List<List<Integer>> arr = new ArrayList<>();

      IntStream.range(0, 6).forEach(i -> {
        try {
          arr.add(
              Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                  .map(Integer::parseInt)
                  .collect(toList())
          );
        } catch (IOException ex) {
          throw new RuntimeException(ex);
        }
      });

      int result = Result.hourglassSum(arr);

      bufferedWriter.write(String.valueOf(result));
      bufferedWriter.newLine();

      bufferedReader.close();
      bufferedWriter.close();
    }
  }

}
