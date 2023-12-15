package lotto.view

import lotto.constants.ErrorMessage
import lotto.constants.Strings
import lotto.util.Parser

class OutputView() {
    private val strings: Strings = Strings
    private val errorMessage: ErrorMessage = ErrorMessage
    private val parser: Parser = Parser()

    fun outputReceivePurchaseAmount() = println(strings.OUTPUT_RECEIVE_PURCHASE_AMOUNT)

    fun outputPurchasedLotto() = println(strings.OUTPUT_PURCHASED_LOTTO)

    fun outputReceiveWinningNumbers() = println(strings.OUTPUT_RECEIVE_WINNING_NUMBERS)

    fun outputReceiveBonusNumber() = println(strings.OUTPUT_RECEIVE_BONUS_NUMBER)

    fun outputWinningStatistics() = println(strings.OUTPUT_WINNING_STATISTICS)

    fun outputRateOfReturn(rate: Float) = println(strings.OUTPUT_RATE_OF_RETURN.format(rate))

    private fun outputBlankLine() = println()
}