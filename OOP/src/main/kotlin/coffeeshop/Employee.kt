package coffeeshop

class Employee {

    fun takeOrder(orderItem: MenuItem,baristar: Baristar): Coffee{
        println("직원이 주문을 받습니다.")
        return baristar.makeCoffee(orderItem)
    }
}