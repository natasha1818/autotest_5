fun main() {
}

fun calculationAmount(amount: Int, amountOfTransfer: Int): Int {
    val totalAmount = amount + amountOfTransfer
    var commission = amount * 0.006 + 20
    val totalSum = amount + commission
    when (totalAmount) {
        in 0..74_999 -> return amount
        else -> return totalSum.toInt()
    }
}

fun calculationAmountMirAndVisa(amount: Int): Int {
    if (amount < 35) {
        return 0
    } else {
        val commission = amount * 0.0075
        val totalAmountMir = amount + commission
        return totalAmountMir.toInt()

    }
}

fun transferPayment(amount: Int, typeCard: String, amountOfTransfer: Int): Int {
    return when (typeCard) {
        "Maestro", "MasterCard" -> calculationAmount(amount, amountOfTransfer)
        "Mir", "Visa" -> calculationAmountMirAndVisa(amount)
        else -> amount

    }
}