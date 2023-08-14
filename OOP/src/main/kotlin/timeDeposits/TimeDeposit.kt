package timeDeposits

import java.time.LocalDate

class TimeDeposit(
    private val duration: Int,
    private val closed: Boolean,
    private val account: Account
) {

    fun calculateInterest(duration: Int): Interest = account.calculateInterest(duration)
}