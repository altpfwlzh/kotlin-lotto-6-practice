package lotto

import lotto.controller.MainController
import lotto.misc.ExceptionHandler
import lotto.view.InputView
import lotto.view.OutputView

fun main() {
    runCatching {
        val mainController = MainController(InputView(), OutputView(), ExceptionHandler())
        mainController.run()
    }.onFailure {
        ExceptionHandler().printError(it.message)
    }
}
