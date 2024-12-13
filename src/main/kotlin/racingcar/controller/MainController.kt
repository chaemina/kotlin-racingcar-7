package racingcar.controller

import racingcar.Constants
import racingcar.view.InputView
import racingcar.view.OutputView

fun MainController() {
  val inputView = InputView()
  val outputView = OutputView()

  outputView.prompt(Constants.PROMPT1)
  val carList = inputView.getUserInput()
  val carController = CarController(carList)
  val cars = carController.createCar()

  outputView.prompt(Constants.PROMPT2)
  val attempts = inputView.getAttempts()

  val racingGame = RacingGame(cars, attempts, outputView)
  racingGame.start()
}