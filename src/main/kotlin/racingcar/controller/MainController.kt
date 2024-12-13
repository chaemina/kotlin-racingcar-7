package racingcar.controller

import racingcar.Constants
import racingcar.utils.Validator
import racingcar.view.InputView
import racingcar.view.OutputView

fun MainController() {
  val inputView = InputView()
  val outputView = OutputView()

  outputView.prompt(Constants.PROMPT1)
  var carList = inputView.getUserInput()

  try {
    Validator.validateNameLength(carList)
  } catch (e: IllegalArgumentException) {
    outputView.prompt(Constants.PROMPT1)
    carList = inputView.getUserInput()
  }

  val carController = CarController(carList)
  val cars = carController.createCar()

  outputView.prompt(Constants.PROMPT2)
  val attempts = inputView.getAttempts()

  val racingGame = RacingGame(cars, attempts, outputView)
  racingGame.start()
}