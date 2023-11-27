import hackerhank.datastructure.DataStructureHackerHank;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

public class DataStructureHackerHankTest {

  @InjectMocks
  private DataStructureHackerHank dataStructureHackerHank ;

  @Test
    public void test() throws IOException {
        System.out.println("Hello world!");
        List<Integer> initialList = List.of(1,2,3,4,5);
        List<Integer> expected = List.of(5,4,3,2,1);
        List<Integer> result = DataStructureHackerHank.Result.reverseArray(initialList);

    Assertions.assertEquals(expected, result);
    }
}
