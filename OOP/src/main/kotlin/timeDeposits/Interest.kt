package timeDeposits

import java.time.LocalDate

data class Interest(
    private val amount: Int,
    private var paymentDate: LocalDate
)