# Interface, Abstract Class의 차이

## default method

> **디폴트 메소드는 왜 생겼을까 ?**
> 

- Java 8버전 이전의 Interface는 추상 메소드만 가질 수 있었다.
- 인터페이스에 `default method`가 생긴 이유는 이전에 존재하던 인터페이스를 구현하는 클래스에 **영향을 주지 않고 새로운 메소드를 추가할 수 있도록** 하기 위해서 생겼다.

### ex)

```java
public interface CircleInterface {
	boolean isValid(String color);
}

public class CircleInterfaceImpl_A implements CircleInterface {

	public boolean isValid(String color) {
			// ... 생략
	}
}

public class CircleInterfaceImpl_B implements CircleInterface {

	public boolean isValid(String color) {
			// ... 생략
	}
}
```

예를 들어 `CircleInterface` 를 구현하는 `CircleInterfaceImpl A와 B Class`가 있다고 할 때

`CircleInterface` 에 구현되지 않은 추상메소드가 추가된다면 A, B 구현체 모두 추가된 추상 메소드를 구현해야 한다. 만약 구현체가 100개라면 100개의 구현체를 모두 수정해야 한다.

구현체가 구현하지 않아도 되는 `default method`는 기존 인터페이스에 새로운 메소드를 추가하여 **기능의 확장을 이루면서도 하위호환이 가능하게 한다.** 이전 버전의 코드를 변경하지 않고도 새로운 기능을 추가할 수 있다.

## Interface vs Abstract Class

> Java 8부터 추가된 ***Interface***의 `default mehtod`로 인해 ***Abstract Class***와의 차이가 불분명하다고 생각되어 차이점을 정리하는 시간을 갖는다.
> 

### 상태

클래스가 갖추어야 하는것은 상태와 행위이다.

추상 클래스는 추상화 되어있지만 상태를 가질 수 있고 추상클래스에 구현된 method는 추상클래스의 상태에 접근할 수 있다.

반면에 인터페이스는 상태를 가질 수 없다. `default method`로 인해서 구현된 메소드를 가질 수 있지만 상태가 없기 때문에 상태에 접근할 수 없다.

상태를 가지는 구현체를 통해서 상태에 접근할 수 있다.

### 생성자

추상 클래스는 생성자를 가질 수 있으므로 생성 시 상태를 초기화할 수 있다.

반면에 인터페이스는 생성자를 가질 수 없다.

### Lambda

추상 클래스는 람다식을 사용할 수 없지만 인터페이스는 람다식을 참조할 수 있다.

<aside>
💡 인터페이스는 단 하나의 추상 메소드를 가지고 있으면 해당 메소드를 람다식으로 사용할 수 있음.
컴파일 타임에 람다식으로 사용할 수 있는 인터페이스인지 검증하려면
`@FunctionalInterface` annotation을 달아주면 된다 !

</aside>