package coffeeshop

class Baristar {

    fun makeCoffee(menuItem: MenuItem): Coffee{
        println("바리스타가 ${menuItem.name}를 만듭니다.")
        return Coffee(menuItem.name)
    }
}