package timeDeposits

class Account(
    private val accountNumber: String,
    private val amount: Int,
    private val interestRate: InterestRate
) {
    fun calculateInterest(duration: Int): Interest = interestRate.createInterest(duration, amount)
}
