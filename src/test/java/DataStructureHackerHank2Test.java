import hackerhank.datastructure.DataStructureHackerHank2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class DataStructureHackerHank2Test {

  @InjectMocks
  private DataStructureHackerHank2 target ;

  @Test
    public void testFirstArray() throws IOException {
        int expected = 14;
        List<List<Integer>> input = List.of(List.of(1,2,3,4,5), List.of(1,2,3,4,5), List.of(1,2,3,4,5));
        Integer result = DataStructureHackerHank2.Result.sumHourgrass(input);

    Assertions.assertEquals(expected, result);
    }

  @Test
  public void testInvalidSizeReturnZero() throws IOException {
    int expected = 0;
    List<List<Integer>> input = List.of(List.of(1,2,3,4,5), List.of(1,2,3,4,5), List.of(1,2,3,4,5));
    Integer result = DataStructureHackerHank2.Result.hourglassSum(input);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testFirstArrayUpValues() throws IOException {
    int expected = 7;
    List<List<Integer>> input = List.of(List.of(1,1,1), List.of(-100,1,-100), List.of(1,1,1));
    Integer result = DataStructureHackerHank2.Result.sumHourgrass(input);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void arrTempHourFrom3x3() throws IOException {
    List<List<Integer>> expected = List.of(List.of(0,1,2), List.of(0,1,2), List.of(0,1,2));
    List<List<Integer>> input = List.of(List.of(0,1,2), List.of(0,1,2), List.of(0,1,2));
    List<List<Integer>> result = DataStructureHackerHank2.Result.createArrTemp(input, 0, 0);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void arrTempHourFrom6x6i0j0() throws IOException {
    List<List<Integer>> expected = List.of(List.of(0,1,2), List.of(0,1,2), List.of(0,1,2));
    List<Integer> expectedLine = List.of(0,1,2,3,4,5);
    List<List<Integer>> input = List.of(expectedLine,expectedLine,expectedLine,expectedLine,expectedLine,expectedLine);
    List<List<Integer>> result = DataStructureHackerHank2.Result.createArrTemp(input, 0, 0);
    Assertions.assertEquals(expected, result);
  }

  @Test
  public void arrTempHourFrom6x6i2j2() throws IOException {
    List<List<Integer>> expected = List.of(List.of(2,3,4), List.of(2,3,4), List.of(2,3,4));
    List<Integer> expectedLine = List.of(0,1,2,3,4,5);
    List<List<Integer>> input = List.of(expectedLine,expectedLine,expectedLine,expectedLine,expectedLine,expectedLine);
    List<List<Integer>> result = DataStructureHackerHank2.Result.createArrTemp(input, 2, 2);
    Assertions.assertEquals(expected, result);
  }
}
