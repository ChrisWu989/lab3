import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests {
	@Test 
	public void testFilter() {
    List<String> input1 = new ArrayList<>();
    input1.add("physics");
    input1.add("math");
    input1.add("biology");

    List<String> output1 = new ArrayList<>();
    output1.add("physics");
    output1.add("biology");

    assertEquals(output1, ListExamples.filter(input1, new ListExamples()));
	}

    @Test 
	public void testMerge() {
    List<String> input1 = new ArrayList<>();
    input1.add("math");
    input1.add("biology");

    List<String> input2 = new ArrayList<>();
    input2.add("penguin");
    input2.add("bear");

    List<String> output1 = new ArrayList<>();
    output1.add("bear");
    output1.add("biology");
    output1.add("math");
    output1.add("penguin");

    assertEquals(output1, ListExamples.merge(input1, input2));
	}
}
