package test;

import org.junit.*;
import play.mvc.*;
import play.test.*;
import play.libs.F.*;
import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;
import models.Answers;

public class AnswersTest {

    @Test
    public void checkFibCalc() {
        Answers testAnswer = new Answers();
        int testVal = 5;
        int testResult = testAnswer.fib(4);
        assertThat(testResult).isEqualTo(testVal);
    }
}