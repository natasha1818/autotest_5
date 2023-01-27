package ru.netology

import calculationAmount
import org.junit.Assert.*
import org.junit.Test
import transferPayment

class Test {

       @Test
    fun transferPaymentVKPay() {
        val amount = 1000
        val typeCard = "VK Pay"
        val amountOfTransfer = 0

        val result = transferPayment(amount,typeCard,amountOfTransfer)
        assertEquals(1000,result)
    }
    @Test
    fun transferPaymentVisa() {
        val amount = 10
        val typeCard = "Visa"
        val amountOfTransfer = 0

        val result = transferPayment(amount,typeCard,amountOfTransfer)
        assertEquals(0,result)
    }
    @Test
    fun transferPaymentMir() {
        val amount = 80000
        val typeCard = "Visa"
        val amountOfTransfer = 0

        val result = transferPayment(amount,typeCard,amountOfTransfer)
        assertEquals(80600,result)
    }
    @Test
    fun transferPaymentMasterCardNull() {
        val amount = 1000
        val typeCard = "MasterCard"
        val amountOfTransfer = 0

        val result = transferPayment(amount,typeCard,amountOfTransfer)
        assertEquals(1000,result)
    }
    @Test
    fun transferPaymentMasterCard() {
        val amount = 1000
        val typeCard = "MasterCard"
        val amountOfTransfer = 80000

        val result = transferPayment(amount,typeCard,amountOfTransfer)
        assertEquals(1026,result)
    }
    @Test
    fun transferPaymentMaestroNull() {
        val amount = 80000
        val typeCard = "Maestro"
        val amountOfTransfer = 0

        val result = transferPayment(amount,typeCard,amountOfTransfer)
        assertEquals(80500,result)
    }
    @Test
    fun transferPaymentMaestro() {
        val amount = 35000
        val typeCard = "Maestro"
        val amountOfTransfer = 60000

        val result = transferPayment(amount,typeCard,amountOfTransfer)
        assertEquals(35230,result)
    }
    @Test
    fun calculationAmount() {
        val amount = 0
        val amountOfTransfer = 60000

        val result = calculationAmount(amount,amountOfTransfer)
        assertEquals(0,result)

        }

}