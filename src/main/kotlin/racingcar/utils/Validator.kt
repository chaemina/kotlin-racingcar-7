package racingcar.utils

import racingcar.model.Car

object Validator {

  fun validateNameLength(cars: String) {
    require(cars.split(",").all { it.length <= 5 }) { showError("이름은 5자 이하로 입력해야합니다.") }
  }

  fun showError(message: String): Nothing {
    println("[ERROR] $message")
    throw IllegalArgumentException(message)
  }
}