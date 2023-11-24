import initon.FirstOn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstOnTest {

  FirstOn firstOn = new FirstOn();
  @Test
  public void returnTrue() {
    Assertions.assertTrue(firstOn.returnTrue());
  }
}
