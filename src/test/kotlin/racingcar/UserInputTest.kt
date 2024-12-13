package racingcar

import camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import racingcar.controller.CarController

class UserInputTest {
  private lateinit var carController: CarController

  @Test
  fun `사용자가 입력한 내용으로 자동차 클래스를 생성한다`() {
    carController = CarController("Car1,Car2")
    val result = carController.createCar()

    assertThat(result).hasSize(2)
    assertThat(result[0].name).isEqualTo("Car1")
    assertThat(result[1].name).isEqualTo("Car2")
  }

  @Test
  fun `자동차 이름은 5자 이하여야 한다`() {
    carController = CarController("Car1, Car23456")
    assertDoesNotThrow {
      carController.createCar()
    }
  }
}