package ru.netology

fun main() {
    val sumLastBuy = 45_000_00f  //сумма предыдущей покупки в копейках
    val sumBuy = 20000f   //сумма текущей покупки в копейках
    val standDiscount = 100_00 // стандартная скидка
    val percentDiscount = 0.05f //5% скидка
    val regularCustomer = false //признак постоянного покупателя
    val percentDiscountRegularCustomer = 0.01f //1% скидка для постоянного покупателя

    var result = sumBuy
    if (sumLastBuy> 100_000 && sumLastBuy <= 1_000_000) {
        result = if (sumBuy > standDiscount) sumBuy - standDiscount else 0f
    } else if (sumLastBuy > 1_000_000 ) {
        result = sumBuy - sumBuy * percentDiscount
    }
    if (regularCustomer) {
        result = result - result * percentDiscountRegularCustomer
    }
    result = result/100

    print("Сумма покупки $result рублей")
}