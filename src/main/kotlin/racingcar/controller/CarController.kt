package racingcar.controller

import racingcar.model.Car
import racingcar.utils.calculator

class CarController(
  private val carList: String,
) {
  fun createCar(): List<Car> {
    val carList = carList
    val cars = calculator(carList).map { Car(it) }
    return cars
  }
}
