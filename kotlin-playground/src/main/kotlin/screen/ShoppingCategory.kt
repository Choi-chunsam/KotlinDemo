package screen

class ShoppingCategory {

    fun showCategories() {
        val categories = arrayOf("패션", "전자기기", "반려동물용품")

        val basket = arrayListOf<String>()

        for (category in categories) {
            println(category)
        }
        println("=> 장바구니로 이동하시려면 #을 입력해주세요")
        var inputCategory = readLine()
        while (inputCategory.isNullOrBlank()) {
            println("값을 입력해주세요")
            inputCategory = readLine()
        }

        if (inputCategory == "#") {
            //TODO 1. 장바구니 이동
        } else {

            if(categories.contains(inputCategory)){
                // TODO 2. 카테고리 상품 목록 보여주기

            }else{
                // TODO 3. 카테고리 목록에 없는 값을 입력하는 경우
                showErrorMessage(inputCategory)
            }

        }
    }

    private fun showErrorMessage(inputCategory: String?) {
        println("${inputCategory}는 카테고리에 없습니다.")
        showCategories() //다시 입력하는게 ux적으로 좋다
    }
}