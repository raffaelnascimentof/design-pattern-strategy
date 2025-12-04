package org.example

fun main() {
    val amount = 150.00

    val pixContext = PaymentContext(PixPayment("nome@email.com"))
    pixContext.process(amount)

    val creditCardContext = PaymentContext(CreditCardPayment("1234-5678-9012-3456"))
    creditCardContext.process(amount)
}