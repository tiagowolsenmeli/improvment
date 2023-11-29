import hackerhank.datastructure.DataStructureHackerHank2;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class DataStructureHackerHank2Test {

  @InjectMocks
  private DataStructureHackerHank2 target ;

  @Test
    public void test() throws IOException {
        System.out.println("Hello world!");
        int expected = 10;
        List<List<Integer>> input = List.of(List.of(1,2,3,4,5), List.of(1,2,3,4,5));
        Integer result = DataStructureHackerHank2.Result.hourglassSum(input);

    Assertions.assertEquals(expected, result);
    }
}
