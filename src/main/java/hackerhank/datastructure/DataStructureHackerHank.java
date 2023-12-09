package hackerhank.datastructure;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
 */
public class DataStructureHackerHank {

  public class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(final List<Integer> a) {
      // Write your code here
      final List<Integer> newList = new ArrayList<>();
      final int lastIndex = a.size() -1;
     for(int iterador = lastIndex ; 0 <= iterador; iterador--){
        final int atualindex = lastIndex - iterador;
        final Integer temp = a.get(iterador);
        newList.add(atualindex, temp);
     }
      return newList;
    }

  }

  public class Solution {
    public static void main(String[] args) throws IOException {
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

      List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
          .map(Integer::parseInt)
          .collect(toList());

      List<Integer> res = Result.reverseArray(arr);

      bufferedWriter.write(
          res.stream()
              .map(Object::toString)
              .collect(joining(" "))
              + "\n"
      );

      bufferedReader.close();
      bufferedWriter.close();
    }
  }

}
