package org.example

class PixPayment(
    val key: String
) : IPaymentType {
    override fun pay(amount: Double) {
        println("Pagando R$ $amount via PIX para a chave $key")
    }
}