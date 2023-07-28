package screen

import data.Product

class ShoppingProductList {

    private val products = arrayOf(
        Product("패션", "겨울 패딩"),
        Product("패션", "겨울 바지"),
        Product("전자기기", "핸드폰"),
        Product("전자기기", "노트북"),
        Product("반려동물용품", "건식사료"),
        Product("반려동물용품", "습식사료"),
        Product("반려동물용품", "치약"),
    )

    private val categories: Map<String, List<Product>> = products.groupBy { product ->
        product.categoryLabel
    }

    fun showProducts(selectedCategory: String){
        val categoryProducts = categories[selectedCategory]
        if (!categoryProducts.isNullOrEmpty()){
            println("""
                ***========================***
                선택하신 [$selectedCategory] 카테고리 상품입니다.
                """.trimIndent())
            val productSize = categoryProducts.size
            for(index in 0 until productSize){
                println("${index + 1}. ${categoryProducts[index].name}")
            }
        } else{
            showEmptyProductMessage(selectedCategory)
        }
    }

    private fun showEmptyProductMessage(selectedCategory: String) {
        println("선택하신 카테고리가 없습니다.")
    }
}
