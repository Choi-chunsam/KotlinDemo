package coffeeshop

class Menu(
    val menuItems: List<MenuItem> =
        listOf(
            MenuItem("아메리카노", 2000),
            MenuItem("카페라떼",3500),
            MenuItem("녹차라떼",4000)
        )
) {


    fun choose(menuName: String): MenuItem{
        return menuItems.find { menuItem -> menuName == menuItem.name }!!
    }
}