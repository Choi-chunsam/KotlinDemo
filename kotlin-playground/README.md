# Variables

val: 변경불가능한 변수, immutable

var:변경 가능한 변수

## Types

Byte, Short, Int, Long 등등 Unsigned 빼고는 다 자바랑 같다.

## non-null, nullable

Non-null

- 변수에 null 할당을 허용하지 않는 타입

var appName: String = “Shoppi”

appName = null 안됨 이거

Nullable

- 변수에 null할당을 허용하는 타입

var userName: String? = “woong”

userName = null 이거 가능

# Null, Compiler

## operator

?.  : safaty call operator - nullable 타입 변수 속성에 접근 가능

## if, when

코틀린은 if를 반환하는 식으로 만들 수 있음

Elvis operator  ?:   - if식 대신에 사용가능

```kotlin
var userName = readLine()?: ""
//readLine()에서 입력한 값이 null이면 "" 반환 null이 아니면 입력받은 갑 반환

// not null assertion !! null일 가능성이 있어도 일단 컴파일 가능 그래서 NPE가능성 있음

var userName = String? = null
if(userName!!.isEmpty()){
	println("사용자 이름을 다시 입력해주세요")
}
```
when은 여러개의 브랜치로 조건식을 정의

enum + When 표현식은 else 브랜치 없이도 모든 조건 평가

타입 체크 operator is 또는 !is when절에서 is로 타입체크 끝나면 스마트 캐스트를 해준다.

타입 캐스트 operator  - as: unsafe cast operator, as?: Safe cast operator

## loop
```kotlin
//2차원 배열을 for문으로...
val matrix = arrayOf(
	intArrayOf(1,2,3),
	intArrayOf(4,5,6)
)
for (row in matrix) {
	for(col in row) {
		if (col == 2) break
		print("$col ")
	}
	println()
}
####출력값####
1
4 5 6
```

# 객체

```kotlin
class Product constructor(val categoryLabel: String)
class Product(val categoryLabel: String) //생성자의 종류가 한개만 있을 때는 이렇게 선언 가능

val product = Product("패션", "겨울 패딩")
```

## 클래스, 인터페이스

Any가 최상위 클래스

## 함수

특정 동작을 수행하는 묶음

선언 방식 : 중괄호, single expression

```kotlin
//중괄호 방식
fun sum(a: Int, b: Int): Int{
	return a + b
}
//single expression
fun sum(a: Int, b: Int): Int = a + b
```
배치 위치 : top-level / 클래스 멤버

## data class

데이터를 담는 용도의 클래스

equals, toString, hashCode 메서드를 작성하지않아도 알아서 작성해줌

보통 data의 변경을 하는 것을 막기위해 프로퍼티들을 val로 선언해주는 걸 추천함

## 가시성 변경자 - Packages

패키지 내부의 top-level 선언시 가시성 변경자에 따라 참조가능한 범위가 다름

public - 기본값 어느 위치에서든 참조가능

private - 선언한 파일 내부에서만 참조가능

internal - 같은 module 안에서만 참조가능

protected - 사용불가

## 가시성 변경자 - Class members

클래스 멤버의 가시성 변경자에 따라 참조가능한 범위가 다름

public - 기본값 어느 위치에서든 참조 가능

private - 선언한 class 내부에서만 참조 가능

internal - 같은 module안에서만 참조 가능

protected - private와 동일. + subclass 에서도 참조 가능
