# 기본 클래스

---

## 기본 클래스(1)

---

### java.lang 패키지

---

- 프로그래밍시 import 하지 않아도 자동으로 import됨
- import java.lang.\*; 문장이 추가 됨
- 많이 사용하는 기본 클래스들이 속한 패키지
- String, Integer, System 등

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(85).png>)

### Object 클래스

---

- 모든 클래스의 최상위 클래스
- java.lang.Object 클래스
- 모든 클래스는 Object클래스에서 상속 받음
- 모든 클래스는 Object클래스의 메소드를 사용할 수 있음
- 모든 클래스는 Object클래스의 메소드 중 일부는 재정의 할 수 있음(final로 선언된 메소드는 재정의 할 수 없음)
- 컴파일러가 extends Object를 추가 함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(86).png>)

### Object 클래스 메소드

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(87).png>)

### toString() 메소드

---

- Object 클래스의 메소드  
  ![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(88).png>)
- 객체의 정보를 String으로 바꾸어서 사용할 때 많이 쓰임
- String 이나 Integer 클래스에는 이미 재정의 되어 있음
- String 은 문자열 반환
- Integer 는 정수 값 반환

#### String과 Integer의 toString() 메소드

---

- toString() 메소드가 재정의 되어 있음
- String은 문자열 반환
- Integer는 정수 값 반환

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(89).png>)

#### toString() 메소드 재정의하기

---

- 책의 제목과 번호를 반환 하도록 재정의

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(90).png>)

#### toString 메소드 재정의 테스트

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(91).png>)

### equals() 메소드

---

- 두 인스턴스의 주소 값을 비교하여 true/false를 반환
- 재정의 하여 두 인스턴스가 논리적으로 동일함의 여부를 반환
- 같은 학번의 학생인 경우 여러 인스턴스의 주소 값은 다르지만,
  같은 학생으로 처리해야 학점이나 정보 산출에 문제가 생기지 않으므로 이런 경우 equals()메소드를 재정의 함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(92).png>)

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(93).png>)

- studentLee 와 studentSang은 인스턴스는 다르지만 같은 학번의 같은 학생임
- 두 학생이 논리적으로 같다는 것을 구현해야 함

#### equals() 메소드 재정의 하기

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(94).png>)

#### String과 Integer의 equals() 메소드

---

- String은 같은 문자열의 경우 true를 반환
- Integer는 정수 값이 같은 경우 true를 반환

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(95).png>)

### hashCode() 메소드

---

- hash : 정보를 저장, 검색하기 위해 사용하느 자료구조
- 자료의 특정 값(키 값)에 대해 저장 위치를반환래주는 해시 함수를 사용함  
  ![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(96).png>)
- 해시 함수는 어떤 정보인가에 따라 다르게 구현됨
- hashCode()메소드는 인스턴스의 저장 주소를 반환함
- 힙 메모리에 인스턴스가 저장되는 방식이 hash
- hashCode()의 반환 값 : 자바 가상 머신이 저장한 인스턴스이 주소값을 10진수로 나타냄
- 서로 다른 메모리의 두 인스턴스가 같다면???
  - 재정의된 equals() 메소드의 값이 true
  - 동일한 hashCode() 반환 값을 가져야 함
- 논리적으로 동일함을 위해 equals()메소드를 재정의 하였다면  
  hashCode()메소드로 재정의하여 동일한 값이 반환 되도록 함
- String클래스 : 동일한 문자열 인스턴스에 대해 동일한 정수가 반환됨
- Integer 클래스 : 동일한 정수값의 인스턴스에 대해 같은 정수값이 반환됨

#### String과 Integer의 hashCode() 메소드

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(97).png>)

#### hashCode() 메소드 재정의 하기

---

- 같은 학생의 경우 같은 정수 값을 반환해야 하므로 학번을 반환 하도록 재정의 함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(98).png>)

### clone() 메소드

---

- 객체의 원본 복제하는데 사용하는 메소드
- 원본을 유지해 놓고 복사본을 사용할 때
- 기본 틀(prototype)을 두고 복잡한 생성과정을 반복하지 않고 복제
- clone()메소드를 사용하면 객체의 정보(멤버변수 값)가 같은 인스턴스가 또 생성되는 것이므로 객체지향 프로그램의 정보은닉, 객체 보호의 관점에서 위배될 수 있음
- 객체의 clone()메소드 사용을 허용한다는 의미로 cloneable인터페이스를 명시해줌

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(99).png>)

#### clone() 메소드 재정의하기

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(100).png>)

#### clone() 메소드 재정의 테스트하기

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(101).png>)

## 기본 클래스(2)

---

### String 클래스

---

- String을 선언하는 두 가지 방법  
  ![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(102).png>)

- 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 방법 두가지  
  ![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(103).png>)

#### String 클래스로 문자열 연결

---

- 한번 생성된 String값(문자열)은 불변(immutable)
- 두 개의 문자열을 연결하면 새로운 인스턴스가 생성됨
- 문자열 연결을 계속하면 메모리에 gabage가 많이 생길 수 있음

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(104).png>)

#### StringBuilder, StringBuffer 사용하기

---

- 내부적으로 가변적인 char[] 배열을 가지고 있는 클래스
- 문자열을 여러 번 연결하거나 변경할 때 사용하면 유용함
- 매번 새로 생성하지 않고 기존 배열을 변경하므로 gabage가 생기지 않음
- StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(sybchronization)을 보장
- 단일 쓰레드 프로그램에서는 StringBuilder를 사용하기를 권장
- toString()메소드로 String반환

#### StringBuilder 테스트

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(105).png>)

#### StringBuilder 테스트

---

메모리 구조

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(106).png>)

### Wrapper 클래스

---

- 기본 자료형(primitive data type)에 대한 클래스  
  ![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(107).png>)

### 오토박싱(autoboxing)과 언박싱(unboxing)

---

- Integer는 객체이고, int는 4바이트 기본 자료형임
- 두 개의 자료를 같이 연산 할 때 자동으로 변환이 일어남

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(108).png>)

### Class 클래스

---

- 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일로 생성됨
- class 파일에는 객체의 정보(멤버변수, 메소드, 생성자등)가 포함되어 있음
- Class 클래스는 컴파일된 class 파일에서 객체의 정보를 가져올 수 있음

#### Class 클래스 가져오기

---

1. Object 클래스의 getClass() 메소드 사용하기

```
String s = new String();
Class c = s.getClass();//getClass()메소드의 반환형은 Class
```

2. 클래스 파일 이름을 Class 변수에 직접 대입하기

```
Class c = String Class;
```

3. Class.forName("클래스이름")메소드 사용하기

```
Clss c = Class.forName("java.lang.String");
```

#### Class 클래스 가져오기 예제

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(109).png>)

#### Class 클래스로 정보 가져오기

---

- reflection 프로그래밍 : Class클래스를 이용해서 클래스의 정보(생성자, 멤버변수, 메소드)를 가져오고 이를 활용하며 인스턴스를 생성하고, 메소드를 호출하는 등의 프로그래밍 방식
- 로컬 메모리에 객체가 없어서 객체의 데이터 타입을 직접 알 수 없는 경우(원격에 객체가 있는 경우등) 객체 정보만을 이용하여 프로그래밍 할 수있음.
- Constructor, Method, Filed 등 java.lang.reflect 패키지에 있는 클래스들을 활용하여 프로그래밍
- 일반적으로 자료형을 알 수 있는 경우에는 사용하지 않음

#### Class 클래스 메소드 활용하기 예제

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(110).png>)

#### newInstance() 메소드

---

- Class 클래스메소드
- new 키워드를 사용하지 않고 클래스 정보를 활용하여 인스턴스를 생성하는 메소드

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(111).png>)

#### Class.forName() 메소드로 동적 로딩 하기

---

- 동적 로딩이란? 컴파일시에 데이터 타입이 모두 biding 되어 자료형이 로딩되는 것(static loding)이 아니라 실행중에 데이터 타입을 알고 biding되는 방식
- 프로그래밍 할 때는 어떤 클래스를 사용할지 모를 때 변수로 처리하고 실행될 때 해당 변수에 대입된 값의 클래스가 실행될 수 있도록 Class클래스에서 제공하느 static메소드
- 실행 시에 로딩되므로 경우에 따라 다른 클래스가 사용될 수 있어 유용함
- 컴파일 타임에 체크 할 수 없으므로 해당 문자열에 대한 클래스가 없는 경우 예외(ClassNotFoundException)이 발생할 수 있음

```
String className = "classex.Person"
Class pClass = Class.forName(className);
```
