import screen.ShoppingHome

/*
역할분리, 가독성 높이기
Step 1. main 함수 -> 클래스의 함수
Step 2. 화면별 클래습 분리
Step 3. 선택한 카테고리 상품 목록 표시
 */
fun main(args: Array<String>) {
    val shoppingHome = ShoppingHome()
    shoppingHome.start()
}