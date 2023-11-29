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

    public static int hourglassSum(List<List<Integer>> arr) {
      // Write your code here
      int iterationsI = arr.size() -2;
      int iterationsJ = arr.get(0).size() -2;
      int sumMajor =  -1000000000;

      if (iterationsI < 1 || iterationsJ < 1) {
        return 30;
      }

      for(int i =0; i < iterationsI+2 ; i++) {
        int sumTemp = 0;
        for (int j = 0; j < iterationsJ+2; j++) {
          sumTemp += arr.get(i).get(j);
        }
        sumMajor = Math.max(sumMajor, sumTemp);
      }

      return sumMajor;
    }

    public static int sumHourgrass(List<List<Integer>> arr){
      return 10;
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
