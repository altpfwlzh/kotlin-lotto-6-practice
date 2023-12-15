package lotto.util

class Util {
    fun calculatePercent(targetCase: Long, totalCase: Long): Double {
        return (targetCase.toDouble() / totalCase.toDouble()) * 100
    }
}