import com.revature.ArithmeticPresentationLayer;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticPresentationLayerTest {
    static ArithmeticPresentationLayer app;

    @BeforeClass
    public static void setup() {
        // Create the Spring container
        ApplicationContext context =  new AnnotationConfigApplicationContext(ArithmeticPresentationLayer.class);

        // Retrieve the RoryApplication bean from the container
        app = context.getBean(ArithmeticPresentationLayer.class);
    }

    @Test
    public void testAddConvertToString() {
        String actual = app.addConvertToString(3, 4);
        Assert.assertEquals("The result of 3.0 + 4.0 is 7.0", actual);
    }

    @Test
    public void testMultiplyConvertToString() {
        String actual = app.multiplyConvertToString(5,7);
        Assert.assertEquals("The result of 5.0 * 7.0 is 35.0", actual);
    }

    @Test
    public void testSquareConvertToString() {
        String actual = app.squareConvertToString(6);
        Assert.assertEquals("The result of 6.0 squared is 36.0", actual);
    }


}
