import hackerhank.datastructure.DataStructureHackerHank2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class DataStructureHackerHank2Test {

  @InjectMocks
  private DataStructureHackerHank2 target ;

  @Test
    public void testFirstArray() throws IOException {
        int expected = 28;
        List<List<Integer>> input = List.of(List.of(1,2,3,4,5), List.of(1,2,3,4,5), List.of(1,2,3,4,5));
        Integer result = DataStructureHackerHank2.Result.hourglassSum(input);

    Assertions.assertEquals(expected, result);
    }

  @Test
  public void testFirstArrayUpValues() throws IOException {
    int expected = 68;
    ArrayList<ArrayList<Integer>> input = new ArrayList<>();
    input.add(new ArrayList<>(Arrays.asList(10,20,30)));
    input.add(new ArrayList<>(Arrays.asList(-100,2,-100)));
    input.add(new ArrayList<>(Arrays.asList(1,2,3)));
    Integer result = DataStructureHackerHank2.Result.sumHourgrass(input);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void arrTempHour() throws IOException {
    int i0 = 0;
    int j0 = 0;
    List<Integer> listij = List.of(0,1,2);
    List<List<Integer>> expected = List.of(listij,listij, listij);
    List<List<Integer>> input = List.of(listij,listij,listij);
    ArrayList<ArrayList<Integer>> result = DataStructureHackerHank2.Result.createArrTemp(input, i0, j0);

    Assertions.assertEquals(expected, result);
  }
}
