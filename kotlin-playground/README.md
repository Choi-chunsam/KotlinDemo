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
