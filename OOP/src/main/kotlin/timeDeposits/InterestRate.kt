package timeDeposits

import java.time.Duration
import java.time.LocalDate

class InterestRate(
    private val rate: Double
) {

    fun createInterest(duration: Int, accountAmount: Int): Interest {
        val interestAmount = (duration * accountAmount * rate).toInt()
        return Interest(interestAmount, LocalDate.of(2022,10,25))
    }
}