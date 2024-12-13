package racingcar.controller

import camp.nextstep.edu.missionutils.Randoms
import racingcar.model.Car
import racingcar.view.OutputView

class RacingGame(
  private val cars: List<Car>,
  private val attempts: Int,
  private val outputView: OutputView
) {

  fun start() {
    repeat(attempts) {
      race(cars)
      printProgress(cars)
    }
    printWinner(cars)
  }

  fun race(cars: List<Car>) {
    cars.map {
      val num = Randoms.pickNumberInRange(0, 9)
      it.increase(num)
    }
  }

  fun printProgress(cars: List<Car>) {
    cars.map { outputView.printProgress(it.name, it.count) }
    outputView.printEmpty()
  }

  fun printWinner(cars: List<Car>) {
    val max = cars.map { it.count }.max()
    val winners = cars.filter { it.count == max }.joinToString(",") { it.name }
    outputView.printResult(winners)
  }
}