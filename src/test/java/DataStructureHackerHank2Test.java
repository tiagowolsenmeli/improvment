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
        int expected = 15;
        List<List<Integer>> input = List.of(List.of(1,2,3,4,5), List.of(1,2,3,4,5), List.of(1,2,3,4,5));
        Integer result = DataStructureHackerHank2.Result.hourglassSum(input);

    Assertions.assertEquals(expected, result);
    }

  @Test
  public void testInvalidSizeReturnZero() throws IOException {
    int expected = 30;
    List<List<Integer>> input = List.of(List.of(1,2,3,4,5), List.of(1,2,3,4,5));
    Integer result = DataStructureHackerHank2.Result.hourglassSum(input);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void testFirstArrayUpValues() throws IOException {
    int expected = 66;
    List<List<Integer>> input = List.of(List.of(10,20,30), List.of(-100,2,-100), List.of(1,2,3));
    Integer result = DataStructureHackerHank2.Result.sumHourgrass(input);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void arrTempHour() throws IOException {
    List<List<Integer>> expected = List.of(List.of(0,0,0), List.of(0,0,0), List.of(0,0,0));
    List<List<Integer>> input = List.of(List.of(0,0,0), List.of(0,0,0), List.of(0,0,0));
    ArrayList<ArrayList<Integer>> result = DataStructureHackerHank2.Result.createArrTemp(input, 0, 0);

    Assertions.assertEquals(expected, result);
  }
}
