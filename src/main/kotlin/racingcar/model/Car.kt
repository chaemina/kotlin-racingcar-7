package racingcar.model

data class Car(val name: String){
		var count : Int = 0;

		fun increase(num: Int) {
				if (num >= 4) count++
		}
}