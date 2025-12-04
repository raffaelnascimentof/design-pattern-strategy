package org.example

class PaymentContext(
    private val strategy: IPaymentType
) {
    fun process(amount: Double) {
        strategy.pay(amount)
    }
}