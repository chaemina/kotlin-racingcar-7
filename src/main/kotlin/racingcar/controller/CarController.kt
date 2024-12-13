package racingcar.controller

import racingcar.model.Car
import racingcar.utils.calculator

class CarController(
  private val carList: String,
) {
  fun createCar(): List<Car> {
    val carList = calculator(carList)
    val cars = carList.map { Car(it) }
    return cars
  }
}
