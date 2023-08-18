package coffeeshop

class Customer{

    fun order(menuName: String, menu: Menu, employee: Employee){
        println("직원에게 ${menuName}을 주문합니다.")
        val chooseItem = menu.choose(menuName)
        val coffee = employee.takeOrder(chooseItem, Baristar())
        println("주문하신 ${coffee.name} 나왔습니다.")
    }
}