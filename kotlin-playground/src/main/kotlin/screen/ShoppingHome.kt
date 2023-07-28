package screen

class ShoppingHome {

    fun start(){
        showWelcomePage()

        showCategories()
    }

    private fun showWelcomePage() {
        println(
            """안녕하세요, Shoppi 에 오신 것을 환영합니다!
            |쇼핑을 계속 하시려면 이름을 입력햇주세요 :)
        """.trimMargin()
        )
        val inputName = readlnOrNull()
        println(
            """
            감사합니다. 반갑습니다, $inputName 님
            원하시는 카테고리를 입력해주세요.
            ***===============================***
            """.trimIndent()
        )
    }

    private fun showCategories(){
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }



}