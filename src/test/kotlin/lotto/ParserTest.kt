package lotto

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ParserTest {
    @Test
    fun `1000을 입력했을 때 1,000원으로 바뀌는지 확인`() {
        val result = Parser().cashDec(1000)
        Assertions.assertEquals(result, "1,000원")
    }

    @Test
    fun `100_000을 입력했을 때 100,000원으로 바뀌는지 확인`() {
        val result = Parser().cashDec(100_000)
        Assertions.assertEquals(result, "100,000원")
    }
}