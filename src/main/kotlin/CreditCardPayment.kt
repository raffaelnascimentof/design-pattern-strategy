package org.example

class CreditCardPayment(
    val cardNumber: String
) : IPaymentType {
    override fun pay(amount: Double) {
        println("Pagando R$ $amount via Cartão de Crédito ($cardNumber)")    }
}