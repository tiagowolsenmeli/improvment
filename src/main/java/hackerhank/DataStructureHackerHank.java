package hackerhank;

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

public class DataStructureHackerHank {

  public class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
      // Write your code here
      List<Integer> newList = new ArrayList<>();
 for(int i =0; i < a.size(); i ++){
     Integer maxIndex = a.size() - i - 1;
     Integer temp = a.get(maxIndex);
     newList.add(i, temp);
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
