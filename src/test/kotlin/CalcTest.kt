import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import test.calculator.CalculatorParser
import test.calculator.eNode

class CalcTest {
    private val parser = CalculatorParser()

    @Test
    fun test1(){
        val expr = "1+1"
        Assertions.assertEquals(2, (parser.parse(expr) as eNode).res)
    }

    @Test
    fun test2(){
        val expr = "2*7"
        Assertions.assertEquals(14, (parser.parse(expr) as eNode).res)
    }

    @Test
    fun test3(){
        val expr = "10 - 1 - 2 - 3 - 4"
        Assertions.assertEquals(0, (parser.parse(expr) as eNode).res)
    }


    @Test
    fun test4(){
        val expr = "2 * (3 + 4) - 4"
        Assertions.assertEquals(10, (parser.parse(expr) as eNode).res)
    }


    @Test
    fun test5(){
        val expr = "100 / 5 / 2"
        Assertions.assertEquals(10, (parser.parse(expr) as eNode).res)
    }

    @Test
    fun test6(){
        val expr = "2*(4 - 1 - 1)"
        Assertions.assertEquals(4, (parser.parse(expr) as eNode).res)
    }

}
