
public class GenericDemo {
	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(5);    int result = car.getValue();
		Car<Double> car1 = new Car<Double>(5.5);	double result2 = car.getValue();
		Car<String> car2 = new Car<String>("Hello");	Stringw result3 = car.getValue();	
	}
}

class Car<T> {
	private T value;
	
	public Car(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
