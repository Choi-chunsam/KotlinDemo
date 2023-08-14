import timeDeposits.Account
import timeDeposits.InterestRate
import timeDeposits.TimeDeposit

fun main(args: Array<String>) {
    val timeDeposit = TimeDeposit(
        22,
        false,
        account = Account(
            "123",
            10000,
            InterestRate(0.02)
        ))

    println(timeDeposit.calculateInterest(22))
}