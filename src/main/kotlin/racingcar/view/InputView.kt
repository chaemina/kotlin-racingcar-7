package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.utils.Validator

class InputView {
  fun getUserInput(): String {
    val carList = Console.readLine() ?: ""
    return carList
  }

  fun getAttempts(): Int {
    val attempts = Console.readLine()?.toIntOrNull() ?: 0
    return attempts
  }
}