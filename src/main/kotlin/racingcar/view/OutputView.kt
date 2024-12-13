package racingcar.view

import racingcar.Constants

class OutputView {
  fun prompt(msg: String) {
    println(msg)
  }

  fun printEmpty() {
    println("\n")
  }

  fun printProgress(car: String, count: Int) {
    println("${car} : ${Constants.DISTANCE.repeat(count)}")
  }

  fun printResult(car: String) {
    println("${Constants.PROMPT3} ${car}")
  }
}