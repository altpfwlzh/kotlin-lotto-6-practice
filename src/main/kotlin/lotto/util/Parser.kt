package lotto.util

import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.round
import lotto.model.Enum

class Parser {
    fun stringToModel(input: String): Map<Enum, Int> {
        val menus:MutableMap<Enum, Int> = mutableMapOf()

        input.split(",").map {
            val menu: String = it.substringBefore("-").replace(" ", "")
            val count: String = it.substringAfter("-").replace(" ", "")
            InputValidator().checkModelDetail(menu, count, "공통 에러 메시지")

            menus[Enum.valueOf(string = menu)] = count.toInt()
        }
        return menus
    }

    fun longToCashString(num: Long): String {
        val dec = DecimalFormat("#,###원")
        return dec.format(num)
    }

    fun longToMinusCashString(num: Long): String {
        val dec = DecimalFormat("-#,###원")
        return dec.format(num)
    }

    fun doubleToRound(percent: Double, decimalPoint: Int): Double {
        val decimalPointValue: Double = 10.0.pow(decimalPoint)
        return round(percent * decimalPointValue) / decimalPointValue
    }

    fun <K, V> mapValueToKey(map: Map<K, V>, target: V): K {
        return map.keys.first { target == map[it] }
    }
}