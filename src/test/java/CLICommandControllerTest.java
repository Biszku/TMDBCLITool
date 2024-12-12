import com.TMDBCLITool.CLICommandController;
import org.junit.jupiter.api.Test;

public class CLICommandControllerTest {
    @Test
    public void testSetCommandSize() {
        CLICommandController.setArgumentsSize((byte) 2);
    }
}
