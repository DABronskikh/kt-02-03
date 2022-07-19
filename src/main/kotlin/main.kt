fun main() {
    val amountPurchase = 1_500
    val regularCustomer = true
    var amountTotal = amountPurchase

    println("покупка - $amountPurchase ₽")
    if (amountPurchase in 1_001..10_000) {
        amountTotal -= 100
        println("После применения скидки в 100 ₽ - $amountTotal ₽")
    } else if (amountPurchase >= 10_001) {
        amountTotal -= amountTotal * 5 / 100
        println("После применения скидки в 5% - $amountTotal ₽")
    }

    if (regularCustomer) {
        amountTotal -= amountTotal * 1 / 100
        println("После применения скидки в 1% - $amountTotal ₽")
    }

    println("Итог: $amountTotal")
}
