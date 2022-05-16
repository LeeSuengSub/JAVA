## 컬렉션 프레임워크

---

### 제네릭(Generic) 프로그래밍

---

- 변수의 선언이나 메소드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형을 변환 될 수 있도록 프로그래밍 하는 방식
- 실제 사용되는 참조 자료형으로의 변환은 컴파일러가 검증하므로 안정적인 프로그래밍 방식
- 컬렉션 프레임워크에서 많이 사용되고 있음

### 제네릭 클래스 정의하기

---

- 여러 참조 자료형으로 대체 될수 있는 부분을 하나의 문자로 표현
- 이 문자를 자료형 매개변수라고 함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(112).png>)

### TreeMap 클래스 사용 예

---

- TreeSet클래스와 같이 필요한 경우 Comparable 혹은 Comparator를 구현함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(113).png>)

### TreeMap 클래스

---

- key 객체를 정력하여 key-value를 pair로 관리하는 클래스
- key에 사용되는 클래스에 Comparable, Comparator 인터페이스를 구현
- java에 많은 클래스들은 이미 Comparable이 구현되어 있음
- 구현된 클래스를 key로 사용하느 경우는 구현할 필요 없음

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(114).png>)

### 자료형 매개 변수 T

---

- type의 의미로 T를 많이 사용함
- `<T>`에서 <>는 다이아몬드 연산자라고 함
- static 키워드는 T에 사용할 수 없음
- `ArrayList<String> list = new ArrayList<>();`
  다이아몬드 연산자 내부에서 자료형은 생략 가능함
- 제네릭에서 자료형 추론(자바 10부터)

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(115).png>)

### 제네릭 클래스 사용하기

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(116).png>)

- T로 정의한 부분에 사용할 참조 자료형을 넣어서 클래스 생성  
   getMaterial()메소드가 호출될때 따라 강제 형변환을 하지 않아도 됨

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(117).png>)

### 제네릭 클래스 사용 예제

---

Powder 클래스 정의하기

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(118).png>)

Plastic 클래스 정의하기

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(119).png>)

GenericPrint<T> 클래스 정의하기

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(120).png>)

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(121).png>)

### 제네릭에서 대입된 자료형을 명시하지 않는 경우

---

- `GenericPrinter<Powder>`와 같이 사용할 자료형 (Powder)를 명시해야 함
- 자료형을 명시하지 않고 사용할 수 있음 이런 경우 자료형을 명시하라는 경고 표시가 나타남
- 반환 형에 따라 강제 형 변환을 해야 함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(122).png>)

### <T extends 클래스>

---

- T가 사용될 클래스를 제한하기 위해 사용

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(123).png>)

- material에서 상속받지 않은 Water 와 같은 클래스는 프린터 재료로 사용할 수 없음
- Material에 정의된 메소드를 공유 할 수 있음

### 자료형 매개변수가 두 개인 경우

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(124).png>)

### 제네릭 메소드 활용하기

---

- 메소드의 매개변수를 자료형 매개변수로 사용하느 경우
- 자료형 매개 변수가 하나 이상인 경우
- 제네릭 메소드의 일반 형식

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(125).png>)

### 제네릭 메소드 구현하기

---

- 사각형의 너비를 구하는 메소드
- 두 점의 위치가 여러 자료형으로 사용되는 경우

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(126).png>)

### 제네릭 메소드 사용하기

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(127).png>)

## 컬렉션 프레임워크 - ArrayList

---

### 컬렉션 프레임워크

---

- 프로그램 구현에 필요한 자료구조(Data Structure)를 구현해 놓은 라이브러리
- java.util 패키지에 구현되어 있음
- 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
- 여러 인터페이스와 구현 클래스 사용 방법을 이해해야 함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(128).png>)

### collection 인터페이스

---

- 하나의 객체를 관리하기 위한 메소드가 선언된 인터페이스
- 하위에 List와 Set 인터페이스가 있음
- 여러 클래스들이 Collection 인터페이스를 구현함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(129).png>)

- Collection 인터페이스에 선언된 주요 메소드

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(130).png>)

### Map 인터페이스

---

- 쌍(pair)로 이루어진 객체를 관리하는데 사용
- key-value 의 쌍으로 이루어짐
- key는 중복 될 수 없음
- 여러 클래스들이 Map 인터페이스를 구현함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(131).png>)

- Map 인터페이스에 선언된 주요 메소드

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(132).png>)

### List 인터페이스

---

- Collection 하위 인터페이스
- 객체를 순서에 따라 저장하고 관리하는데 필요한 메소드가 선언된 인터페이스
- 배열의 기능을 구현하기 위한 인터페이스
- ArrayList, Vector, LinkedList 등이 많이 사용 됨

### ArrayList와 Vector

---

- 객체 배열을 구현한 클래스
- Vector는 자바2부터 제공된 클래스
- 멀티 쓰레드 상태에서 리소스에 대한 동기화가 필요한 경우 Vector를 사용
- 일반적으로 ArrayList를 더 많이 사용함
- ArrayList에 동기화 기능이 추가되어야 하는 경우

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(133).png>)

- 공기화(synchronization) : 두 개의 쓰레드가 동시에 하나의 리소스에 접근 할 때 순서를 맞추어서 데이터에 오류가 발생하지 않도록 함

### LinkedList 클래스

---

- 논리적으로 순차적인 자료구조가 구현된 클래스
- 다음 요소에 대한 참조값을 가지고 있음

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(134).png>)

- 요소의 추가 / 삭제에 드는 비용이 배열보다 적음

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(135).png>)

## 컬렉션 프레임워크 - Stack, Queue, HashMap

---

### Stack 과 Queue

---

- Stack과 Queue의 기능은 구현된 클래스가 있지만 ArrayList나 LinkedList를 활용하여서 사용할 수도 있음
- Stack : Last in First Out(LIFO)
  - 맨 마지막에 추가된 요소가 먼저 꺼내지는 자료구조  
    게임의 무르기 기능, 최근 자료 추출등에서 사용

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(136).png>)

- Queue : First In First Out (FIFO)
- 먼저 저장된 자료가 먼저 꺼내지는 선착순, 대기열구조

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(137).png>)

### Iterator 사용하여 순회하기

---

- Collection의 개체를 순회하는 인터페이스
- iterator()메소드 호출

```
Iterator ir = memberArrayList.iterator();
```

- 선언된 메소드

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(138).png>)

### Iterator 사용하여 순회하기 예

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(139).png>)

### Set 인터페이스

---

- Collection 하위의 인터페이스
- 중복을 허용하지 않음
- 아이디, 주민번호, 사번 등 유일한 값이나 객체를 관리할 때 사용
- List는 순서기반의 인터페이스지만, Set은 순서가 없음
- 저장된 순서와 출력순서는 다를 수 있음
- get(i)메소드가 제공되지 않음

## 컬렉션 프레임워크 - TreeSet, HashMap, TreeMap

---

### TreeSet 클래스

---

- 객체의 정렬에 사용되는 클래스
- 중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬함
- 내부적으로 이진 검색 트리(binary search tree)로 구현되어 있음
- 이진 검색 트리에 자료가 저장될 때 비교하여 저장될 위치를 정함
- 객체 비교를 위해 Comparable이나 Comparator 인터페이스를 구현 해야 함

### Comparable 인터페이스와 Comparator 인터페이스

---

- 정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
- Comparable은 comparaTo() 메소드를 구현  
  매개변수와 객체 자신(this)를 비교
- Comparator는 Compare()메소드를 구현
  두 개의 매개 변수를 비교
  TreeSet생성자에 Comparator가 구현된 객체를 매개변수로 전달

```
TreeSet<Member> treeSet = new TreeSet<Member>(new Member( ));
```

- 일반적으로 Comparable을 더 많이 사용
- 이미 Comparable이 구현된 경우 Comparator를 이용하여 다른 정렬 방식을 정의 할 수 있음

### Comparable 인터페이스 구현 예

---

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(140).png>)

### Map 인터페이스

---

- key-value pair의 객체를 관리하는데 필요한 메소드가 정의됨
- key는 중복 될 수 없음
- 검색을 위한 자료 구조
- key를 이용하여 값을 저장하거나 검색, 삭제 할때 사용하면 편리함
- 내부적으로 hash방식으로 구현됨

```
index = hash(key) // index는 저장 위치
```

- key가 되는 객체는 객체의 유일성함의 여부를 알기 위해 equals()와 hashCode() 메소드를 재정의 함

### HashMap 클래스

---

- Map 인터페이스를 구현한 클래스 중 가장 일반적으로 사용하는 클래스
- HashTable 클래스는 자바2 부터 제공된 클래스로 Vector 처럼 동기화를 제공함
- 여러 메소드를 활용하여 pair자료를 쉽고 빠르게 관리할 수 있음

### HashMap 클래스 사용 예

---

- 객체 추가 하고 검색하여 삭제하기

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(141).png>)

- 객체 순회하기
- itrator() 메소드는 하나의 Collection 객체만을 반환하므로 pair로 이루어진 객체는 각각 순회해야 함

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(142).png>)

### TreeMap클래스

---

- key객체를 정렬하여 key-value를 pair로 관리하는 클래스
- key에 사용되는 클래스에 Comparable, Comparator인터페이스를 구현
- java에 많은 클래스들은 이미 Comparable이 구현되어 있음
- 구현된 클래스를 key로 사용하는 경우는 구현할 필요 없음

![](<./%EC%82%AC%EC%A7%84_%EC%9E%90%EB%A3%8C/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7(143).png>)
